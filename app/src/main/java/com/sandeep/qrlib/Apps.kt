package com.sandeep.qrlib

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex


class Apps: Application() {
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}