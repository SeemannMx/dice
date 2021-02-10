package com.example.diceroller

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var diceImage: ImageView
    private lateinit var rollButton: Button
    private lateinit var navButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton = findViewById(R.id.roll_button)
        diceImage = findViewById(R.id.dice_image)
        navButton = findViewById(R.id.navigate_button)

        rollButton.setOnClickListener {
            rollDice()
        }

        navButton.setOnClickListener {
            navigate()
        }
    }

    private fun navigate() {
        val i = Intent(this, AboutActivity::class.java)
        startActivity(i)
    }

    private fun rollDice() {
        diceImage.setImageResource(
            when (Random.nextInt(6) + 1) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
        )
    }
}