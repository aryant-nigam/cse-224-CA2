package com.example.ca2_cse224_aryantnigam_11901811

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class SetB_Q2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.setb_q2)
        var rg_gender   =   findViewById<RadioGroup>(R.id.rg_gender)
        var cb_java    =    findViewById<CheckBox>(R.id.cb_java)
        var cb_flutter   =   findViewById<CheckBox>(R.id.cb_flutter)
        var cb_kotlin   =  findViewById<CheckBox>(R.id.cb_kotlin)

        rg_gender.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { group, checkedId ->
            val selectedRadio: RadioButton = group.findViewById(checkedId)
           Toast.makeText(applicationContext,selectedRadio.text.toString(),Toast.LENGTH_SHORT).show()

        })

        cb_java.setOnClickListener(){
            if(cb_java.isChecked)
                Toast.makeText(applicationContext,cb_java.text.toString(),Toast.LENGTH_SHORT).show()
        }

        cb_flutter.setOnClickListener(){
            if(cb_flutter.isChecked)
                Toast.makeText(applicationContext,cb_flutter.text.toString(),Toast.LENGTH_SHORT).show()
        }

        cb_kotlin.setOnClickListener(){
            if(cb_kotlin.isChecked)
                Toast.makeText(applicationContext,cb_kotlin.text.toString(),Toast.LENGTH_SHORT).show()
        }


    }
}