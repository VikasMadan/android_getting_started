package com.example.vmadan.myfirstapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView

/**
 * Created by vmadan on 3/3/18.
 */

class MyFirstKotlin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextView = this.findViewById<TextView>(R.id.myTextView)
        myTextView.text = "My name is Vikas"

        val myButton = this.findViewById<Button>(R.id.myButton)
        myButton.setOnClickListener { myTextView.text = "Hello World !" }
    }
}
