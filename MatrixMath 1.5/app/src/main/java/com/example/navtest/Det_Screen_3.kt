package com.example.MatrixMath

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_det__screen_3.*

import java.lang.Exception


class Det_Screen_3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_det__screen_3)
        imageView2.setOnClickListener{
            startActivity(Intent(this,DetActivity::class.java))
        }
    }

    val expr = Regex("""(^-[0-9]$)|(^-[0-9]{2}$)|(^-[0-9]{3}$)|(^-[0-9]{4}$)""")
    @SuppressLint("SetTextI18n")
    fun det3(v: View) =
        try {
            var d_3_m1 = d_3_m1.text.toString().toInt()
            var d_3_m2 = d_3_m2.text.toString().toInt()
            var d_3_m3 = d_3_m3.text.toString().toInt()
            var d_3_m4 = d_3_m4.text.toString().toInt()
            var d_3_m5 = d_3_m5.text.toString().toInt()
            var d_3_m6 = d_3_m6.text.toString().toInt()
            var d_3_m7 = d_3_m7.text.toString().toInt()
            var d_3_m8 = d_3_m8.text.toString().toInt()
            var d_3_m9 = d_3_m9.text.toString().toInt()

            d_3_m_sc1.text = "("
            d_3_m_sc2.text = ")"

            d_3_d_a1.text = d_3_m1.toString()
            d_3_d_a2.text = d_3_m2.toString()
            d_3_d_a3.text = d_3_m3.toString()
            d_3_d_a4.text = d_3_m4.toString()
            d_3_d_a5.text = d_3_m5.toString()
            d_3_d_a6.text = d_3_m6.toString()
            d_3_d_a7.text = d_3_m7.toString()
            d_3_d_a8.text = d_3_m8.toString()
            d_3_d_a9.text = d_3_m9.toString()
            d_3_textView5.text = "det A = "
            d_3_title_a.text = "1) Находим определитель "
            d_3_sc_a1.text = "|"
            d_3_sc_a2.text = "|"
//            d_3_det_3_1.text = "("
//            d_3_det_3_2.text = ")"
            d_3_m_sc1.textSize = 110F
            d_3_m_sc2.textSize = 110F
//            d_3_q1.text = "="
//            d_3_q2.text = "="
//            d_3_q3.text = "="
//            d_3_textView2.text = ""

            d_3_d_a_g1.text = "Главная диагональ : $d_3_m1 * $d_3_m5 * $d_3_m9 = ${d_3_m1 * d_3_m5 * d_3_m9}\n" +
                    "    1-й треугольник : $d_3_m2 * $d_3_m6 * $d_3_m7 = ${d_3_m2 * d_3_m6 * d_3_m7}\n" +
                    "    2-й треугольник : $d_3_m3 * $d_3_m4 * $d_3_m8 = ${d_3_m3 * d_3_m4 * d_3_m8}\n" +
                    "Побочьная диагональ : ( $d_3_m3 * $d_3_m5 * $d_3_m7 )*-1 = ${(d_3_m3 * d_3_m5 * d_3_m7) * -1}\n" +
                    "    1-й треугольник : ( $d_3_m2 * $d_3_m4 * $d_3_m9 )*-1 = ${(d_3_m2 * d_3_m4 * d_3_m9) * -1}\n" +
                    "    2-й треугольник : ( $d_3_m1 * $d_3_m6 * $d_3_m8 )*-1 = ${(d_3_m1 * d_3_m6 * d_3_m8) * -1}"
            d_3_d_a_g8.text = "Сложим все выражения :\n" +
                    "    ${d_3_m1 * d_3_m5 * d_3_m9} + ${d_3_m2 * d_3_m6 * d_3_m7} + ${d_3_m3 * d_3_m4 * d_3_m8} + (${(d_3_m3 * d_3_m5 * d_3_m7) * -1}) + " +
                    "(${(d_3_m2 * d_3_m4 * d_3_m9) * -1}) + (${(d_3_m1 * d_3_m6 * d_3_m8) * -1}) = " +
                    "${(d_3_m1 * d_3_m5 * d_3_m9) + (d_3_m2 * d_3_m6 * d_3_m7) + (d_3_m3 * d_3_m4 * d_3_m8) + ((d_3_m3 * d_3_m5 * d_3_m7) * -1) + ((d_3_m2 * d_3_m4 * d_3_m9) * -1) + ((d_3_m1 * d_3_m6 * d_3_m8) * -1)}\n " +
                    "Определитель : ${(d_3_m1 * d_3_m5 * d_3_m9) + (d_3_m2 * d_3_m6 * d_3_m7) + (d_3_m3 * d_3_m4 * d_3_m8) + ((d_3_m3 * d_3_m5 * d_3_m7) * -1) + ((d_3_m2 * d_3_m4 * d_3_m9) * -1) + ((d_3_m1 * d_3_m6 * d_3_m8) * -1)}"
        }
        catch (e: Exception) {
            Toast.makeText(this, "Ошибка ввода", Toast.LENGTH_SHORT).show()

            d_3_title_a.text = "Пожалуйста убедитесь что вы правильно ввели переменные"
            d_3_m_sc1.text = "("
            d_3_m_sc2.text = ")"

            d_3_d_a1.text = ""
            d_3_d_a2.text = ""
            d_3_d_a3.text = ""
            d_3_d_a4.text = ""
            d_3_d_a5.text = ""
            d_3_d_a6.text = ""
            d_3_d_a7.text = ""
            d_3_d_a8.text = ""
            d_3_d_a9.text = ""
            d_3_textView5.text = ""
            d_3_sc_a1.text = ""
            d_3_sc_a2.text = ""

            d_3_m_sc1.textSize = 0F
            d_3_m_sc2.textSize = 0F

            d_3_d_a_g1.text = ""
            d_3_d_a_g8.text = ""

        }





}
