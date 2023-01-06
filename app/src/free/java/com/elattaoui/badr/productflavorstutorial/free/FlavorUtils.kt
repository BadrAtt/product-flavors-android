package com.elattaoui.badr.productflavorstutorial.free

import android.util.Log
import com.elattaoui.badr.productflavorstutorial.BuildConfig

class FlavorUtils {
    companion object {
        fun printFlavorName() {
            Log.d("FlavorUtils", BuildConfig.FLAVOR)
        }
    }
}
