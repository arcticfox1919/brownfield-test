package com.example.rnapp

import android.app.Application
import com.callstack.reactnativebrownfield.OnJSBundleLoaded
import com.callstack.reactnativebrownfield.ReactNativeBrownfield
import com.facebook.react.PackageList

object ReactNativeHostManager {
    fun initialize(application: Application, onJSBundleLoaded: OnJSBundleLoaded? = null) {
//        loadReactNative(application) // Only required if you're on RN version >= 0.80.0

        val packageList = PackageList(application).packages
        ReactNativeBrownfield.initialize(application, packageList, onJSBundleLoaded)
    }
}