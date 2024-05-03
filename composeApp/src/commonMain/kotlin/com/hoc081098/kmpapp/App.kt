package com.hoc081098.kmpapp

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.hoc081098.kmpapp.screens.detail.DetailScreenRoute
import com.hoc081098.kmpapp.screens.list.ListScreenRoute
import com.hoc081098.solivagant.navigation.NavHost
import kotlinx.collections.immutable.adapters.ImmutableSetAdapter
import org.koin.compose.KoinContext
import org.koin.compose.koinInject

@Composable
fun App(modifier: Modifier = Modifier) {
    KoinContext {
        MaterialTheme {
            NavHost(
                modifier = modifier,
                startRoute = ListScreenRoute,
                destinations = remember {
                    setOf(
                        ListScreenRoute.Destination,
                        DetailScreenRoute.Destination,
                    ).let(::ImmutableSetAdapter)
                },
                navEventNavigator = koinInject(),
                destinationChangedCallback = {},
            )
        }
    }
}
