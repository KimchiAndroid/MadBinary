package com.example.mi_yeon.madbinary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Number Button
        btn1.setOnClickListener{input_text.setText(btn1.text.toString() + input_text.text.toString())}
        btn2.setOnClickListener{input_text.setText(btn2.text.toString() + input_text.text.toString())}
        btn3.setOnClickListener{input_text.setText(btn3.text.toString() + input_text.text.toString())}
        btn4.setOnClickListener{input_text.setText(btn4.text.toString() + input_text.text.toString())}
        btn5.setOnClickListener{input_text.setText(btn5.text.toString() + input_text.text.toString())}
        btn6.setOnClickListener{input_text.setText(btn6.text.toString() + input_text.text.toString())}
        btn7.setOnClickListener{input_text.setText(btn7.text.toString() + input_text.text.toString())}
        btn8.setOnClickListener{input_text.setText(btn8.text.toString() + input_text.text.toString())}
        btn9.setOnClickListener{input_text.setText(btn9.text.toString() + input_text.text.toString())}
        btn0.setOnClickListener{input_text.setText(btn0.text.toString() + input_text.text.toString())}

        btn_remove.setOnClickListener{
            var str = input_text.text.toString();
            if(str.isNotEmpty()){
                input_text.setText(str.slice(IntRange(0, str.length-1)));
            }
        }

    }
}
