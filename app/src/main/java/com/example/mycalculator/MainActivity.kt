package com.example.mycalculator

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var tvResult:
            TextView
    private var input = ""
    private var operator = ""
    private var firstNumber = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        tvResult = findViewById(R.id.result)
        val oneBtn:Button = findViewById(R.id.oneBtn)
        val addBtn:Button = findViewById(R.id.addBtn)
        val equalBtn:Button = findViewById(R.id.equalBtn)

        //add number
        oneBtn.setOnClickListener {
            input += "1"
            tvResult.text = input
        }

        //add operator
         addBtn.setOnClickListener {
             firstNumber = input.toDoubleOrNull()?:0.0
             operator = "+"
             input = ""
         }

        //equal
        equalBtn.setOnClickListener {
            val secondNumber = input.toDoubleOrNull()?:0.0
            val rslt =when(operator){
                "+" -> firstNumber + secondNumber
                else -> 0.0
            }
            tvResult.text = rslt.toString()
            input =""
        }


    }
}