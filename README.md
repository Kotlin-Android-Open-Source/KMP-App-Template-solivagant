# Kotlin Compose Multiplatform app template

[![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Build Android and Desktop CI](https://github.com/hoc081098/KMP-Compose-App-Template-solivagant/actions/workflows/gradle.yml/badge.svg)](https://github.com/hoc081098/KMP-Compose-App-Template-solivagant/actions/workflows/gradle.yml)
[![Hits](https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https%3A%2F%2Fgithub.com%2Fhoc081098%2FKMP-App-Template-solivagant&count_bg=%2379C83D&title_bg=%23555555&icon=&icon_color=%23E7E7E7&title=hits&edge_flat=false)](https://hits.seeyoufarm.com)

This is a basic Kotlin Compose Multiplatform app template for Android, iOS, and Desktop.
It includes shared business logic and data handling, and a shared UI implementation using Compose Multiplatform.

![Screenshots of the app](images/screenshots.png)

<p align="center">

<img src="images/desktop_01.png" height="400" />

<img src="images/desktop_02.png" height="400" />
  
</p>

### Technologies

The data displayed by the app is from [The Metropolitan Museum of Art Collection API](https://metmuseum.github.io/).

The app uses the following multiplatform dependencies in its implementation:

- [Compose Multiplatform](https://jb.gg/compose) for UI
- [Ktor](https://ktor.io/) for networking
- [kotlinx.serialization](https://github.com/Kotlin/kotlinx.serialization) for JSON handling
- [Kamel](https://github.com/Kamel-Media/Kamel) for image loading
- [Koin](https://github.com/InsertKoinIO/koin) for dependency injection
- [Solivagant](https://github.com/hoc081098/solivagant) for type-safe navigation, ViewModel, SavedStateHandle, Lifecycle, Multi-Backstacks, Transitions, Back-press handling.

### How
See https://github.com/hoc081098/KMP-App-Template-solivagant/compare/0afc98f07be28ffc92a91ef9198c1e36e2f80374...b67c85134392debd4fe4988fee0e5b30312e8f0a
