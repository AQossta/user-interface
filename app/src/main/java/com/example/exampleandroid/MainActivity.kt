package com.example.exampleandroid

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exampleandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var editText1 = ""
        var editText2 = ""

        binding.btnSum.setOnClickListener {

            editText1 = binding.editTextNumber1.text.toString()
            editText2 = binding.editTextNumber2.text.toString()

            if (editText1 == "" || editText2 == ""){
                binding.tvResult.text = "Not found number at editText"
            }else{
                val result = editText1.toInt() + editText2.toInt()
                binding.tvResult.text = result.toString()
            }
        }

        binding.btnMinus.setOnClickListener {

            editText1 = binding.editTextNumber1.text.toString()
            editText2 = binding.editTextNumber2.text.toString()

            if (editText1=="" || editText2 == ""){
                binding.tvResult.text = "Not found number at editText"
            }else{
                val result = editText1.toInt() - editText2.toInt()
                binding.tvResult.text = result.toString()
            }
        }

        binding.btnMulti.setOnClickListener {

            editText1 = binding.editTextNumber1.text.toString()
            editText2 = binding.editTextNumber2.text.toString()

            if (editText1=="" || editText2 == ""){
                binding.tvResult.text = "Not found number at editText"
            }else{
                val result = editText1.toInt() * editText2.toInt()
                binding.tvResult.text = result.toString()
            }
        }

        binding.btnDiv.setOnClickListener {

            editText1 = binding.editTextNumber1.text.toString()
            editText2 = binding.editTextNumber2.text.toString()

            if (editText1=="" || editText2 == ""){
                binding.tvResult.text = "Not found number at editText"
            }else{
                val result = editText1.toInt() / editText2.toInt()
                binding.tvResult.text = result.toString()
            }
        }
    }
}










