package com.hoc081098.kmpapp

import android.app.Application
import com.hoc081098.kmpapp.di.initKoin

class MuseumApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}
