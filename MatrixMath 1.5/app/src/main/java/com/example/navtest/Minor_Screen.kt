package com.example.MatrixMath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_det__screen_3.*
import kotlinx.android.synthetic.main.activity_minor__screen.*
import kotlinx.android.synthetic.main.activity_minor__screen.imageView2
import java.lang.Exception

class Minor_Screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_minor__screen)
        imageView2.setOnClickListener{
            startActivity(Intent(this,DetActivity::class.java))
        }
    }
    fun minor (v: View){
        try {
            var a11 = m_3_m1.text.toString().toInt()
            var a12 = m_3_m2.text.toString().toInt()
            var a13 = m_3_m3.text.toString().toInt()
            var a21 = m_3_m4.text.toString().toInt()
            var a22 = m_3_m5.text.toString().toInt()
            var a23 = m_3_m6.text.toString().toInt()
            var a31 = m_3_m7.text.toString().toInt()
            var a32 = m_3_m8.text.toString().toInt()
            var a33 = m_3_m9.text.toString().toInt()
            m_title.text = "Миноры матрицы"
            mm_a11.text = ((a22 * a33) - (a23 * a32)).toString()
            mm_a12.text = ((a21 * a33) - (a23 * a31)).toString()
            mm_a13.text = ((a21 * a32) - (a22 * a31)).toString()
            mm_a21.text = ((a12 * a33) - (a13 * a32)).toString()
            mm_a22.text = ((a11 * a33) - (a31 * a13)).toString()
            mm_a23.text = ((a11 * a32) - (a31 * a12)).toString()
            mm_a31.text = ((a12 * a23) - (a22 * a13)).toString()
            mm_a32.text = ((a11 * a23) - (a21 * a13)).toString()
            mm_a33.text = ((a11 * a22) - (a12 * a21)).toString()
            divider9.visibility = View.VISIBLE
            divider10.visibility = View.VISIBLE
        }
        catch (e : Exception){
            m_title.text = "Пожалуйста убедитесь что правильно ввели переменные"
            mm_a11.text = ""
            mm_a12.text = ""
            mm_a13.text = ""
            mm_a21.text = ""
            mm_a22.text = ""
            mm_a23.text = ""
            mm_a31.text = ""
            mm_a32.text = ""
            mm_a33.text = ""
            divider9.visibility = View.INVISIBLE
            divider10.visibility = View.INVISIBLE
        }

    }

    fun det_back(view: View){
//        Toast.makeText(this, "DEt clicked", Toast.LENGTH_SHORT).show()
        startActivity(Intent(this, DetActivity::class.java))
    }
}
