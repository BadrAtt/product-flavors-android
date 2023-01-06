package com.elattaoui.badr.productflavorstutorial

import android.util.Log

class FlavorUtils {
    companion object {
        fun printFlavorName() {
            Log.d("FlavorUtils", BuildConfig.FLAVOR)
        }
    }
}
