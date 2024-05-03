package com.hoc081098.kmpapp.screens.detail

import com.hoc081098.kmp.viewmodel.SavedStateHandle
import com.hoc081098.kmp.viewmodel.ViewModel
import com.hoc081098.kmpapp.data.MuseumRepository
import com.hoc081098.solivagant.navigation.NavEventNavigator
import com.hoc081098.solivagant.navigation.requireRoute
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn

class DetailScreenViewModel(
    museumRepository: MuseumRepository,
    savedStateHandle: SavedStateHandle,
    private val navigator: NavEventNavigator,
) : ViewModel() {
    private val route = savedStateHandle.requireRoute<DetailScreenRoute>()

    val objectStateFlow = museumRepository
        .getObjectById(route.objectId)
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), null)

    fun navigateBack() = navigator.navigateBack()
}
