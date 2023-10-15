package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var output1: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        input()
    }
    private fun input(){
        output1 = findViewById<View>(R.id.content) as TextView
        val inputVal = findViewById<TextView>(R.id.input)
        val temp1 = inputVal.toString()
        val temp = Integer.parseInt(temp1)
//        val temp = inputVal.text.toString().toInt()
//
//        var temp = inputVal.text.toString()
//        output1!!.text = "this is your $temp "


        var button1 : Button = findViewById(R.id.celcius)
        button1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                celciusToFarenheit(temp)
            }
        })
    }

    private fun celciusToFarenheit(celciusTemp: Int) {
        val temp0 = celciusTemp * (9 / 5)
        val finalTemp = temp0 + 32
        output1!!.text = "this is your temp $finalTemp"
    }

    private fun farenheitToCelcius(farenheitTemp: Int) {
        val temp0 = farenheitTemp - 32
        val finalTemp = temp0 * (5 / 9)
        output1!!.text = "this is your temp: $finalTemp"
    }

}
