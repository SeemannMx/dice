package com.example.diceroller

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.diceroller.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding
    private lateinit var imm: InputMethodManager

    private val myName: MyName = MyName(nick = "John")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_about)
        imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        binding.myName = myName

        binding.apply {
            doneButton.setOnClickListener {
                nameText.text = nicknameEdit.text
                invalidateAll()
                nicknameEdit.text.clear()
                imm.hideSoftInputFromWindow(nameText.windowToken, 0)
            }

            backButton.setOnClickListener {
                val h:Helper = Helper()
                h.navigate(it.context)
            }
        }
    }
}

data class MyName(
    var nick:String = ""
)