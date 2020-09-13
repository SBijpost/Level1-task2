package com.sem.lvl1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sem.lvl1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initBinds()
    }

    private fun initBinds() {
        binding.btnSubmit.setOnClickListener {
           checkAnswers()
        }
    }

    private fun checkAnswers() {
        var ans1 = binding.et1.text.toString()
        var ans2 = binding.et2.text.toString()
        var ans3 = binding.et3.text.toString()
        var ans4 = binding.et4.text.toString()

        if (ans1 == "T") {
            if (ans2 == "F") {
                if (ans3 == "F") {
                    if (ans4 == "F") {
                        Toast.makeText(this, "Correct!", Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(this, "Incorrect!", Toast.LENGTH_LONG).show()
                    }
                } else {
                    Toast.makeText(this, "Incorrect!", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(this, "Incorrect!", Toast.LENGTH_LONG).show()
            }
        } else {
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_LONG).show()
        }

    }

}