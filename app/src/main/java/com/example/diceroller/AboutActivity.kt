package com.example.diceroller

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.diceroller.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding
    private lateinit var imm: InputMethodManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_about)
        imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        binding.apply {
            doneButton.setOnClickListener {
                nameText.text = binding.nicknameEdit.text
                nicknameEdit.text.clear()
                nameText.visibility = View.VISIBLE
                imm.hideSoftInputFromWindow(nameText.windowToken, 0)
            }
        }
    }
}