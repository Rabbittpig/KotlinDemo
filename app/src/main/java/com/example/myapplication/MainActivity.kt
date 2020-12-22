package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_first.setOnClickListener {
            /*   //方式一
               val intent = Intent(this,SecondActivity::class.java)
               intent.putExtra("name","lisa")
               intent.putExtra("age",18)
               startActivity(intent)*/
            //方式二
            Intent(this, SecondActivity::class.java).apply {
//                putExtra("name", "David")
//                putExtra("age", 22)
                putExtra("user",User())
                startActivity(this)
            }
        }
    }
}