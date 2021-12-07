package com.example.practice20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var button: Button
    lateinit var textView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.EditText)
        button = findViewById(R.id.btn)
        textView=findViewById(R.id.result)
        button.setOnClickListener {
            var array = arrayListOf(1, 2, 3, 4)
            var symbols = editText.text.toString().toCharArray()
            textView.text= "${calculate(symbols, array)}"}
    }

    fun calculate(symbols: CharArray,array: ArrayList<Int>): Int {
        val firstIndex = 0
        val secondIndex = 1
        for (symbol in symbols) {

            val a = array[firstIndex]
            val b = array[secondIndex]

            val result= calculateBySymbol(symbol, a, b)

            array[firstIndex]= result
            array.removeAt(secondIndex)
        }
        return array[0]
    }

    fun calculateBySymbol(symbol: Char, firstNumber: Int, secondNumber: Int) : Int {
        when (symbol) {

       '+'-> return firstNumber + secondNumber
        '-'-> return firstNumber-secondNumber
        '*' -> return firstNumber * secondNumber
        '/' -> return firstNumber / secondNumber
        else-> return 0


        }
    }

    }

