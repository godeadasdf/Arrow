package com.example.kangning.arrow

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import arrow.core.Id
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text.text = operation_Id() + ""
    }



}

private operator fun Int.plus(s: String): CharSequence? {
    return toString() + s
}


