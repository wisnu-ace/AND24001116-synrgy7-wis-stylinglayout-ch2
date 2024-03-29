package com.example.belajarlayout

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import android.widget.Button
import android.widget.ImageView
import android.widget.Toolbar
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.question).text = getString(R.string.rating_drivermu)
        findViewById<Button>(R.id.submit_button).text = getString(R.string.kirim_feedback)
        findViewById<Switch>(R.id.anonimosity).text = getString(R.string.kirim_saran_secara_anonim)
        findViewById<TextView>(R.id.faq).text = getString(R.string.apa_peran_rating)
        findViewById<ImageView>(R.id.imageView).contentDescription = getString(R.string.contoh_gambar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

}