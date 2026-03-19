package com.example.a2701

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val resTV1 = findViewById<TextView>(R.id.resTV1)
        val resTV2 = findViewById<TextView>(R.id.resTV2)
        val resTV3 = findViewById<TextView>(R.id.resTV3)
        resTV1.text = MainActivity1.data1.res.toString()
        resTV2.text =  MainActivity2.data2.res.toString()
        resTV3.text =  MainActivity2.data3.res.toString()

        findViewById<Button>(R.id.ex1btn).setOnClickListener {
            val intent = Intent(this, MainActivity1::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.ex2btn).setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.ex3btn).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}