package com.example.neco1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.neco1.databinding.ActivityMainBinding

/*напечатать и передать сообщение
* в другую активити
* и в другой активити набрать и послать обратно*/

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        val message = intent.getStringExtra("key")
        bindingClass.tvMessageMain.text = message
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 100 && resultCode == RESULT_OK && data != null) {
            //bindingClass.tvMessageMain.text = data.getStringExtra("key2")
            bindingClass.edQuest.setText(data.getStringExtra("key2"))
        }
    }

    fun onClickTest(view: View) {
        var quest = bindingClass.edQuest.text
        Log.e("MyLog", quest.toString())
        val i = Intent(this, TestActivity::class.java)
        i.putExtra("key", quest)
        startActivityForResult(i, 100)
    }
}

