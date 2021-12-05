package com.example.day3_task331

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val userClick=findViewById<Button>(R.id.checkbutton)
        val userGuess=findViewById<TextInputLayout>(R.id.userGuessNumber)
        var view=findViewById<TextView>(R.id.Result)
        val num= Random.nextInt(0,1000)

        userClick.setOnClickListener{
            val enteredNumber=userGuess.editText?.text?.toString()
            try {
                view.setText("")
                val check = if (enteredNumber.isNullOrEmpty()) 0
                else enteredNumber.toInt()
                if(check==num){
                    view.text="You are right"
                }
                else if(check<num){
                    view.text="No, the number is bigger"
                }
                else
                    view.text="No, the number is smaller"

            }
            catch (e:Exception){
                view.setText("Please Enter a number")
            }

        }


    }
}