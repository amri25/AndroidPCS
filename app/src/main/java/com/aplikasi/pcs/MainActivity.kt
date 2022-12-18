package com.aplikasi.pcs


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
//import  android.widget.Button
import  android.widget.EditText
import  android.widget.TextView


class MainActivity : AppCompatActivity() {
    var input1: EditText? = null
    var input2: EditText? = null
    var output: TextView? = null
    var v1:Int? = null
    var v2:Int? = null
    var hasil:Int?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        input1 = findViewById<View>(R.id.angkaPertama) as EditText
        input2 = findViewById<View>(R.id.angkaKedua) as EditText
        output = findViewById<View>(R.id.hasil) as TextView
    }

    fun konver(){
        v1 = input1!!.text.toString().toInt()
        v2 = input2!!.text.toString().toInt()
    }

    fun prosestambah(view: View){
        konver()
        hasil = v1!! + v2!!
        output!!.text = java.lang.Integer.toString(hasil!!)
    }
}