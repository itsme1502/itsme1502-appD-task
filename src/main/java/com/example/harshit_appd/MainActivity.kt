package com.example.harshit_appd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.widget.TextViewOnReceiveContentListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn:Button=findViewById(R.id.button)
            btn.setOnClickListener(View.OnClickListener {
                Toast.makeText(this,"Hey Harshit,Go Corona Go",Toast.LENGTH_SHORT).show()
            })
        }

        }

