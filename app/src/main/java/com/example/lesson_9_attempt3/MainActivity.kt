package com.example.lesson_9_attempt3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var recycleView1:RecyclerView? = null
    private var recycleView2:RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleView1 = findViewById(R.id.recycleView1)
        val list = arrayListOf<String>()
        for (i in 0..100){
            list.add("Jules Winnfield $i")
        }
        val adapter1 = Adapter1(list)
        recycleView1?.adapter = adapter1

        recycleView2 = findViewById(R.id.recycleView2)
        val list2 = arrayListOf<String>()
        for (i in 0..100){
            list2.add("Quentin Tarantino $i")
        }
        val adapter2 = Adapter2(list2)
        recycleView2?.adapter = adapter2



    }
}