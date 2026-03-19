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
import kotlin.math.pow

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val etInputL = findViewById<EditText>(R.id.etInputL)
        val resTV1 = findViewById<TextView>(R.id.resTV1)
        val resTV2 = findViewById<TextView>(R.id.resTV2)

        findViewById<Button>(R.id.calcbtn).setOnClickListener {
            val PI = 3.14
            val l = etInputL.text.toString().toDouble()
            val r = l / 2 * PI
            val s = PI * r.pow(2)
            resTV1.text = "Радиус: " + r
            resTV2.text = "Площадь: " + s
            data2.res = r
            data3.res = s
        }
        findViewById<Button>(R.id.clearbtn).setOnClickListener {
            etInputL.setText("")
            resTV1.text = "Радиус: "
            resTV2.text = "Площадь: "
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
    }

    object data2 {
        var res: Double = 0.0
    }

    object data3 {
        var res: Double = 0.0
    }
}