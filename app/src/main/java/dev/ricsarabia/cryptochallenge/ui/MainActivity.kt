package dev.ricsarabia.cryptochallenge.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.ricsarabia.cryptochallenge.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        supportActionBar?.hide()
    }
}