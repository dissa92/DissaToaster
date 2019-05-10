package com.example.dissatoast

import android.content.Context
import android.widget.Toast

class DissaToast {
    public fun show(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}