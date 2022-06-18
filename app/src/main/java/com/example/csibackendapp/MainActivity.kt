package com.example.csibackendapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button


val value = "EditOrDelete"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val addMember = findViewById<Button>(R.id.new_member)
        val editMember = findViewById<Button>(R.id.edit_member)
        val deleteMember = findViewById<Button>(R.id.delete_member)

        addMember.setOnClickListener(){
            val intent = Intent(this, AddNewMemberII::class.java)
            startActivity(intent)
        }

        editMember.setOnClickListener() {
            val intent = Intent(this, EditDeleteII::class.java).apply {
                putExtra(value,"Edit")
            }
            startActivity(intent)
        }

        deleteMember.setOnClickListener(){
            val intent = Intent(this, EditDeleteII::class.java).apply {
                putExtra(value,"Delete")

            }
            startActivity(intent)
        }


    }
}