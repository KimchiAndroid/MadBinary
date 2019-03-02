package com.example.mi_yeon.madbinary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mode = 10
        // Number Button
        btn1.setOnClickListener{input_text.setText(input_text.text.toString() + btn1.text.toString())}
        btn2.setOnClickListener{input_text.setText(input_text.text.toString() + btn2.text.toString())}
        btn3.setOnClickListener{input_text.setText(input_text.text.toString() + btn3.text.toString())}
        btn4.setOnClickListener{input_text.setText(input_text.text.toString() + btn4.text.toString())}
        btn5.setOnClickListener{input_text.setText(input_text.text.toString() + btn5.text.toString())}
        btn6.setOnClickListener{input_text.setText(input_text.text.toString() + btn6.text.toString())}
        btn7.setOnClickListener{input_text.setText(input_text.text.toString() + btn7.text.toString())}
        btn8.setOnClickListener{input_text.setText(input_text.text.toString() + btn8.text.toString())}
        btn9.setOnClickListener{input_text.setText(input_text.text.toString() + btn9.text.toString())}
        btn0.setOnClickListener{input_text.setText(input_text.text.toString() + btn0.text.toString())}

        // Text Control
        input_text.inputType = 0 // unable to write by keyboard
        output_text.inputType = 0

        btn_remove.setOnClickListener{
            var str = input_text.text.toString()
            if(str.isNotBlank()){
                input_text.setText(str.slice(IntRange(0, str.length - 2)))
            }
        }


        // Convert input value to hex value
        input_text.addTextChangedListener(object : TextWatcher{
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (!s.isNullOrBlank()) {
                    try{
                        output_text.setText(s.toString().toLong(10).toString(16).toUpperCase())
                        // output_text.setText(s.toString().toLong(10).toString(8).toUpperCase())
                        // output_text.setText(s.toString().toLong(10).toString(2).toUpperCase())
                    } catch(e : Exception){ //
                        output_text.setText(e.toString())
                    }
                }
                else {
                    output_text.setText("")
                }
            }
            override fun afterTextChanged(s: Editable?) {
                // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
               // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })

        // Function Control

        btn_reverse.setOnClickListener{
            var str = input_text.text.toString()
            if(str.isNotBlank()){
                if(str.toLong() > 0)
                    input_text.setText("-" + str.slice(IntRange(0, str.length - 2)))
                else
                    input_text.setText(str.slice(IntRange(0, str.length - 2)))
            }
        }
    }
}
