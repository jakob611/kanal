package com.jakob.looksmaxing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RoutineActivity : AppCompatActivity() {

    private lateinit var routineAdapter: RoutineAdapter
    private val routineItems = mutableListOf<RoutineItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_routine)

        setupRecyclerView()
        loadRoutineData()
    }

    private fun setupRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewRoutine)
        routineAdapter = RoutineAdapter(routineItems)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = routineAdapter
    }

    private fun loadRoutineData() {
        routineItems.clear()
        routineItems.addAll(
            listOf(
                RoutineItem("Jutarska nega kože", "Umivanje obraza z blagim čistilom", false),
                RoutineItem("Hidratacija", "Nanos vlažilne kreme", false),
                RoutineItem("Sončna zaščita", "Zaščita pred UV žarki", false),
                RoutineItem("Telovadba", "30 minut kardio ali moč vaje", false),
                RoutineItem("Hidratacija telesa", "Pitje 2L vode dnevno", false),
                RoutineItem("Spanje", "7-8 ur kakovostnega spanja", false),
                RoutineItem("Večerna nega", "Čiščenje in hidratacija pred spanjem", false)
            )
        )
        routineAdapter.notifyDataSetChanged()
    }
}