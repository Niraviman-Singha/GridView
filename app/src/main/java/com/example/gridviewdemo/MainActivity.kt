package com.example.gridviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class MainActivity : AppCompatActivity() {
    private lateinit var gridView: GridView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.gridView)
        val courseList:ArrayList<Model> = ArrayList<Model>()

        courseList.add(Model("Rust", R.drawable.rust))
        courseList.add(Model("Kotlin", R.drawable.kotlin))
        courseList.add(Model("Java", R.drawable.java2))
        courseList.add(Model("Python", R.drawable.python2))
        courseList.add(Model("SQL", R.drawable.sql))
        courseList.add(Model("C#", R.drawable.csharp))
        courseList.add(Model("Ruby", R.drawable.ruby))
        courseList.add(Model("Dart", R.drawable.dart))
        courseList.add(Model("Lisp", R.drawable.lisp))
        courseList.add(Model("C++", R.drawable.c_plus))
        courseList.add(Model("HTML", R.drawable.html))
        courseList.add(Model("PHP", R.drawable.php))


        val adapter = Adapter(this, courseList)
        gridView.adapter = adapter


    }
}