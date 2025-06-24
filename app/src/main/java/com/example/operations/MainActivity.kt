package com.example.operations

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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

        val number1 = findViewById<EditText>(R.id.numEt1)
        val number2 = findViewById<EditText>(R.id.numEt2)
        val add = findViewById<Button>(R.id.addBtn)
        val result = findViewById<TextView>(R.id.resetBtn)

        add.setOnClickListener {
            val num1:Int = number1.text.toString().toInt()
            val num2:Int= number2.text.toString().toInt()

            val sum:Int = num1 + num2
            result.text = sum.toString()

        }
    }
}