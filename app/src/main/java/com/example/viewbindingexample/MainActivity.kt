package com.example.viewbindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.viewbindingexample.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding= DataBindingUtil.setContentView(this.R.layout.activity_main)
    binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView( binding.root)


        binding.submitButton.setOnClickListener {
            displayGreeting()
        }



        }


    private fun displayGreeting() {
//        var edtittxt = findViewById<EditText>(R.id.name_edit_text)
//        var textView = findViewById<TextView>(R.id.greetin_text_view)
        binding.greetinTextView.text= "Your name is: ${binding.nameEditText.text}"


    }
    }


