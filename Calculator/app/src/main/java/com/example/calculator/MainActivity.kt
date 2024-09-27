package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var Num1:EditText?=null
    private var Num2:EditText?=null

    private var Add:Button?=null
    private var Sub:Button?=null
    private var Mul:Button?=null
    private var Results:TextView?=null
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContentView(R.layout.activity_main)
        Num1=findViewById<View>(R.id.eNum1) as EditText
        Num2=findViewById<View>(R.id.eNum2) as EditText
        Add=findViewById<View>(R.id.btnAdd) as Button
        Sub=findViewById<View>(R.id.btnSub) as Button
        Mul=findViewById<View>(R.id.btnMul) as Button
        Results=findViewById<View>(R.id.res) as TextView


        Add!!.setOnClickListener{
            val n1=Num1!!.text.toString().toInt()
            val n2=Num2!!.text.toString().toInt()
            val sum:Int
            sum=n1+n2
            Results!!.text="Results:$sum"
        }
        Sub!!.setOnClickListener{
            val n1=Num1!!.text.toString().toInt()
            val n2=Num2!!.text.toString().toInt()
            val sub:Int
            sub=n1-n2
            Results!!.text="Results:$sub"
        }
        Mul!!.setOnClickListener{
            val n1=Num1!!.text.toString().toInt()
            val n2=Num2!!.text.toString().toInt()
            val mul:Int
            mul=n1*n2
            Results!!.text="Results:$mul"
        }
    }
}