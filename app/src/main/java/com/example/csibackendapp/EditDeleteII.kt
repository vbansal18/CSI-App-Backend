package com.example.csibackendapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.nio.file.Files.delete
import java.sql.Types.NULL

class EditDeleteII : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_delete_ii)
        val choice = intent.getStringExtra(value)


        val btn = findViewById<Button>(R.id.EditDeleteButton).apply {
            text = choice
        }

        btn.setOnClickListener(){
            val studentNo = findViewById<EditText>(R.id.StudentNumber).editableText.toString()
            if(studentNo.isEmpty()){
                val toast = Toast.makeText(applicationContext, "Student Number is Empty", Toast.LENGTH_LONG)
                toast.show()
            }
            else if(studentNo.length < 6 || studentNo.length > 8 || studentNo.toIntOrNull()==null){
                val toast = Toast.makeText(applicationContext, "Student Number is Invalid", Toast.LENGTH_LONG)
                toast.show()
            }
            else {
                if(choice=="Edit") {
                    val intent = Intent(this, EditIII::class.java).apply {
                        putExtra("Student Number",studentNo)
                    }
                    startActivity(intent)
                }
                else if(choice=="Delete"){
                    delete(studentNo)
                }
            }
        }

    }

    private fun delete(str : String){
        Toast.makeText(applicationContext, "Deleted", Toast.LENGTH_SHORT).show()
    }
}