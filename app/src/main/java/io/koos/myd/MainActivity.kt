package io.koos.myd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var addbt : ImageButton
        addbt = findViewById<ImageButton>(R.id.mainadd)

        addbt.setOnClickListener({
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        })

    }
}