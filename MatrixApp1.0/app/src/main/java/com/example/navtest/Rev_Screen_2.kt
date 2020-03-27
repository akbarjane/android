package com.example.navtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_rev__screen_2.*
import java.lang.Exception

class Rev_Screen_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rev__screen_2)
    }

    fun det_back(view: View){
        Toast.makeText(this, "DEt clicked", Toast.LENGTH_SHORT).show()
        val screen = Intent(this, DetActivity::class.java)
        startActivity(screen)
    }

    fun rev_2(view: View){
        try {
            var a11 = r_2_a11.text.toString().toInt()
            var a12 = r_2_a12.text.toString().toInt()
            var a21 = r_2_a21.text.toString().toInt()
            var a22 = r_2_a22.text.toString().toInt()
            var o = (a11 * a22) - (a12 * a21)
            r_2_title_a.text = "Находим определитель."
            r_2_d_a_g1.text = "1) Главная диагональ : $a11 * $a22 = ${a11 * a22}"
            r_2_d_a_g2.text = "2) Побочьная диагональ : $a12 * $a21 = ${a12 * a21}"
            r_2_d_a_g3.text = "3) Вычтем ответ Главной и Побочьной диагонали : \n " +
                    "Определитель равен : $o"
            if (o != 0) {
                r_2_d_a_g31.visibility = View.VISIBLE
                r_2_d_a_g4.text = "a11) $a11 / $o = ${a11 / o}"
                r_2_d_a_g5.text = "a12) ${a12 * -1} / $o = ${(a12 * -1) / o}"
                r_2_d_a_g6.text = "a21) ${a21 * -1} / $o = ${(a21 * -1) / o}"
                r_2_d_a_g7.text = "a22) $a22 / $o = ${a22 / o}"
            } else {
                r_2_title_a.text =
                    "Матрица не имеет решения так как определитель равен 0 \n Находим определитель."
            }
        }catch (e :Exception){
            Toast.makeText(this, "Ошибка ввода", Toast.LENGTH_SHORT).show()
            r_2_title_a.text = "Пожалуйста убедитесь что вы правильно ввели переменные."
            r_2_d_a_g1.text = ""
            r_2_d_a_g2.text = ""
            r_2_d_a_g3.text = ""

            r_2_d_a_g31.visibility = View.INVISIBLE
            r_2_d_a_g4.text = ""
            r_2_d_a_g5.text = ""
            r_2_d_a_g6.text = ""
            r_2_d_a_g7.text = ""
        }

    }
}
