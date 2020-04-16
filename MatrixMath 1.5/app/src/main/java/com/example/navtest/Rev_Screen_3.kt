package com.example.MatrixMath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_det__screen_3.*
import kotlinx.android.synthetic.main.activity_rev__screen_3.*
import kotlinx.android.synthetic.main.activity_rev__screen_3.imageView2
import java.lang.Exception

class Rev_Screen_3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rev__screen_3)

        imageView2.setOnClickListener{
            startActivity(Intent(this,DetActivity::class.java))
        }

    }

    fun rev3(v: View){
        try {
            var r_3_m1 = r_3_m1.text.toString().toInt()
            var r_3_m2 = r_3_m2.text.toString().toInt()
            var r_3_m3 = r_3_m3.text.toString().toInt()
            var r_3_m4 = r_3_m4.text.toString().toInt()
            var r_3_m5 = r_3_m5.text.toString().toInt()
            var r_3_m6 = r_3_m6.text.toString().toInt()
            var r_3_m7 = r_3_m7.text.toString().toInt()
            var r_3_m8 = r_3_m8.text.toString().toInt()
            var r_3_m9 = r_3_m9.text.toString().toInt()
            var o =
                (r_3_m1 * r_3_m5 * r_3_m9) + (r_3_m2 * r_3_m6 * r_3_m7) + (r_3_m3 * r_3_m4 * r_3_m8) + ((r_3_m3 * r_3_m5 * r_3_m7) * -1) + ((r_3_m2 * r_3_m4 * r_3_m9) * -1) + ((r_3_m1 * r_3_m6 * r_3_m8) * -1)

            rev_3_title.text = "1) Находим определитель."
            rev_3_1.text =
                "Главная диагональ : $r_3_m1 * $r_3_m5 * $r_3_m9 = ${r_3_m1 * r_3_m5 * r_3_m9}\n" +
                        "    1-й треугольник : $r_3_m2 * $r_3_m6 * $r_3_m7 = ${r_3_m2 * r_3_m6 * r_3_m7}\n" +
                        "    2-й треугольник : $r_3_m3 * $r_3_m4 * $r_3_m8 = ${r_3_m3 * r_3_m4 * r_3_m8}"
            rev_3_2.text =
                "Побочьная диагональ : $r_3_m3 * $r_3_m5 * $r_3_m7 = ${r_3_m3 * r_3_m5 * r_3_m7}\n" +
                        "    1-й треугольник : $r_3_m2 * $r_3_m4 * $r_3_m9 = ${r_3_m2 * r_3_m4 * r_3_m9}\n" +
                        "    2-й треугольник : $r_3_m1 * $r_3_m6 * $r_3_m8 = ${r_3_m1 * r_3_m6 * r_3_m8}"
            rev_3_3.text = "Сложим все выражения :\n" +
                    "    ${r_3_m1 * r_3_m5 * r_3_m9} + ${r_3_m2 * r_3_m6 * r_3_m7} + ${r_3_m3 * r_3_m4 * r_3_m8} + (${(r_3_m3 * r_3_m5 * r_3_m7) * -1}) + " +
                    "(${(r_3_m2 * r_3_m4 * r_3_m9) * -1}) + (${(r_3_m1 * r_3_m6 * r_3_m8) * -1}) = " +
                    "${(r_3_m1 * r_3_m5 * r_3_m9) + (r_3_m2 * r_3_m6 * r_3_m7) + (r_3_m3 * r_3_m4 * r_3_m8) + ((r_3_m3 * r_3_m5 * r_3_m7) * -1) + ((r_3_m2 * r_3_m4 * r_3_m9) * -1) + ((r_3_m1 * r_3_m6 * r_3_m8) * -1)}\n " +
                    "Определитель : $o"
            divider7.visibility = View.VISIBLE
            if (o != 0) {
                rev_3_4.text = "2) Находим алгебраические дополнения."

                dop_1_1.text = "1) "
                dop_1_2.visibility = View.VISIBLE
                dop_1_3.text = "$r_3_m5"
                dop_1_4.text = "$r_3_m6"
                dop_1_5.text = "$r_3_m8"
                dop_1_6.text = "$r_3_m9"
                dop_1_7.visibility = View.VISIBLE
                dop_1_8.text = "* 1^(-2) "
                dop_1_9.text = "= ${(r_3_m5 * r_3_m9) - (r_3_m6 * r_3_m8)}"


                dop_2_1.text = "2) "
                dop_2_2.visibility = View.VISIBLE
                dop_2_3.text = "$r_3_m4"
                dop_2_4.text = "$r_3_m6"
                dop_2_5.text = "$r_3_m7"
                dop_2_6.text = "$r_3_m9"
                dop_2_7.visibility = View.VISIBLE
                dop_2_8.text = "* 1^(-3)"
                dop_2_9.text = "= ${((r_3_m4 * r_3_m9) - (r_3_m6 * r_3_m7)) * -1}"


                dop_3_1.text = "3) "
                dop_3_2.visibility = View.VISIBLE
                dop_3_3.text = "$r_3_m4"
                dop_3_4.text = "$r_3_m5"
                dop_3_5.text = "$r_3_m7"
                dop_3_6.text = "$r_3_m8"
                dop_3_7.visibility = View.VISIBLE
                dop_3_8.text = "* 1^(-4)"
                dop_3_9.text = "= ${((r_3_m4 * r_3_m8) - (r_3_m5 * r_3_m7))}"


                dop_4_1.text = "4) "
                dop_4_2.visibility = View.VISIBLE
                dop_4_3.text = "$r_3_m2"
                dop_4_4.text = "$r_3_m3"
                dop_4_5.text = "$r_3_m8"
                dop_4_6.text = "$r_3_m9"
                dop_4_7.visibility = View.VISIBLE
                dop_4_8.text = "* 1^(-3)"
                dop_4_9.text = "= ${((r_3_m2 * r_3_m9) - (r_3_m3 * r_3_m8)) * -1}"


                dop_5_1.text = "5) "
                dop_5_2.visibility = View.VISIBLE
                dop_5_3.text = "$r_3_m1"
                dop_5_4.text = "$r_3_m3"
                dop_5_5.text = "$r_3_m7"
                dop_5_6.text = "$r_3_m9"
                dop_5_7.visibility = View.VISIBLE
                dop_5_8.text = "* 1^(-4)"
                dop_5_9.text = "= ${((r_3_m1 * r_3_m9) - (r_3_m7 * r_3_m3))}"


                dop_6_1.text = "6) "
                dop_6_2.visibility = View.VISIBLE
                dop_6_3.text = "$r_3_m1"
                dop_6_4.text = "$r_3_m2"
                dop_6_5.text = "$r_3_m7"
                dop_6_6.text = "$r_3_m8"
                dop_6_7.visibility = View.VISIBLE
                dop_6_8.text = "* 1^(-5)"
                dop_6_9.text = "= ${((r_3_m1 * r_3_m8) - (r_3_m7 * r_3_m2)) * -1}"


                dop_7_1.text = "7) "
                dop_7_2.visibility = View.VISIBLE
                dop_7_3.text = "$r_3_m2"
                dop_7_4.text = "$r_3_m3"
                dop_7_5.text = "$r_3_m5"
                dop_7_6.text = "$r_3_m6"
                dop_7_7.visibility = View.VISIBLE
                dop_7_8.text = "* 1^(-4)"
                dop_7_9.text = "= ${((r_3_m2 * r_3_m6) - (r_3_m5 * r_3_m3))}"


                dop_8_1.text = "8) "
                dop_8_2.visibility = View.VISIBLE
                dop_8_3.text = "$r_3_m1"
                dop_8_4.text = "$r_3_m3"
                dop_8_5.text = "$r_3_m4"
                dop_8_6.text = "$r_3_m6"
                dop_8_7.visibility = View.VISIBLE
                dop_8_8.text = "* 1^(-5)"
                dop_8_9.text = "= ${((r_3_m1 * r_3_m6) - (r_3_m4 * r_3_m3)) * -1}"


                dop_9_1.text = "9) "
                dop_9_2.visibility = View.VISIBLE
                dop_9_3.text = "$r_3_m1"
                dop_9_4.text = "$r_3_m2"
                dop_9_5.text = "$r_3_m4"
                dop_9_6.text = "$r_3_m6"
                dop_9_7.visibility = View.VISIBLE
                dop_9_8.text = "* 1^(-6)"
                dop_9_9.text = "= ${((r_3_m1 * r_3_m5) - (r_3_m2 * r_3_m4))}"


                r_answ.text = "3) Делим все Алгебраические дополнениня на Определитель"
                r_answ_1.text =
                    "   a11) ${(r_3_m5 * r_3_m9) - (r_3_m6 * r_3_m8)} / $o = ${((r_3_m5 * r_3_m9) - (r_3_m6 * r_3_m8)).toDouble() / o}"
                r_answ_2.text =
                    "   a12) ${((r_3_m5 * r_3_m9) - (r_3_m6 * r_3_m8)) * -1} / $o = ${(((r_3_m5 * r_3_m9) - (r_3_m6 * r_3_m8)) * -1).toDouble() / o}"
                r_answ_3.text =
                    "   a13) ${((r_3_m4 * r_3_m8) - (r_3_m5 * r_3_m7))} / $o = ${((r_3_m4 * r_3_m8) - (r_3_m5 * r_3_m7)).toDouble() / o}"
                r_answ_4.text =
                    "   a21) ${(((r_3_m2 * r_3_m9) - (r_3_m3 * r_3_m8)) * -1)} / $o = ${(((r_3_m2 * r_3_m9) - (r_3_m3 * r_3_m8)) * -1).toDouble() / o}"
                r_answ_5.text =
                    "   a22) ${((r_3_m1 * r_3_m9) - (r_3_m7 * r_3_m3))} / $o = ${((r_3_m1 * r_3_m9) - (r_3_m7 * r_3_m3)).toDouble() / o}"
                r_answ_6.text =
                    "   a23) ${((r_3_m1 * r_3_m8) - (r_3_m7 * r_3_m2)) * -1} / $o = ${(((r_3_m1 * r_3_m8) - (r_3_m7 * r_3_m2)) * -1).toDouble() / o}"
                r_answ_7.text =
                    "   a31) ${((r_3_m2 * r_3_m6) - (r_3_m5 * r_3_m3))} / $o = ${((r_3_m2 * r_3_m6) - (r_3_m5 * r_3_m3)).toDouble() / o}"
                r_answ_8.text =
                    "   a32) ${((r_3_m1 * r_3_m6) - (r_3_m4 * r_3_m3)) * -1} / $o = ${(((r_3_m1 * r_3_m6) - (r_3_m4 * r_3_m3)) * -1).toDouble() / o}"
                r_answ_9.text =
                    "   a32) ${((r_3_m1 * r_3_m5) - (r_3_m2 * r_3_m4))} / $o = ${((r_3_m1 * r_3_m5) - (r_3_m2 * r_3_m4)).toDouble() / o}"
            } else {
                rev_3_4.text = "Матрица не имеет решения так как определитель равен 0"


                dop_1_1.text = ""
                dop_1_2.visibility = View.INVISIBLE
                dop_1_3.text = ""
                dop_1_4.text = ""
                dop_1_5.text = ""
                dop_1_6.text = ""
                dop_1_7.visibility = View.INVISIBLE
                dop_1_8.text = ""
                dop_1_9.text = ""


                dop_2_1.text = ""
                dop_2_2.visibility = View.INVISIBLE
                dop_2_3.text = ""
                dop_2_4.text = ""
                dop_2_5.text = ""
                dop_2_6.text = ""
                dop_2_7.visibility = View.INVISIBLE
                dop_2_8.text = ""
                dop_2_9.text = ""


                dop_3_1.text = ""
                dop_3_2.visibility = View.INVISIBLE
                dop_3_3.text = ""
                dop_3_4.text = ""
                dop_3_5.text = ""
                dop_3_6.text = ""
                dop_3_7.visibility = View.INVISIBLE
                dop_3_8.text =""
                dop_3_9.text = ""


                dop_4_1.text = ""
                dop_4_2.visibility = View.INVISIBLE
                dop_4_3.text = ""
                dop_4_4.text = ""
                dop_4_5.text = ""
                dop_4_6.text = ""
                dop_4_7.visibility = View.INVISIBLE
                dop_4_8.text = ""
                dop_4_9.text =""


                dop_5_1.text = ""
                dop_5_2.visibility = View.INVISIBLE
                dop_5_3.text = ""
                dop_5_4.text = ""
                dop_5_5.text = ""
                dop_5_6.text = ""
                dop_5_7.visibility = View.INVISIBLE
                dop_5_8.text = ""
                dop_5_9.text = ""


                dop_6_1.text = ""
                dop_6_2.visibility = View.INVISIBLE
                dop_6_3.text = ""
                dop_6_4.text = ""
                dop_6_5.text = ""
                dop_6_6.text = ""
                dop_6_7.visibility = View.INVISIBLE
                dop_6_8.text = ""
                dop_6_9.text = ""


                dop_7_1.text = ""
                dop_7_2.visibility = View.INVISIBLE
                dop_7_3.text = ""
                dop_7_4.text = ""
                dop_7_5.text = ""
                dop_7_6.text = ""
                dop_7_7.visibility = View.INVISIBLE
                dop_7_8.text = "-4"
                dop_7_9.text = ""


                dop_8_1.text = ""
                dop_8_2.visibility = View.INVISIBLE
                dop_8_3.text = ""
                dop_8_4.text = ""
                dop_8_5.text = ""
                dop_8_6.text = ""
                dop_8_7.visibility = View.INVISIBLE
                dop_8_8.text = ""
                dop_8_9.text = ""


                dop_9_1.text = ""
                dop_9_2.visibility = View.INVISIBLE
                dop_9_3.text = ""
                dop_9_4.text = ""
                dop_9_5.text = ""
                dop_9_6.text = ""
                dop_9_7.visibility = View.INVISIBLE
                dop_9_8.text = ""
                dop_9_9.text = ""


                r_answ.text = ""
                r_answ_1.text = ""
                r_answ_2.text = ""
                r_answ_3.text = ""
                r_answ_4.text = ""
                r_answ_5.text = ""
                r_answ_6.text = ""
                r_answ_7.text = ""
                r_answ_8.text = ""
                r_answ_9.text = ""
            }
        }catch (e: Exception){
            Toast.makeText(this, "Ошибка ввода", Toast.LENGTH_SHORT).show()
            rev_3_1.text = ""
            rev_3_2.text = ""
            rev_3_3.text = ""
            rev_3_4.text = "Пожалуйста убедитесь что вы правильно ввели переменные"
            divider7.visibility = View.VISIBLE
            dop_1_1.text = ""
            dop_1_2.visibility = View.INVISIBLE
            dop_1_3.text = ""
            dop_1_4.text = ""
            dop_1_5.text = ""
            dop_1_6.text = ""
            dop_1_7.visibility = View.INVISIBLE
            dop_1_8.text = ""
            dop_1_9.text = ""


            dop_2_1.text = ""
            dop_2_2.visibility = View.INVISIBLE
            dop_2_3.text = ""
            dop_2_4.text = ""
            dop_2_5.text = ""
            dop_2_6.text = ""
            dop_2_7.visibility = View.INVISIBLE
            dop_2_8.text = ""
            dop_2_9.text = ""


            dop_3_1.text = ""
            dop_3_2.visibility = View.INVISIBLE
            dop_3_3.text = ""
            dop_3_4.text = ""
            dop_3_5.text = ""
            dop_3_6.text = ""
            dop_3_7.visibility = View.INVISIBLE
            dop_3_8.text =""
            dop_3_9.text = ""


            dop_4_1.text = ""
            dop_4_2.visibility = View.INVISIBLE
            dop_4_3.text = ""
            dop_4_4.text = ""
            dop_4_5.text = ""
            dop_4_6.text = ""
            dop_4_7.visibility = View.INVISIBLE
            dop_4_8.text = ""
            dop_4_9.text =""


            dop_5_1.text = ""
            dop_5_2.visibility = View.INVISIBLE
            dop_5_3.text = ""
            dop_5_4.text = ""
            dop_5_5.text = ""
            dop_5_6.text = ""
            dop_5_7.visibility = View.INVISIBLE
            dop_5_8.text = ""
            dop_5_9.text = ""


            dop_6_1.text = ""
            dop_6_2.visibility = View.INVISIBLE
            dop_6_3.text = ""
            dop_6_4.text = ""
            dop_6_5.text = ""
            dop_6_6.text = ""
            dop_6_7.visibility = View.INVISIBLE
            dop_6_8.text = ""
            dop_6_9.text = ""


            dop_7_1.text = ""
            dop_7_2.visibility = View.INVISIBLE
            dop_7_3.text = ""
            dop_7_4.text = ""
            dop_7_5.text = ""
            dop_7_6.text = ""
            dop_7_7.visibility = View.INVISIBLE
            dop_7_8.text = "-4"
            dop_7_9.text = ""


            dop_8_1.text = ""
            dop_8_2.visibility = View.INVISIBLE
            dop_8_3.text = ""
            dop_8_4.text = ""
            dop_8_5.text = ""
            dop_8_6.text = ""
            dop_8_7.visibility = View.INVISIBLE
            dop_8_8.text = ""
            dop_8_9.text = ""


            dop_9_1.text = ""
            dop_9_2.visibility = View.INVISIBLE
            dop_9_3.text = ""
            dop_9_4.text = ""
            dop_9_5.text = ""
            dop_9_6.text = ""
            dop_9_7.visibility = View.INVISIBLE
            dop_9_8.text = ""
            dop_9_9.text = ""


            r_answ.text = ""
            r_answ_1.text = ""
            r_answ_2.text = ""
            r_answ_3.text = ""
            r_answ_4.text = ""
            r_answ_5.text = ""
            r_answ_6.text = ""
            r_answ_7.text = ""
            r_answ_8.text = ""
            r_answ_9.text =""
        }
    }

}
