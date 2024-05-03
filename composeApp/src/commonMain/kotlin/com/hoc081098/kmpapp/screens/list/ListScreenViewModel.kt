package com.hoc081098.kmpapp.screens.list

import com.hoc081098.kmp.viewmodel.ViewModel
import com.hoc081098.kmpapp.data.MuseumObject
import com.hoc081098.kmpapp.data.MuseumRepository
import com.hoc081098.kmpapp.screens.detail.DetailScreenRoute
import com.hoc081098.solivagant.navigation.NavEventNavigator
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

class ListScreenViewModel(
    museumRepository: MuseumRepository,
    private val navigator: NavEventNavigator,
) : ViewModel() {
    val objectsStateFlow: StateFlow<List<MuseumObject>> =
        museumRepository
            .getObjects()
            .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    fun navigateToDetailScreen(objectId: Int) = navigator.navigateTo(DetailScreenRoute(objectId))
}
