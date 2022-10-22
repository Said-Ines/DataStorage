package com.example.datastorage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.Toolbar

class MyCareer : AppCompatActivity() {
    lateinit var btnExperience:Button
    lateinit var btnEducation:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mycareer)
        val toolbar : Toolbar =findViewById(R.id.toolBar)
        setSupportActionBar(toolbar)

        btnExperience=findViewById(R.id.btnExperience)
        btnEducation=findViewById(R.id.btnEducation)
    }
}