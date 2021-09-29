package com.example.amaal_almutairi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var name:EditText
    lateinit var lname:EditText
    lateinit var Toa:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.name)
        lname = findViewById(R.id.Mob)
        Toa = findViewById(R.id.b1)

        Toa.setOnClickListener {
            Toast.makeText(this, "${name.text} ${lname.text}", Toast.LENGTH_SHORT).show()
        }
    }

}