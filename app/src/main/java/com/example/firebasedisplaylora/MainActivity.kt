package com.example.firebasedisplaylora

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var edtName : EditText
    lateinit var edtEmail:EditText
    lateinit var edtAge:EditText
    lateinit var btnSubmit:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtName = findViewById(R.id.edt_name_main)
        edtEmail = findViewById(R.id.edt_email_main)
        edtAge = findViewById(R.id.edt_age_main)
        btnSubmit = findViewById(R.id.btn_submit_main)

        btnSubmit.setOnClickListener {
            var name = edtName.text.toString().trim()
            var email = edtEmail.text.toString().trim()
            var age = edtAge.text.toString().trim()

            var time_id = System.currentTimeMillis()

            //Progressbar
            var progress = ProgressDialog(this)
            progress.setTitle("Saving Data")
            progress.setMessage("Please Wait")

            //validateData
            if (name.isEmpty()||email.isEmpty()||age.isEmpty()){
                Toast.makeText(this, "Cannot Submit an empty field :(", Toast.LENGTH_SHORT).show()
            }else{
                //Proceed to upload data to firebase

            }

        }
    }
}