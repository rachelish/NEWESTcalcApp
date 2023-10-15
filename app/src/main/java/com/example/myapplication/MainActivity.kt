package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

//    private val output1 = findViewById<TextView>(R.id.content)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inputVal = findViewById<EditText>(R.id.input)


        val button1 = findViewById<Button>(R.id.celcius)
        val button2 = findViewById<Button>(R.id.farenheit)

        button1.setOnClickListener{

            val temp1 = inputVal.text.toString()

            val temp = temp1.toInt()
            celciusToFarenheit(temp)
        }
        button2.setOnClickListener{

            val temp1 = inputVal.text.toString()

            val temp = temp1.toInt()
            celciusToFarenheit(temp)
        }
    }



    private fun celciusToFarenheit(celciusTemp: Int) {
        val output1  = findViewById<TextView>(R.id.content)
        val temp0 = celciusTemp * (9 / 5)
        val finalTemp = temp0 + 32
        output1.text = "this is your temp $finalTemp"
    }

    private fun farenheitToCelcius(farenheitTemp: Int) {
        val output1  = findViewById<TextView>(R.id.content)
        val temp0 = farenheitTemp - 32
        val finalTemp = temp0 * (5 / 9)
        output1.text = "this is your temp: $finalTemp"
    }

}
