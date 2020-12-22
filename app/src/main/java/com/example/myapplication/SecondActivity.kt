package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        // as转成所传对象类型(类型转换)
//        val user = intent.getSerializableExtra("user") as User
        val user = intent.getParcelableExtra<User>("user") as User
        tv_content.text = user.name
        tv_age.text = user.age.toString()
//        val name = intent.extras?.getString("name")
        /*val name = intent.getStringExtra("name")
        tv_content.text=name
        tv_age.text=intent.getIntExtra("age",0).toString()*/

    }
}