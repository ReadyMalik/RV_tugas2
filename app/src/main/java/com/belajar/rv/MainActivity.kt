package com.belajar.rv

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass>
    lateinit var imageList: Array<Int>
    lateinit var titleList: Array<String>
    lateinit var dataNIM: Array<String>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageList = arrayOf(
            R.drawable.akbar,
            R.drawable.andin,
            R.drawable.aqmal,
            R.drawable.caca,
            R.drawable.deli,
            R.drawable.farhan,
            R.drawable.farhanz,
            R.drawable.fadlan,
            R.drawable.harry,
            R.drawable.paiz,
            R.drawable.raja,
            R.drawable.ready,
            R.drawable.tasya,
            R.drawable.yana,



            )
        titleList = arrayOf(
            "Muhammad Ilham Akbar",
            "Restu Kharrisa Andini",
            "Aqmal Syarif Fadilah",
            "Salsabila Aurelia Rickardo",
            "Nur Delifah",
            "Farhan Fadhila",
            "M. Farhan Aulia Pratama",
            "Fadlan Nur Ramadhan",
            "Harry Finaldhi",
            "Rifki Faiz Azzurananda",
            "Muhammad Raja Fahrezy",
            "Ready Malik Putra",
            "Tasya Dwi Yanti",
            "Yuliana Mislianingsih"


        )
        dataNIM = arrayOf(
            "12250113387",
            "12250124591",
            "12250113564",
            "12250121918",
            "12250123957",
            "12250113444",
            "12250113521",
            "12250113820",
            "12250113594",
            "12250113451",
            "12250113812",
            "12250113761",
            "12250123081",
            "12250123497"
        )
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf<DataClass>()
        getData()
    }

    private fun getData(){
        for (i in imageList.indices){
            val dataClass = DataClass(imageList[i], titleList[i], dataNIM[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter = AdapterClass(dataList)
    }
}