package com.example.MatrixMath

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.MatrixMath.R
import kotlinx.android.synthetic.main.activity_det__screen_2.*


class Det_Screen_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_det__screen_2)

        Det_2_back.setOnClickListener{
            startActivity(Intent(this, DetActivity::class.java))
        }
    }

    @SuppressLint("SetTextI18n")
    fun det2(view: View){
        try{
            var d_2_a11 = d_2_a11.text.toString().toInt()
            var d_2_a12 = d_2_a12.text.toString().toInt()
            var d_2_a21 = d_2_a21.text.toString().toInt()
            var d_2_a22 = d_2_a22.text.toString().toInt()
            d_2_title_a.text = "Находим определитель "
            d_2_d_a_g1.text = "1) Главная диагональ : $d_2_a11 * $d_2_a22 = ${d_2_a11 * d_2_a22}\n" +
                              "2) Побочьная диагональ : $d_2_a12 * $d_2_a21 = ${d_2_a12 * d_2_a21}"
            d_2_d_a_g8.text = "3) Вычтем ответ Главной диагонали и Побочьной      диагонали    \n" +
                              "     Определитель равен : ${(d_2_a11*d_2_a22)-(d_2_a12 * d_2_a21)} "
        }catch (e: Exception){
            d_2_title_a.text = ""
            d_2_d_a_g1.text = "Пожалуйста убедитесь что вы правильно ввели переменные"
            d_2_d_a_g8.text = ""
            Toast.makeText(this, "Ошибка ввода", Toast.LENGTH_SHORT).show()

        }


    }
}
