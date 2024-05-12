package com.example.neco1

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.neco1.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {
   lateinit var bindingClass:ActivityTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass=ActivityTestBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val message = intent.getStringExtra("key")
        bindingClass.tvMessage.text=message

    }

   /* fun onClickBack(view: View) {
        intent.putExtra("key",bindingClass.edName.text.toString())
        setResult(RESULT_OK,intent)

    }*/

}