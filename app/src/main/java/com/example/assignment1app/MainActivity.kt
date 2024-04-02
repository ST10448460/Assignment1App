package com.example.assignment1app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isInvisible
import androidx.lifecycle.viewmodel.CreationExtras
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {

    private val famousPeople: HashMap<Int, String> = HashMap()

    init {
        famousPeople.put(52, "William Shakespeare")
        famousPeople.put(60, "Mahatma Gandhi")
        famousPeople.put(64, "Albert Einstein")
        famousPeople.put(69,"Leonardo da Vinci")
        famousPeople.put(63, "Thomas Edison")
        famousPeople.put(76, "Franklin D. Roosevelt")
        famousPeople.put(66, "Charles Darwin")
        famousPeople.put(84, "Pablo Picasso")
        famousPeople.put(74, "Alexander Graham Bell")
        famousPeople.put(95, "Nelson Mandela")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val age = findViewById<EditText>(R.id.edtAge)
        val btnCompute = findViewById<Button>(R.id.btnCompute)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val txtAnswer = findViewById<TextView>(R.id.txtAnswer)

        btnCompute.setOnClickListener {

            val age = age.text.toString().toIntOrNull()
            var ageInt = when {
                age in (20..30) -> "there are no historical figures that fall in this age."
                age in (40..49) -> "there are no historical figures that fall in the age."
                age in (50..59) -> "William Shakespeare died on the 23 April 1616 at the age of 52, he was an english playwright, poet and actor."
                age in (60..62) -> "Mahatma Gandhi was assassinated on the 30 january 1948 at the age of 60, he was an indian lawyer and political ethicist."
                age in (62..64) -> "Albert Einstein died on the 18 April 1955 at the age of 64, he was a german born theoretical physicist."
                age in (61..63) -> "Thomas Edison died on the 18 october 1931 at the age of 63, he was a american inventor and businessman."
                age in (63..66) -> "Charles Darwin died on the 19 April 1882 at the age of 66, he was a english naturalist, geologist and biologist."
                age in (66..69) -> "Leonardo da Vinci died on 2 may 1519 at the age of 69, he was a italian polymath of the high renaissance who was a painter,draughtsman and engineer."
                age in (69..74) -> "Alexander Graham Bell died on the 2 august 1922 at the age of 74, he was a scottish born canadian american inventor scientist and engineer."
                age in (74..76) -> "Franklin d. Roosevelt died on the 12 april 1945 at the age of 76, he was a american statesman and politician who served as the 32nd president of united states"
                age in (76..91) -> "Pablo Picasso died on the 8 april 1973 at the age of 91, he was a spanish painter, sculptor, print maker, ceramicist and theatre designer."
                age in (85..94) -> "Nelson Mandela died on the 5 december 2013 at the age of 94, he was a south african anti apartheid activist politician and statesman who served as the first president of south africa from 1994 to 1999."

                else -> {
                    "The age you entered is an invalid format"
                }

            }
            txtAnswer.text = "$ageInt"
            if (age != null) {
                txtAnswer.setText("$ageInt: $age")
            } else {
                txtAnswer.setText("$ageInt")
            }

        } 

        btnClear.setOnClickListener{
            age.setText("")
            txtAnswer.text = ""
        }

    }
}






