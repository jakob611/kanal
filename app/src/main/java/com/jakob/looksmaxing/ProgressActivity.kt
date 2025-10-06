package com.jakob.looksmaxing

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProgressActivity : AppCompatActivity() {

    private lateinit var textViewProgress: TextView
    private lateinit var buttonAddProgress: Button
    private var progressDays = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress)

        setupUI()
        loadProgress()
    }

    private fun setupUI() {
        textViewProgress = findViewById(R.id.textViewProgress)
        buttonAddProgress = findViewById(R.id.buttonAddProgress)

        buttonAddProgress.setOnClickListener {
            progressDays++
            updateProgressDisplay()
            saveProgress()
        }
    }

    private fun loadProgress() {
        val sharedPrefs = getSharedPreferences("looksmaxing_prefs", MODE_PRIVATE)
        progressDays = sharedPrefs.getInt("progress_days", 0)
        updateProgressDisplay()
    }

    private fun saveProgress() {
        val sharedPrefs = getSharedPreferences("looksmaxing_prefs", MODE_PRIVATE)
        sharedPrefs.edit().putInt("progress_days", progressDays).apply()
    }

    private fun updateProgressDisplay() {
        textViewProgress.text = "Dnevov v programu: $progressDays"
        
        val progressMessage = when {
            progressDays < 7 -> "Začetek je najtežji! Držite se!"
            progressDays < 30 -> "Odličen napredek! Rutina se oblikuje."
            progressDays < 90 -> "Fantastično! Rezultati se že kažejo."
            else -> "Mojster looksmaxinga! Odličen dosežek!"
        }
        
        findViewById<TextView>(R.id.textViewMotivation).text = progressMessage
    }
}