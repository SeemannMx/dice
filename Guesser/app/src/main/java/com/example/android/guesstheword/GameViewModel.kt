package com.example.android.guesstheword

import android.util.Log
import androidx.lifecycle.ViewModel
import timber.log.Timber

class GameViewModel : ViewModel() {

    init {
        Log.i(this.javaClass.name, "GameViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()

        Log.i(this.javaClass.name, "onCleared - GameViewModel destroyed!")
    }
}