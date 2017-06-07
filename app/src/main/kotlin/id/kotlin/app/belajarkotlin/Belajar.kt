package id.kotlin.app.belajarkotlin

import android.app.Application
import android.content.Context
import android.support.multidex.MultiDex

class Belajar : Application() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(base)
    }
}