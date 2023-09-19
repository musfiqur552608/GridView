package org.freedu.gridviewdemo

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

        courseList.add(Model("Kotlin", R.drawable.facebook))
        courseList.add(Model("Java", R.drawable.facebook))
        courseList.add(Model("Python", R.drawable.facebook))
        courseList.add(Model("ProLog", R.drawable.facebook))
        courseList.add(Model("C#", R.drawable.facebook))
        courseList.add(Model("C++", R.drawable.facebook))

        val adapter = Adapter(this, courseList)
        gridView.adapter = adapter
    }
}