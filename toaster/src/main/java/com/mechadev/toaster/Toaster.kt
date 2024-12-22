package com.mechadev.toaster

import android.content.Context
import android.widget.Toast

open class Toaster {
    open fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}