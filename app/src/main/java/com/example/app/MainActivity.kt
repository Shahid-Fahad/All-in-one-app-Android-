package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.app.databinding.ActivityMainBinding
import com.example.app.databinding.ActivityCalculatorBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCalc.setOnClickListener {
            Intent(this, CalculatorActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.btnSentiment.setOnClickListener {
            Intent(this, SentimentActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.btntodo.setOnClickListener {
            Intent(this,TodoActivity::class.java).also {
                startActivity(it)
            }
        }


    }
}