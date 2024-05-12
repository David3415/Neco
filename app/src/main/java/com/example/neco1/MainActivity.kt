package com.example.neco1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.neco1.constance.Constance
import com.example.neco1.databinding.ActivityMainBinding
import com.example.neco1.databinding.ActivityTestBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }

    fun onClickTest(view: View) {
        val i = Intent(this, TestActivity::class.java)
        i.putExtra("key", "Как зовут?")
        startActivity(i)
    }
}

