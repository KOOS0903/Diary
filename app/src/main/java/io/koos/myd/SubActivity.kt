package io.koos.myd

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sub.*
import java.util.*


class SubActivity : AppCompatActivity() {

    lateinit var tvDiaryDate : TextView
    lateinit var tvDiaryTitle : TextView
    lateinit var ivDiaryImage : ImageView
    lateinit var tvDiaryText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        tvDiaryDate = findViewById<TextView>(R.id.diaryDate)
        tvDiaryTitle = findViewById<TextView>(R.id.diaryTitle)
        ivDiaryImage = findViewById<ImageView>(R.id.diaryImage)
        tvDiaryText = findViewById<TextView>(R.id.diaryText)

        tvDiaryDate.setText("2020.10.26")
        tvDiaryTitle.setText(tvDiaryDate.getText())
        tvDiaryText.setText("오늘부터 1일 입니다. 지금 시작합니다.")

    }
}
