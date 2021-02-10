package com.example.diceroller

import android.content.Context
import android.content.Intent

class Helper {
    fun navigate(from: Context) {
        val i = Intent(from, MainActivity::class.java)
        from.startActivity(i)
    }
}

