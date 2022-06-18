package com.example.csibackendapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AddNewMemberII : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_new_member_ii)

        val IIbtn = findViewById<Button>(R.id.SecondYear)
        val IIIbtn = findViewById<Button>(R.id.ThirdYear)
        val IVbtn = findViewById<Button>(R.id.FourthYear)
        val Passoutsbtn = findViewById<Button>(R.id.PassOuts)

        IIbtn.setOnClickListener(){
            val year = IIbtn.text.toString()
            nextActivity(year)
        }
        IIIbtn.setOnClickListener(){
            val year = IIIbtn.text.toString()
            nextActivity(year)
        }
        IVbtn.setOnClickListener(){
            val year = IVbtn.text.toString()
            nextActivity(year)
        }
        Passoutsbtn.setOnClickListener(){
            val year = Passoutsbtn.text.toString()
            nextActivity(year)
        }

    }

    fun nextActivity(str: String){
        val intent = Intent(this, EditIII::class.java).apply {
            putExtra("Year",str)
        }
        startActivity(intent)
    }
}