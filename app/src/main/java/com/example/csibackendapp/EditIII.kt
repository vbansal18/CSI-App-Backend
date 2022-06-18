package com.example.csibackendapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class EditIII : AppCompatActivity() {
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_iii)
        val year = intent.getStringExtra("Year")
        val stud = intent.getStringExtra("Student Number")
        val name = findViewById<EditText>(R.id.name)
        val facebook = findViewById<EditText>(R.id.fb)
        val instagram = findViewById<EditText>(R.id.instagram)
        val linkedin = findViewById<EditText>(R.id.linkedin)
        val github = findViewById<EditText>(R.id.github)
        val studentNo = findViewById<EditText>(R.id.studentNo)
        val editBtn = findViewById<Button>(R.id.edit)

        if(year!=null){
            editBtn.text = "Add"
        }
        if(stud!=null){
                studentNo.setText(stud)
                studentNo.keyListener=null
        }

        editBtn.setOnClickListener(){
            if(studentNo.editableText.toString().isEmpty() ){
                studentNo.setError("This field is required")
            }
            else if(studentNo.editableText.toString().length < 6 || studentNo.editableText.toString().length > 8 || studentNo.editableText.toString().toIntOrNull()==null){
                studentNo.setError("Invalid Student Number")
            }

            if(name.editableText.toString().isEmpty() ){
                name.setError("This field is required")
            }

            if(facebook.editableText.toString().isEmpty()){
                facebook.setError("This field is required")
            }
            else if(!facebook.editableText.toString().endsWith(".com")){
                facebook.setError("Invalid URL")
            }

            if(instagram.editableText.toString().isEmpty()){
                instagram.setError("This field is required")
            }
            else if(!instagram.editableText.toString().endsWith(".com")){
                instagram.setError("Invalid URL")
            }

            if(linkedin.editableText.toString().isEmpty()){
                linkedin.setError("This field is required")
            }
            else if(!linkedin.editableText.toString().endsWith(".com")){
                linkedin.setError("Invalid URL")
            }

            if(github.editableText.toString().isEmpty()){
                github.setError("This field is required")
            }
            else if(!github.editableText.toString().endsWith(".com")){
                github.setError("Invalid URL")
            }
            else{
                Toast.makeText(applicationContext, "fine", Toast.LENGTH_SHORT).show()
            }
        }


    }
    

}