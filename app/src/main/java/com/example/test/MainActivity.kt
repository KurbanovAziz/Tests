package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
    }

    private fun initClicker() {
        with(binding){
            val firstNum = firstEd.text.toString()
            val secondNum = secondEd.text.toString()
            val match = Match()
            okBtn.setOnClickListener {
                resultTv.text = match.add(firstNum,secondNum)
            }
            btnDivide.setOnClickListener {
                resultTv.text = match.divide(firstNum,secondNum)
            }
        }
    }
}