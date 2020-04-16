package com.example.MatrixMath

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_det__screen_3.*
import kotlinx.android.synthetic.main.activity_minor__screen.*
import kotlinx.android.synthetic.main.activity_rang__screen.*
import java.lang.Exception
import kotlinx.android.synthetic.main.activity_det__screen_3.imageView2 as imageView21

class Rang_Screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rang__screen)

        Rang_back.setOnClickListener{
            startActivity(Intent(this,DetActivity::class.java))
        }
    }
    @SuppressLint("SetTextI18n")
    fun rang(v: View){
        try{
            var a11 = rang_3_m1.text.toString().toInt()
            var a12 = rang_3_m2.text.toString().toInt()
            var a13 = rang_3_m3.text.toString().toInt()
            var a21 = rang_3_m4.text.toString().toInt()
            var a22 = rang_3_m5.text.toString().toInt()
            var a23 = rang_3_m6.text.toString().toInt()
            var a31 = rang_3_m7.text.toString().toInt()
            var a32 = rang_3_m8.text.toString().toInt()
            var a33 = rang_3_m9.text.toString().toInt()
            var m11 = ((a22 * a33) - (a23 * a32))
            var m33 = ((a11 * a22) - (a12 * a21))
            var o = ((a11 * a22 * a33) + (a12 * a23 * a31) + (a13 * a21 * a32) - (a13 * a22 * a31) - (a12 * a21 * a33) - (
                    a11 * a23 * a32))

            when{
                (o != 0) -> r_title.text = "Ранг матрицы равен 3"
                (m11 or m33) != 0 -> r_title.text = "Ранг матрицы равен 2"
                (a11 or a12 or a13 or a21 or a22 or a23 or a31 or a32 or a33) != 0 ->  r_title.text = "Ранг матрицы равен 1"
                else ->
                        r_title.text = "Ранг матрицы равен 0"
            }
        }catch (e : Exception){
            r_title.text = "Пожалуйста убедитесь что вы правильно ввели переменные"
            Toast.makeText(this, "Ошибка ввода", Toast.LENGTH_SHORT).show()
        }

    }

}
