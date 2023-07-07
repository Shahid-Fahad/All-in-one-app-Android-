package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import com.example.app.databinding.ActivityMainBinding
import com.example.app.databinding.ActivityCalculatorBinding

class CalculatorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.add.setOnClickListener  {
            if((!TextUtils.isEmpty(binding.fn.toString()))&&(!TextUtils.isEmpty(binding.sn.text.toString()))) {
                val fn = binding.fn.text.toString().toInt()
                val sn = binding.sn.text.toString().toInt()
                val rs = (fn + sn).toString()
                binding.res.text = "Result : $rs"
                binding.fn.setText(rs)
                binding.sn.text.clear()
            }
        }

        binding.sub.setOnClickListener  {
            if((!TextUtils.isEmpty(binding.fn.toString()))&&(!TextUtils.isEmpty(binding.sn.text.toString()))) {
                val fn = binding.fn.text.toString().toInt()
                val sn = binding.sn.text.toString().toInt()
                val rs = (fn - sn).toString()
                binding.res.text = "Result : $rs"
                binding.fn.setText(rs)
                binding.sn.text.clear()
            }
        }
        binding.mul.setOnClickListener  {
            if((!TextUtils.isEmpty(binding.fn.toString()))&&(!TextUtils.isEmpty(binding.sn.text.toString()))) {
                val fn = binding.fn.text.toString().toInt()
                val sn = binding.sn.text.toString().toInt()
                val rs = (fn * sn)
                if ((rs / sn) != fn) {
                    binding.res.text = "OVERFLOW"
                    binding.fn.text.clear()
                    binding.sn.text.clear()

                } else {
                    binding.res.text = "Result : $rs"
                    binding.fn.setText(rs.toString())
                    binding.sn.text.clear()
                }
            }
        }
        binding.div.setOnClickListener  {
            if((!TextUtils.isEmpty(binding.fn.toString()))&&(!TextUtils.isEmpty(binding.sn.text.toString()))) {
                val fn = binding.fn.text.toString().toInt()
                val sn = binding.sn.text.toString().toInt()
                if (fn == 0) {
                    binding.res.text = "MATH ERROR"
                    binding.fn.text.clear()
                    binding.sn.text.clear()
                } else {
                    val rs = (fn / sn).toString()
                    binding.res.text = "Result : $rs"
                    binding.fn.setText(rs)
                    binding.sn.text.clear()
                }
            }
        }


        binding.clr.setOnClickListener {
            binding.res.text = "Result : "
            binding.fn.text.clear()
            binding.sn.text.clear()

        }
        binding.btnback.setOnClickListener {
            finish()
        }


    }
}