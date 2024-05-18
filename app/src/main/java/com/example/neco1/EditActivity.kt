package com.example.neco1

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.neco1.databinding.ActivityEditBinding
import com.example.neco1.databinding.ActivityMainBinding

class EditActivity : AppCompatActivity() {
    lateinit var binding: ActivityEditBinding
    private var indexImage = 0
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
            if (indexImage > imageList.size-1) indexImage = 0
            Log.d("MyLog","indexImage $indexImage")
        }
    }
}