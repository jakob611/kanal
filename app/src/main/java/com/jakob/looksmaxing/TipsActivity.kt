package com.jakob.looksmaxing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TipsActivity : AppCompatActivity() {

    private lateinit var tipsAdapter: TipsAdapter
    private val tipsList = mutableListOf<Tip>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips)

        setupRecyclerView()
        loadTipsData()
    }

    private fun setupRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewTips)
        tipsAdapter = TipsAdapter(tipsList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = tipsAdapter
    }

    private fun loadTipsData() {
        tipsList.clear()
        tipsList.addAll(
            listOf(
                Tip("Nega kože", "Redno čiščenje in hidratacija sta osnova za zdravo kožo. Uporabljajte izdelke, primerne za vaš tip kože."),
                Tip("Prehrana", "Uživajte hrano, bogato z antioksidanti - borovnice, temna listnata zelenjava, oreški in ribe."),
                Tip("Hidratacija", "Pijte najmanj 2-3 litre vode dnevno za ohranjanje hidratacije kože in telesa."),
                Tip("Spanje", "7-9 ur kakovostnega spanja je ključno za regeneracijo celic in ohranjanje mladostnega videza."),
                Tip("Telovadba", "Redna fizična aktivnost izboljša cirkulacijo, kar daje koži zdrav sijaj."),
                Tip("Sončna zaščita", "Uporabljajte zaščito pred soncem z vsaj SPF 30 vsak dan, tudi pozimi."),
                Tip("Stres", "Upravljanje stresa z meditacijo, jogo ali drugimi tehnikami sproščanja."),
                Tip("Nega las", "Redno striženje in uporaba kakovostnih izdelkov za nego las.")
            )
        )
        tipsAdapter.notifyDataSetChanged()
    }
}