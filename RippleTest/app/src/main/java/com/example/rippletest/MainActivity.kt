package com.example.rippletest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_hello.setOnClickListener {
            tv_text.text = "Hello World 의 ripple 을 잘 보세요"
        }
        btn_reset.setOnClickListener {
            tv_text.text = ""
        }

    }
}