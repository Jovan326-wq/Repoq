package com.example.a2701

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val etInputA = findViewById<EditText>(R.id.etInputA)
        val resTV = findViewById<TextView>(R.id.resTV)
        findViewById<Button>(R.id.clearbtn).setOnClickListener {
            etInputA.setText("")
            resTV.text = "Результат: "
        }
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
        findViewById<Button>(R.id.calcbtn).setOnClickListener {
            val a = etInputA.text.toString().toDouble()
            val w = 4 * a
            resTV.text = "Результат: " + w
            data1.res = w
        }
    }

    object data1 {
        var res: Double = 0.0
    }
}
