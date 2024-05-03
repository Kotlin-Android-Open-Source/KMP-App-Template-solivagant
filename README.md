# Kotlin Compose Multiplatform app template

[![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

This is a basic Kotlin Compose Multiplatform app template for Android, iOS, and Desktop.
It includes shared business logic and data handling, and a shared UI implementation using Compose Multiplatform.

![Screenshots of the app](images/screenshots.png)

### Technologies

The data displayed by the app is from [The Metropolitan Museum of Art Collection API](https://metmuseum.github.io/).

The app uses the following multiplatform dependencies in its implementation:

- [Compose Multiplatform](https://jb.gg/compose) for UI
- [Ktor](https://ktor.io/) for networking
- [kotlinx.serialization](https://github.com/Kotlin/kotlinx.serialization) for JSON handling
- [Kamel](https://github.com/Kamel-Media/Kamel) for image loading
- [Koin](https://github.com/InsertKoinIO/koin) for dependency injection
- [Solivagant](https://github.com/hoc081098/solivagant) for type-safe navigation, ViewModel, SavedStateHandle, Lifecycle, Multi-Backstacks, Transitions, Back-press handling.
