package com.jakob.looksmaxing

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUI()
    }

    private fun setupUI() {
        // Daily Routine Card
        findViewById<MaterialCardView>(R.id.cardDailyRoutine).setOnClickListener {
            startActivity(Intent(this, RoutineActivity::class.java))
        }

        // Tips & Advice Card
        findViewById<MaterialCardView>(R.id.cardTips).setOnClickListener {
            startActivity(Intent(this, TipsActivity::class.java))
        }

        // Progress Tracking Card
        findViewById<MaterialCardView>(R.id.cardProgress).setOnClickListener {
            startActivity(Intent(this, ProgressActivity::class.java))
        }
    }
}