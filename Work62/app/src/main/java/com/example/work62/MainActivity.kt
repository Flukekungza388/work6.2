package com.example.work62

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var total0: TextView = findViewById(R.id.total)
        var gpa: TextView = findViewById(R.id.gpa)
        var subject1: EditText =findViewById(R.id.sub1)
        var subject2: EditText =findViewById(R.id.sub2)
        var subject3: EditText =findViewById(R.id.sub3)
        var subject4: EditText =findViewById(R.id.sub4)
        var subject5: EditText =findViewById(R.id.sub5)
        var cre1: EditText =findViewById(R.id.credit1)
        var cre2: EditText =findViewById(R.id.credit2)
        var cre3: EditText =findViewById(R.id.credit3)
        var cre4: EditText =findViewById(R.id.credit4)
        var cre5: EditText =findViewById(R.id.credit5)
        var point1: EditText =findViewById(R.id.point1)
        var point2: EditText =findViewById(R.id.point2)
        var point3: EditText =findViewById(R.id.point3)
        var point4: EditText =findViewById(R.id.point4)
        var point5: EditText =findViewById(R.id.point5)
        var btnok: Button =findViewById(R.id.ok)
        var btnclear: Button =findViewById(R.id.clear)
        btnok.setOnClickListener(){
            var sub1 = subject1.text.toString()
            var sub2 = subject2.text.toString()
            var sub3 = subject3.text.toString()
            var sub4 = subject4.text.toString()
            var sub5 = subject5.text.toString()
            var cre1 = cre1.text.toString()
            var cre2 = cre2.text.toString()
            var cre3 = cre3.text.toString()
            var cre4 = cre4.text.toString()
            var cre5 = cre5.text.toString()
            var poi1 = point1.text.toString()
            var poi2 = point2.text.toString()
            var poi3 = point3.text.toString()
            var poi4 = point4.text.toString()
            var poi5 = point5.text.toString()
            var total1 = 0.00
            var total2 = 0.00
            var total3 = 0.00
            var total4 = 0.00
            var total5 = 0.00
            var total = 0.000
            var totalcru =0.00
            if(sub1 == "" || sub2 == "" || sub3 == "" || sub4 == "" || sub5 == "" ||
                cre1 == "" || cre2 == "" || cre3 == "" || cre4 == "" || cre5 == "" ||
                poi1 == "" || poi2 == "" || poi3 == "" || poi4 == "" || poi5 == ""  ){
                val toast = Toast.makeText(applicationContext, "กรุณาใส่ข้อมูลให้ครบ", Toast.LENGTH_LONG)
                toast.show()
            }
            else{
                total1=cre1.toDouble()*poi1.toDouble()
                total2=cre2.toDouble()*poi2.toDouble()
                total3=cre3.toDouble()*poi3.toDouble()
                total4=cre4.toDouble()*poi4.toDouble()
                total5=cre5.toDouble()*poi5.toDouble()
                totalcru =cre1.toDouble()+cre2.toDouble()+cre3.toDouble()+cre4.toDouble()+cre5.toDouble()
                total = (total1+total2+total3+total4+total5)/totalcru
                total0.setText(totalcru.toString())
                gpa.setText(total.toString())
            }
        }
        btnclear.setOnClickListener(){
            total0.setText("")
            gpa.setText("")
            subject1.setText("")
            subject2.setText("")
            subject3.setText("")
            subject4.setText("")
            subject5.setText("")
            cre1.setText("")
            cre2.setText("")
            cre3.setText("")
            cre4.setText("")
            cre5.setText("")
            point1.setText("")
            point2.setText("")
            point3.setText("")
            point4.setText("")
            point5.setText("")
        }
    }
}