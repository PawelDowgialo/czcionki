package com.example.czcionki

import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val sizeTextBox: TextView = findViewById(R.id.textSizeTextbox)
        val seekBar: SeekBar = findViewById(R.id.seekBar)
        val textChangingSize: TextView = findViewById(R.id.textSizeChanging)
        val applyButton:Button = findViewById(R.id.applySizeButton)
        var index = 1

        val wordsArray = arrayListOf("Dzień dobry", "Good morning",
            "Buenos dias")

        seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                sizeTextBox.text = progress.toString()
                textChangingSize.textSize = progress.toFloat()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }

        })

        applyButton.setOnClickListener {
            if (index == 3){
                index = 0
            }
            textChangingSize.text = wordsArray[index]
            index+=1
        }
    }
}