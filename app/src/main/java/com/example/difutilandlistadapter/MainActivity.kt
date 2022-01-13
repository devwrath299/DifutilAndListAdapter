package com.example.difutilandlistadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rview=findViewById<RecyclerView>(R.id.recycle)
        var adapte=Adapter()

        var a=Items(1,"j","Java")
        var b=Items(1,"k","Kotlin")
        var c=Items(1,"r","Ruby")

        adapte.submitList(listOf(a,b,c))
        rview.layoutManager=LinearLayoutManager(this)
        rview.setHasFixedSize(true)
        rview.adapter=adapte

        Handler(Looper.getMainLooper()).postDelayed({

            var a=Items(1,"j","Java")
            var b=Items(1,"k","Kotlin")
            var c=Items(6,"f","c#")
            adapte.submitList(listOf(a,b,c))

        },4000)
    }
}