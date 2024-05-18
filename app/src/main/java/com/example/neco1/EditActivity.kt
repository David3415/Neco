package com.example.neco1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.neco1.databinding.ActivityEditBinding
import com.example.neco1.databinding.ActivityMainBinding

class EditActivity : AppCompatActivity() {
    lateinit var binding: ActivityEditBinding
    private var indexImage = 0
    private var imageId: Int = R.drawable.plant1
    private val imageList = listOf(
        R.drawable.plant1,
        R.drawable.plant2,
        R.drawable.plant3,
        R.drawable.plant4,
        R.drawable.plant5
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityEditBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initButtons()
    }

    private fun initButtons() = with(binding) {
        bNext.setOnClickListener {
            indexImage++
            if (indexImage > imageList.size - 1) indexImage = 0
            imageId = imageList[indexImage]
            imageView2.setImageResource(imageId)
            //  Log.d("MyLog","indexImage $indexImage")
        }
        bDone.setOnClickListener {
            val plant = Plant(imageId, edTitle.text.toString(), edDesc.text.toString())
            val editIntent = Intent().apply {
                putExtra("plant", plant)

            }
            setResult(RESULT_OK, editIntent)
            finish()
        }
    }
}