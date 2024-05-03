package com.hoc081098

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.hoc081098.kmpapp.App
import com.hoc081098.kmpapp.di.initKoin
import com.hoc081098.solivagant.lifecycle.LocalLifecycleOwner
import com.hoc081098.solivagant.navigation.ClearOnDispose
import com.hoc081098.solivagant.navigation.ExperimentalSolivagantApi
import com.hoc081098.solivagant.navigation.ProvideCompositionLocals
import com.hoc081098.solivagant.navigation.SavedStateSupport
import com.hoc081098.solivagant.navigation.rememberWindowLifecycleOwner

@OptIn(ExperimentalSolivagantApi::class)
fun main() {
    initKoin()
    val savedStateSupport = SavedStateSupport()

    application {
        savedStateSupport.ClearOnDispose()

        Window(
            onCloseRequest = ::exitApplication,
            title = "Solivagant",
        ) {
            savedStateSupport.ProvideCompositionLocals(LocalLifecycleOwner provides rememberWindowLifecycleOwner()!!) {
                App()
            }
        }
    }
}