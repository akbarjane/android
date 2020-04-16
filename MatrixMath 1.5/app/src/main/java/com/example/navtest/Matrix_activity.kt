package com.example.MatrixMath

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_matrix_activity.*
import kotlinx.android.synthetic.main.matrix_kramer.*
import java.lang.Exception

class Matrix_activity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nav_matrix)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        drawerLayout = findViewById(R.id.drawer_layout)
        navView = findViewById(R.id.nav_view)
        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, 0, 0
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)
    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.calc_screen -> {
                startActivity(Intent(this, MainActivity::class.java))
            }
            R.id.matrix_kramer_screen -> {
                startActivity(Intent(this, Matrix_activity::class.java))
            }
            R.id.matrix_det_screen -> {
                startActivity(Intent(this, DetActivity::class.java))
            }
            R.id.matrix_ariph_screen -> {
                startActivity(Intent(this, ariph_screen::class.java))
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }


    val expr = Regex("""(^-[0-9]$)|(^-[0-9]{2}$)|(^-[0-9]{3}$)|(^-[0-9]{4}$)""")
    @SuppressLint("SetTextI18n")
    fun kramer(v: View) =
        try {
            var m1 = m1.text.toString().toInt()
            var m2 = m2.text.toString().toInt()
            var m3 = m3.text.toString().toInt()
            var m4 = m4.text.toString().toInt()
            var m5 = m5.text.toString().toInt()
            var m6 = m6.text.toString().toInt()
            var m7 = m7.text.toString().toInt()
            var m8 = m8.text.toString().toInt()
            var m9 = m9.text.toString().toInt()
            var b1 = b1.text.toString().toInt()
            var b2 = b2.text.toString().toInt()
            var b3 = b3.text.toString().toInt()


            Mtitle.text = "Дана матрица\nРешаем методом Крамера"
            m_sc1.text = "("
            m_sc2.text = ")"

            m_a11.text = "${m1}x"


            if (expr.matches(m2.toString())) {
                plus_1.text = "-"
                m_a12.text = "${m2 * -1}y"
            } else {
                m_a12.text = "${m2}y"
                plus_1.text = "+"
            }


            if (expr.matches(m3.toString())) {
                plus_4.text = "-"
                m_a13.text = "${m3 * -1}Z"
            } else {
                m_a13.text = "${m3}Z"
                plus_4.text = "+"
            }


            m_a21.text = "${m4}x"


            if (expr.matches(m5.toString())) {
                plus_2.text = "-"
                m_a22.text = "${m5 * -1}y"
            } else {
                m_a22.text = "${m5}y"
                plus_2.text = "+"
            }


            if (expr.matches(m6.toString())) {
                plus_5.text = "-"
                m_a23.text = "${m6 * -1}Z"
            } else {
                m_a23.text = "${m6}Z"
                plus_5.text = "+"
            }


            m_a31.text = "${m7}x"


            if (expr.matches(m8.toString())) {
                plus_3.text = "-"
                m_a32.text = "${m8 * -1}y"
            } else {
                m_a32.text = "${m8}y"
                plus_3.text = "+"
            }


            if (expr.matches(m9.toString())) {
                plus_6.text = "-"
                m_a33.text = "${m9 * -1}Z"
            } else {
                m_a33.text = "${m9}Z"
                plus_6.text = "+"
            }


            m_b1.text = b1.toString()
            m_b2.text = b2.toString()
            m_b3.text = b3.toString()

            d_a1.text = m1.toString()
            d_a2.text = m2.toString()
            d_a3.text = m3.toString()
            d_a4.text = m4.toString()
            d_a5.text = m5.toString()
            d_a6.text = m6.toString()
            d_a7.text = m7.toString()
            d_a8.text = m8.toString()
            d_a9.text = m9.toString()
            textView5.text = "det A = "
            title_a.text = "1) Находим определитель А"
            sc_a1.text = "|"
            sc_a2.text = "|"
            m_sc1.text = "("
            m_sc2.text = ")"
            m_sc1.textSize = 110F
            m_sc2.textSize = 110F
            q1.text = "="
            q2.text = "="
            q3.text = "="
            textView2.text = "Находим определители"

            d_a_g1.text = "Главная диагональ : $m1 * $m5 * $m9 = ${m1 * m5 * m9}\n" +
                    "    1-й треугольник : $m2 * $m6 * $m7 = ${m2 * m6 * m7}\n" +
                    "    2-й треугольник : $m3 * $m4 * $m8 = ${m3 * m4 * m8}\n" +
                    "Побочьная диагональ : ( $m3 * $m5 * $m7 )*-1 = ${(m3 * m5 * m7) * -1}\n" +
                    "    1-й треугольник : ( $m2 * $m4 * $m9 )*-1 = ${(m2 * m4 * m9) * -1}\n" +
                    "    2-й треугольник : ( $m1 * $m6 * $m8 )*-1 = ${(m1 * m6 * m8) * -1}"
            d_a_g8.text = "Сложим все выражения :\n" +
                    "    ${m1 * m5 * m9} + ${m2 * m6 * m7} + ${m3 * m4 * m8} + (${(m3 * m5 * m7) * -1}) + " +
                    "(${(m2 * m4 * m9) * -1}) + (${(m1 * m6 * m8) * -1}) = " +
                    "${(m1 * m5 * m9) + (m2 * m6 * m7) + (m3 * m4 * m8) + ((m3 * m5 * m7) * -1) + ((m2 * m4 * m9) * -1) + ((m1 * m6 * m8) * -1)}\n " +
                    "Определитель А : ${(m1 * m5 * m9) + (m2 * m6 * m7) + (m3 * m4 * m8) + ((m3 * m5 * m7) * -1) + ((m2 * m4 * m9) * -1) + ((m1 * m6 * m8) * -1)}"
            val o =
                (m1 * m5 * m9) + (m2 * m6 * m7) + (m3 * m4 * m8) + ((m3 * m5 * m7) * -1) + ((m2 * m4 * m9) * -1) + ((m1 * m6 * m8) * -1)
            if (o != 0) {
                textView51.text = "det x1 = "
                title_x1.text = "2) Находим определитель x1"
                sc_x11.text = "|"
                sc_x12.text = "|"
                d_x11.text = b1.toString()
                d_x12.text = m2.toString()
                d_x13.text = m3.toString()
                d_x14.text = b2.toString()
                d_x15.text = m5.toString()
                d_x16.text = m6.toString()
                d_x17.text = b3.toString()
                d_x18.text = m8.toString()
                d_x19.text = m9.toString()

                d_x1_g1.text = "Главная диагональ : $b1 * $m5 * $m9 = ${b1 * m5 * m9}\n" +
                        "    1-й треугольник : $m2 * $m6 * $b3 = ${m2 * m6 * b3}\n" +
                        "    2-й треугольник : $m3 * $b2 * $m8 = ${m3 * b2 * m8}\n" +
                        "Побочьная диагональ : ( $m3 * $m5 * $b3 )*-1 = ${(m3 * m5 * b3) * -1}\n" +
                        "    1-й треугольник : ( $m2 * $b2 * $m9 )*-1 = ${(m2 * b2 * m9) * -1}\n" +
                        "    2-й треугольник : ( $b1 * $m6 * $m8 )*-1 = ${(b1 * m6 * m8) * -1}"
                d_x1_g8.text = "Сложим все выражения :\n" +
                        "    " +
                        "${b1 * m5 * m9} + ${m2 * m6 * b3} + ${m3 * b2 * m8} + (${(m3 * m5 * b3) * -1}) + " +
                        "(${(m2 * b2 * m9) * -1}) + (${(b1 * m6 * m8) * -1}) = " +
                        "${(b1 * m5 * m9) + (m2 * m6 * b3) + (m3 * b2 * m8) + ((m3 * m5 * b3) * -1) + ((m2 * b2 * m9) * -1) + ((b1 * m6 * m8) * -1)}\n " +
                        "Определитель X1 : ${(b1 * m5 * m9) + (m2 * m6 * b3) + (m3 * b2 * m8) + ((m3 * m5 * b3) * -1) + ((m2 * b2 * m9) * -1) + ((b1 * m6 * m8) * -1)}"

                textView52.text = "det x2 = "
                title_x2.text = "3) Находим определитель x2"
                sc_x21.text = "|"
                sc_x22.text = "|"
                d_x21.text = m1.toString()
                d_x22.text = b1.toString()
                d_x23.text = m3.toString()
                d_x24.text = m4.toString()
                d_x25.text = b2.toString()
                d_x26.text = m6.toString()
                d_x27.text = m7.toString()
                d_x28.text = b3.toString()
                d_x29.text = m9.toString()

                d_x2_g1.text = "Главная диагональ : $m1 * $b2 * $m9 = ${m1 * b2 * m9}\n" +
                        "    1-й треугольник : $b1 * $m6 * $m7 = ${b1 * m6 * m7}\n" +
                        "    2-й треугольник : $m3 * $m4 * $b3 = ${m3 * m4 * b3}\n" +
                        "Побочьная диагональ : ( $m3 * $b2 * $m7 )*-1 = ${(m3 * b2 * m7) * -1}\n" +
                        "    1-й треугольник : ( $b1 * $m4 * $m9 )*-1 = ${(b1 * m4 * m9) * -1}\n" +
                        "    2-й треугольник : ( $m1 * $m6 * $b3 )*-1 = ${(m1 * m6 * b3) * -1}"
                d_x2_g8.text = "Сложим все выражения :\n" +
                        "    ${m1 * b2 * m9} + ${b1 * m6 * m7} + ${m3 * m4 * b3} + (${(m3 * b2 * m7) * -1}) + " +
                        "(${(b1 * m4 * m9) * -1}) + (${(m1 * m6 * b3) * -1}) = " +
                        "${(m1 * b2 * m9) + (b1 * m6 * m7) + (m3 * m4 * b3) + ((m3 * b2 * m7) * -1) + ((b1 * m4 * m9) * -1) + ((m1 * m6 * b3) * -1)}\n " +
                        "Определитель X2 : ${(m1 * b2 * m9) + (b1 * m6 * m7) + (m3 * m4 * b3) + ((m3 * b2 * m7) * -1) + ((b1 * m4 * m9) * -1) + ((m1 * m6 * b3) * -1)}"
////
                textView53.text = "det x3 = "
                title_x3.text = "4) Находим определитель x3"
                sc_x31.text = "|"
                sc_x32.text = "|"
                d_x31.text = m1.toString()
                d_x32.text = m2.toString()
                d_x33.text = b1.toString()
                d_x34.text = m4.toString()
                d_x35.text = m5.toString()
                d_x36.text = b2.toString()
                d_x37.text = m7.toString()
                d_x38.text = m8.toString()
                d_x39.text = b3.toString()
                val o =
                    (m1 * m5 * m9) + (m2 * m6 * m7) + (m3 * m4 * m8) + ((m3 * m5 * m7) * -1) + ((m2 * m4 * m9) * -1) + ((m1 * m6 * m8) * -1)
                var x1 =
                    (b1 * m5 * m9) + (m2 * m6 * b3) + (m3 * b2 * m8) + ((m3 * m5 * b3) * -1) + ((m2 * b2 * m9) * -1) + ((b1 * m6 * m8) * -1)
                var x2 =
                    (m1 * b2 * m9) + (b1 * m6 * m7) + (m3 * m4 * b3) + ((m3 * b2 * m7) * -1) + ((b1 * m4 * m9) * -1) + ((m1 * m6 * b3) * -1)
                var x3 =
                    ((m1 * m5 * b3) +
                            (m2 * b2 * m7) +
                            (b1 * m4 * m8)) +
                            (((b1 * m5 * m7) * -1) +
                                    ((m2 * m4 * b3) * -1) +
                                    ((m1 * b2 * m8) * -1))

                d_x3_g1.text = "Главная диагональ : $m1 * $m5 * $b3 = ${m1 * m5 * b3}\n" +
                        "    1-й треугольник : $m2 * $b2 * $m7 = ${m2 * b2 * m7}\n" +
                        "    2-й треугольник : $b1 * $m4 * $m8 = ${b1 * m4 * m8}\n" +
                        "Побочьная диагональ : ( $b1 * $m5 * $m7 )*-1 = ${(b1 * m5 * m7) * -1}\n" +
                        "    1-й треугольник : ( $m2 * $m4 * $b3 )*-1 = ${(m2 * m4 * b3) * -1}\n" +
                        "    2-й треугольник : ( $m1 * $b2 * $m8 )*-1 = ${(m1 * b2 * m8) * -1}"

                d_x3_g8.text = "Сложим все выражения :\n" +
                        "    ${m1 * m5 * b3} + ${m2 * b2 * m7} + ${b1 * m4 * m8} + (${(b1 * m5 * m7) * -1}) + (${(m2 * m4 * b3) * -1}) + (${(m1 * b2 * m8) * -1}) = " +
                        "${x3}\n " +
                        "Определитель X3 : $x3"

                divider2.visibility = View.VISIBLE
                divider3.visibility = View.VISIBLE
                divider4.visibility = View.VISIBLE
                divider5.visibility = View.VISIBLE

                answer.text = "Делим определители X1, X2, X3 на определитель А.\n" +
                        "1) $x1 / $o = ${(x1.toDouble() / o)}\n" +
                        "2) $x2 / $o = ${(x2.toDouble() / o)}\n" +
                        "3) $x3 / $o = ${(x3.toDouble() / o)}\n" +
                        "Ответ равен : \n"+
                        "   X1 = ${x1.toDouble() / o}\n" +
                        "   X2 = ${x2.toDouble() / o}\n" +
                        "   X3 = ${x3.toDouble() / o}"

                answer_m1.text = ""
                answ_x1.textSize = 0F
                answ_x2.textSize = 0F
                answ_x3.textSize = 0F
                answ_m2.text =
                    ""
                m1_1.text = ""; m1_2.textSize = 0F;m1_4.textSize = 0F
                m1_3.text = ""; m1_5.text = ""


                m2_1.text = ""; m2_2.textSize = 0F;m2_4.textSize = 0F
                m2_3.text = ""; m2_5.text = ""


                m3_1.text = ""; m3_2.textSize = 0F;m3_4.textSize = 0F
                m3_3.text = ""; m3_5.text = ""


                m4_1.text = ""; m4_2.textSize = 0F;m4_4.textSize = 0F
                m4_3.text = ""; m4_5.text = ""


                m5_1.text = ""; m5_2.textSize = 0F;m5_4.textSize = 0F
                m5_3.text = ""; m5_5.text = ""


                m6_1.text = ""; m6_2.textSize = 0F;m6_4.textSize = 0F
                m6_3.text = ""; m6_5.text = ""


                m7_1.text = ""; m7_2.textSize = 0F;m7_4.textSize = 0F
                m7_3.text = ""; m7_5.text = ""


                m8_1.text = ""; m8_2.textSize = 0F;m8_4.textSize = 0F
                m8_3.text = ""; m8_5.text = ""


                m9_1.text = ""; m9_2.textSize = 0F;m9_4.textSize = 0F
                m9_3.text = ""; m9_5.text = ""

                m_answ_b1.text = ""
                m_answ_b2.text =""
                m_answ_b3.text = ""

                mm_11.text = ""
                m_answ_a11.text = ""
                mm_12.text = ""
                m_answ_a12.text = ""
                mm_13.text = ""
                m_answ_a13.text = ""

                mm_21.text = ""
                m_answ_a21.text = ""
                mm_22.text = ""
                m_answ_a22.text =""
                mm_23.text = ""
                m_answ_a23.text = ""
                mm_31.text = ""
                m_answ_a31.text = ""
                mm_32.text = ""
                m_answ_a32.text =""
                mm_33.text = ""
                m_answ_a33.text = ""
                m_ans_aa.text = ""
                m_answ_d.text = ""
                textView19.text =""
                divider19.visibility = View.INVISIBLE
                divider20.visibility = View.INVISIBLE
                divider21.visibility = View.INVISIBLE
                divider22.visibility = View.INVISIBLE
                divider23.visibility = View.INVISIBLE
                divider24.visibility = View.INVISIBLE
                divider8.visibility = View.INVISIBLE
                divider2.visibility = View.VISIBLE
                divider6.visibility = View.VISIBLE
                ssss.text = ""

                m_answer.text = ""
            } else {
                Mtitle.text = "Матрица не имеет решения так как определитель равен 0"
                textView51.text = ""
                title_x1.text = ""
                sc_x11.text = ""
                sc_x12.text = ""
                d_x11.text = ""
                d_x12.text = ""
                d_x13.text = ""
                d_x14.text = ""
                d_x15.text = ""
                d_x16.text = ""
                d_x17.text = ""
                d_x18.text = ""
                d_x19.text = ""
                d_x1_g1.text = ""
                d_x1_g8.text = ""

                textView52.text = ""
                title_x2.text = ""
                sc_x21.text = ""
                sc_x22.text = ""
                d_x21.text = ""
                d_x22.text = ""
                d_x23.text = ""
                d_x24.text = ""
                d_x25.text = ""
                d_x26.text = ""
                d_x27.text = ""
                d_x28.text = ""
                d_x29.text = ""

                d_x2_g1.text = ""
                d_x2_g8.text = ""
////
                textView53.text = ""
                title_x3.text = ""
                sc_x31.text = ""
                sc_x32.text = ""
                d_x31.text = ""
                d_x32.text = ""
                d_x33.text = ""
                d_x34.text = ""
                d_x35.text = ""
                d_x36.text = ""
                d_x37.text = ""
                d_x38.text = ""
                d_x39.text = ""

                d_x3_g1.text = ""
                d_x3_g8.text = ""
                divider2.visibility = View.VISIBLE
                divider3.visibility = View.INVISIBLE
                divider4.visibility = View.INVISIBLE
                divider5.visibility = View.INVISIBLE
                answer.text = ""

                answ_x1.text = ""
                answ_x2.text = ""
                answ_x3.text = ""

                answer_m1.text = ""

                answ_x1.textSize = 0F
                answ_x2.textSize = 0F
                answ_x3.textSize = 0F
                answ_m2.text =
                    ""
                m1_1.text = ""; m1_2.textSize = 0F;m1_4.textSize = 0F

                m1_3.text = ""; m1_5.text = ""


                m2_1.text = ""; m2_2.textSize = 0F;m2_4.textSize = 0F

                m2_3.text = ""; m2_5.text = ""


                m3_1.text = ""; m3_2.textSize = 0F;m3_4.textSize = 0F

                m3_3.text = ""; m3_5.text = ""


                m4_1.text = ""; m4_2.textSize = 0F;m4_4.textSize = 0F

                m4_3.text = ""; m4_5.text = ""


                m5_1.text = ""; m5_2.textSize = 0F;m5_4.textSize = 0F

                m5_3.text = ""; m5_5.text = ""


                m6_1.text = ""; m6_2.textSize = 0F;m6_4.textSize = 0F

                m6_3.text = ""; m6_5.text = ""


                m7_1.text = ""; m7_2.textSize = 0F;m7_4.textSize = 0F

                m7_3.text = ""; m7_5.text = ""


                m8_1.text = ""; m8_2.textSize = 0F;m8_4.textSize = 0F

                m8_3.text = ""; m8_5.text = ""


                m9_1.text = ""; m9_2.textSize = 0F;m9_4.textSize = 0F

                m9_3.text = ""; m9_5.text = ""

                m_answ_b1.text = ""
                m_answ_b2.text =""
                m_answ_b3.text = ""

                mm_11.text = ""
                m_answ_a11.text = ""
                mm_12.text = ""
                m_answ_a12.text = ""
                mm_13.text = ""
                m_answ_a13.text = ""

                mm_21.text = ""
                m_answ_a21.text = ""
                mm_22.text = ""
                m_answ_a22.text =""
                mm_23.text = ""
                m_answ_a23.text = ""
                mm_31.text = ""
                m_answ_a31.text = ""
                mm_32.text = ""
                m_answ_a32.text =""
                mm_33.text = ""
                m_answ_a33.text = ""
                m_ans_aa.text = ""
                m_answ_d.text = ""
                textView19.text =""
                divider19.visibility = View.INVISIBLE
                divider20.visibility = View.INVISIBLE
                divider21.visibility = View.INVISIBLE
                divider22.visibility = View.INVISIBLE
                divider23.visibility = View.INVISIBLE
                divider24.visibility = View.INVISIBLE
                divider8.visibility = View.INVISIBLE
                divider2.visibility = View.INVISIBLE
                ssss.text = ""
            }

        }
        catch (e: Exception) {
            Toast.makeText(this, "Ошибка ввода", Toast.LENGTH_SHORT).show()

            Mtitle.text = "Пожалуйста убедитесь что вы правильно ввели переменные"
            d_a_g1.text = ""
            d_a_g8.text = ""
            title_a.text = ""
            m_sc1.text = ""
            m_sc2.text = ""
            d_a1.text = ""
            d_a2.text = ""
            d_a3.text = ""
            d_a4.text = ""
            d_a5.text = ""
            d_a6.text = ""
            d_a7.text = ""
            d_a8.text = ""
            d_a9.text = ""
            textView5.text = ""
            title_a.text = ""
            sc_a1.text = ""
            sc_a2.text = ""
            m_sc1.text = ""
            m_sc2.text = ""
            m_sc1.textSize = 0F
            m_sc2.textSize = 0F
            divider6.visibility = View.INVISIBLE

            q1.text = ""
            q2.text = ""
            q3.text = ""
            textView2.text = ""
            textView53.text = ""
            title_x3.text = ""
            sc_x31.text = ""
            sc_x32.text = ""
            d_x31.text = ""
            d_x32.text = ""
            d_x33.text = ""
            d_x34.text = ""
            d_x35.text = ""
            d_x36.text = ""
            d_x37.text = ""
            d_x38.text = ""
            d_x39.text = ""

            d_x3_g1.text = ""
            d_x3_g8.text = ""
            divider2.visibility = View.INVISIBLE
            divider3.visibility = View.INVISIBLE
            divider4.visibility = View.INVISIBLE
            divider5.visibility = View.INVISIBLE
            answer.text = ""

            answ_x1.text = ""
            answ_x2.text = ""
            answ_x3.text = ""
            textView51.text = ""
            title_x1.text = ""
            sc_x11.text = ""
            sc_x12.text = ""
            d_x11.text = ""
            d_x12.text = ""
            d_x13.text = ""
            d_x14.text = ""
            d_x15.text = ""
            d_x16.text = ""
            d_x17.text = ""
            d_x18.text = ""
            d_x19.text = ""
            d_x1_g1.text = ""
            d_x1_g8.text = ""

            textView52.text = ""
            title_x2.text = ""
            sc_x21.text = ""
            sc_x22.text = ""
            d_x21.text = ""
            d_x22.text = ""
            d_x23.text = ""
            d_x24.text = ""
            d_x25.text = ""
            d_x26.text = ""
            d_x27.text = ""
            d_x28.text = ""
            d_x29.text = ""

            d_x2_g1.text = ""
            d_x2_g8.text = ""
            m_sc1.text = ""
            m_sc2.text = ""

            m_a11.text = ""

            m_sc1.text = ""
            m_sc2.text = ""



            m_a12.text = ""
            plus_1.text = ""




            m_a13.text = ""
            plus_4.text = ""


            m_a21.text = ""

            m_a22.text = ""
            plus_2.text = ""


            m_a23.text = ""
            plus_5.text = ""

            m_a31.text = ""

            m_a32.text = ""
            plus_3.text = ""


            m_a33.text = ""
            plus_6.text = ""

            m_b1.text = ""
            m_b2.text =""
            m_b3.text = ""
            divider8.visibility = View.INVISIBLE
        }

    @SuppressLint("SetTextI18n")
    fun reverse(v: View) {
        try {

        var m1 = m1.text.toString().toInt()
        var m2 = m2.text.toString().toInt()
        var m3 = m3.text.toString().toInt()
        var m4 = m4.text.toString().toInt()
        var m5 = m5.text.toString().toInt()
        var m6 = m6.text.toString().toInt()
        var m7 = m7.text.toString().toInt()
        var m8 = m8.text.toString().toInt()
        var m9 = m9.text.toString().toInt()
        var b1 = b1.text.toString().toInt()
        var b2 = b2.text.toString().toInt()
        var b3 = b3.text.toString().toInt()

        Mtitle.text = "Дана матрица\nРешаем методом обратной матрицы"
        m_sc1.text = "("
        m_sc2.text = ")"

        m_a11.text = "${m1}x"

        m_sc1.text = "("
        m_sc2.text = ")"
        m_sc1.textSize = 110F
        m_sc2.textSize = 110F

        if (expr.matches(m2.toString())) {
            plus_1.text = "-"
            m_a12.text = "${m2 * -1}y"
        } else {
            m_a12.text = "${m2}y"
            plus_1.text = "+"
        }

        if (expr.matches(m3.toString())) {
            plus_4.text = "-"
            m_a13.text = "${m3 * -1}Z"
        } else {
            m_a13.text = "${m3}Z"
            plus_4.text = "+"
        }

        m_a21.text = "${m4}x"

        if (expr.matches(m5.toString())) {
            plus_2.text = "-"
            m_a22.text = "${m5 * -1}y"
        } else {
            m_a22.text = "${m5}y"
            plus_2.text = "+"
        }

        if (expr.matches(m6.toString())) {
            plus_5.text = "-"
            m_a23.text = "${m6 * -1}Z"
        } else {
            m_a23.text = "${m6}Z"
            plus_5.text = "+"
        }

        m_a31.text = "${m7}x"

        if (expr.matches(m8.toString())) {
            plus_3.text = "-"
            m_a32.text = "${m8 * -1}y"
        } else {
            m_a32.text = "${m8}y"
            plus_3.text = "+"
        }

        if (expr.matches(m9.toString())) {
            plus_6.text = "-"
            m_a33.text = "${m9 * -1}Z"
        } else {
            m_a33.text = "${m9}Z"
            plus_6.text = "+"
        }

        m_b1.text = "= ${b1}"
        m_b2.text = "= ${b2}"
        m_b3.text = "= ${b3}"

        textView5.text = "det A = "
        textView2.text = "Находим определитель A"
        sc_a1.text = "|"
        sc_a2.text = "|"

        d_a1.text = m1.toString()
        d_a2.text = m2.toString()
        d_a3.text = m3.toString()
        d_a4.text = m4.toString()
        d_a5.text = m5.toString()
        d_a6.text = m6.toString()
        d_a7.text = m7.toString()
        d_a8.text = m8.toString()
        d_a9.text = m9.toString()
        val o =
            (m1 * m5 * m9) + (m2 * m6 * m7) + (m3 * m4 * m8) + ((m3 * m5 * m7) * -1) + ((m2 * m4 * m9) * -1) + ((m1 * m6 * m8) * -1)
        var x1 =
            (b1 * m5 * m9) + (m2 * m6 * b3) + (m3 * b2 * m8) + ((m3 * m5 * b3) * -1) + ((m2 * b2 * m9) * -1) + ((b1 * m6 * m8) * -1)
        var x2 =
            (m1 * b2 * m9) + (b1 * m6 * m7) + (m3 * m4 * b3) + ((m3 * b2 * m7) * -1) + ((b1 * m4 * m9) * -1) + ((m1 * m6 * b3) * -1)
        var x3 =
            ((m1 * m5 * b3) +
                    (m2 * b2 * m7) +
                    (b1 * m4 * m8)) +
                    (((b1 * m5 * m7) * -1) +
                            ((m2 * m4 * b3) * -1) +
                            ((m1 * b2 * m8) * -1))
        d_a_g1.text = "Главная диагональ : $m1 * $m5 * $m9 = ${m1 * m5 * m9}\n" +
                "    1-й треугольник : $m2 * $m6 * $m7 = ${m2 * m6 * m7}\n" +
                "    2-й треугольник : $m3 * $m4 * $m8 = ${m3 * m4 * m8}\n" +
                "Побочьная диагональ : ( $m3 * $m5 * $m7 )*-1 = ${(m3 * m5 * m7) * -1}\n" +
                "    1-й треугольник : ( $m2 * $m4 * $m9 )*-1 = ${(m2 * m4 * m9) * -1}\n" +
                "    2-й треугольник : ( $m1 * $m6 * $m8 )*-1 = ${(m1 * m6 * m8) * -1}"
        d_a_g8.text = "Сложим все выражения :\n" +
                "    ${m1 * m5 * m9} + ${m2 * m6 * m7} + ${m3 * m4 * m8} + (${(m3 * m5 * m7) * -1}) + " +
                "(${(m2 * m4 * m9) * -1}) + (${(m1 * m6 * m8) * -1}) = " +
                "${(m1 * m5 * m9) + (m2 * m6 * m7) + (m3 * m4 * m8) + ((m3 * m5 * m7) * -1) + ((m2 * m4 * m9) * -1) + ((m1 * m6 * m8) * -1)}\n " +
                "Определитель А : ${o}"

            if (o != 0) {
            answer_m1.text = "3) Производим транспорацию"
            answer.text = "2)Для решения необходимо найти миноры."
            answ_x1.textSize = 0F
            answ_x2.textSize = 0F
            answ_x3.textSize = 0F
            answ_m2.text =
                "4) Умножаем результат транспорации на столбик b и определитель в степени -1"
            m1_1.text = "  1)1^(-2) * "; m1_2.textSize = 14F;m1_4.textSize = 14F

            m1_3.text = "$m5  $m6 \n $m8  $m9"; m1_5.text = " = ${(m5 * m9) - (m6 * m8)}"


            m2_1.text = "  2)1^(-3) * "; m2_2.textSize = 14F;m2_4.textSize = 14F

            m2_3.text = "$m4  $m6 \n $m7  $m9"; m2_5.text = " = ${((m4 * m9) - (m6 * m7)) * -1}"


            m3_1.text = "  3)1^(-4) * "; m3_2.textSize = 14F;m3_4.textSize = 14F

            m3_3.text = "$m4  $m5 \n $m7  $m8"; m3_5.text = " = ${(m4 * m8) - (m5 * m7)}"


            m4_1.text = "  4)1^(-3) * "; m4_2.textSize = 14F;m4_4.textSize = 14F

            m4_3.text = "$m2  $m3 \n $m8  $m9"; m4_5.text = " = ${((m2 * m9) - (m3 * m8)) * -1}"


            m5_1.text = "  5)1^(-4) * "; m5_2.textSize = 14F;m5_4.textSize = 14F

            m5_3.text = "$m1  $m3 \n $m7  $m9"; m5_5.text = " = ${(m1 * m9) - (m7 * m3)}"


            m6_1.text = "  6)1^(-5) * "; m6_2.textSize = 14F;m6_4.textSize = 14F

            m6_3.text = "$m1  $m2 \n $m7  $m8"; m6_5.text = " = ${((m1 * m8) - (m7 * m2)) * -1}"


            m7_1.text = "  7)1^(-4) * "; m7_2.textSize = 14F;m7_4.textSize = 14F

            m7_3.text = "$m2  $m3 \n $m5  $m6"; m7_5.text = " = ${(m2 * m6) - (m5 * m3)}"


            m8_1.text = "  8)1^(-5) * "; m8_2.textSize = 14F;m8_4.textSize = 14F

            m8_3.text = "$m1  $m3 \n $m4  $m6"; m8_5.text = " = ${((m1 * m6) - (m4 * m3)) * -1}"


            m9_1.text = "  9)1^(-6) * "; m9_2.textSize = 14F;m9_4.textSize = 14F

            m9_3.text = "$m1  $m2 \n $m4  $m5"; m9_5.text = " = ${(m1 * m5) - (m2 * m4)}"

            var a11 = (m5 * m9) - (m6 * m8)
            var a12 = ((m2 * m9) - (m3 * m8)) * -1
            var a13 = (m2 * m6) - (m5 * m3)
            var a21 = ((m4 * m9) - (m6 * m7)) * -1
            var a22 = (m1 * m9) - (m7 * m3)
            var a23 = ((m1 * m6) - (m4 * m3)) * -1
            var a31 = (m4 * m8) - (m5 * m7)
            var a32 = ((m1 * m8) - (m7 * m2)) * -1
            var a33 = (m1 * m5) - (m2 * m4)

            m_answ_b1.text = b1.toString()
            m_answ_b2.text = b2.toString()
            m_answ_b3.text = b3.toString()

            mm_11.text = a11.toString()
            m_answ_a11.text = a11.toString()
            mm_12.text = a12.toString()
            m_answ_a12.text = a12.toString()
            mm_13.text = a13.toString()
            m_answ_a13.text = a13.toString()

            mm_21.text = a21.toString()
            m_answ_a21.text = a21.toString()
            mm_22.text = a22.toString()
            m_answ_a22.text = a22.toString()
            mm_23.text = a23.toString()
            m_answ_a23.text = a23.toString()
            mm_31.text = a31.toString()
            m_answ_a31.text = a31.toString()
            mm_32.text = a32.toString()
            m_answ_a32.text = a32.toString()
            mm_33.text = a33.toString()
            m_answ_a33.text = a33.toString()
            m_ans_aa.text = o.toString()
            m_answ_d.text = "-1"
            textView19.text = "X"
            divider19.visibility = View.VISIBLE
            divider20.visibility = View.VISIBLE
            divider21.visibility = View.VISIBLE
            divider22.visibility = View.VISIBLE
            divider23.visibility = View.VISIBLE
            divider6.visibility = View.VISIBLE
            divider24.visibility = View.VISIBLE
            divider8.visibility = View.VISIBLE
            divider2.visibility = View.VISIBLE
            ssss.text = "X"

            m_answer.text = "Ответ равен : \n" +
                    "   X1 = ${x1.toDouble() / o}\n" +
                    "   X2 = ${x2.toDouble() / o}\n" +
                    "   X3 = ${x3.toDouble() / o}"







            textView51.text = ""
            title_x1.text = ""
            sc_x11.text = ""
            sc_x12.text = ""
            d_x11.text = ""
            d_x12.text = ""
            d_x13.text = ""
            d_x14.text = ""
            d_x15.text =""
            d_x16.text = ""
            d_x17.text = ""
            d_x18.text = ""
            d_x19.text = ""

            d_x1_g1.text = ""
            d_x1_g8.text = ""
                d_x2_g1.text = ""
                d_x2_g8.text = ""
                d_x3_g1.text = ""
                d_x3_g8.text = ""


            textView52.text = ""
            title_x2.text = ""
            sc_x21.text = ""
            sc_x22.text = ""
            d_x21.text = ""
            d_x22.text = ""
            d_x23.text = ""
            d_x24.text =""
            d_x25.text = ""
            d_x26.text = ""
            d_x27.text = ""
            d_x28.text = ""
            d_x29.text = ""

            d_x2_g1.text = ""
            d_x2_g8.text = ""
////
            textView53.text = ""
            title_x3.text = ""
            sc_x31.text = ""
            sc_x32.text = ""
            d_x31.text = ""
            d_x32.text = ""
            d_x33.text = ""
            d_x34.text =""
            d_x35.text = ""
            d_x36.text = ""
            d_x37.text = ""
            d_x38.text = ""
            d_x39.text = ""
            d_x1_g1.text = ""
            d_x1_g8.text = ""
            d_x3_g8.text = ""
            divider2.visibility = View.INVISIBLE
            divider3.visibility = View.INVISIBLE
            divider4.visibility = View.INVISIBLE
            divider5.visibility = View.INVISIBLE

        }

            else{
            Mtitle.text = "Матрица не имеет решения так как определитель равен 0"
            textView51.text = ""
            title_x1.text = ""
            sc_x11.text = ""
            sc_x12.text = ""
            d_x11.text = ""
            d_x12.text = ""
            d_x13.text = ""
            d_x14.text = ""
            d_x15.text = ""
            d_x16.text = ""
            d_x17.text = ""
            d_x18.text = ""
            d_x19.text = ""
            d_x1_g1.text = ""
            d_x1_g8.text = ""

            textView52.text = ""
            title_x2.text = ""
            sc_x21.text = ""
            sc_x22.text = ""
            d_x21.text = ""
            d_x22.text = ""
            d_x23.text = ""
            d_x24.text = ""
            d_x25.text = ""
            d_x26.text = ""
            d_x27.text = ""
            d_x28.text = ""
            d_x29.text = ""

            d_x2_g1.text = ""
            d_x2_g8.text = ""
////
            textView53.text = ""
            title_x3.text = ""
            sc_x31.text = ""
            sc_x32.text = ""
            d_x31.text = ""
            d_x32.text = ""
            d_x33.text = ""
            d_x34.text = ""
            d_x35.text = ""
            d_x36.text = ""
            d_x37.text = ""
            d_x38.text = ""
            d_x39.text = ""

            d_x3_g1.text = ""
            d_x3_g8.text = ""
            divider2.visibility = View.VISIBLE
            divider3.visibility = View.INVISIBLE
            divider4.visibility = View.INVISIBLE
            divider5.visibility = View.INVISIBLE
            divider19.visibility = View.INVISIBLE
            divider20.visibility = View.INVISIBLE
            divider21.visibility = View.INVISIBLE
            divider22.visibility = View.INVISIBLE
            divider23.visibility = View.INVISIBLE
            divider24.visibility = View.INVISIBLE
            divider8.visibility = View.VISIBLE
//            divider2.visibility = View.INVISIBLE
            answer.text = ""

            answ_x1.text = ""
            answ_x2.text = ""
            answ_x3.text = ""
            /////////////////////////////////////////////

            answer_m1.text = ""
            answer.text = "."
            answ_x1.textSize = 0F
            answ_x2.textSize = 0F
            answ_x3.textSize = 0F
            answ_m2.text =
                ""
            m1_1.text = ""; m1_2.textSize = 0F;m1_4.textSize = 0F

            m1_3.text = ""; m1_5.text = ""


            m2_1.text = ""; m2_2.textSize = 0F;m2_4.textSize = 0F

            m2_3.text = ""; m2_5.text = ""


            m3_1.text = ""; m3_2.textSize = 0F;m3_4.textSize = 0F

            m3_3.text = ""; m3_5.text = ""


            m4_1.text = ""; m4_2.textSize = 0F;m4_4.textSize = 0F

            m4_3.text = ""; m4_5.text = ""


            m5_1.text = ""; m5_2.textSize = 0F;m5_4.textSize = 0F

            m5_3.text = ""; m5_5.text = ""


            m6_1.text = ""; m6_2.textSize = 0F;m6_4.textSize = 0F

            m6_3.text = ""; m6_5.text = ""


            m7_1.text = ""; m7_2.textSize = 0F;m7_4.textSize = 0F

            m7_3.text = ""; m7_5.text = ""


            m8_1.text = ""; m8_2.textSize =0F;m8_4.textSize = 0F

            m8_3.text = ""; m8_5.text = ""


            m9_1.text = ""; m9_2.textSize = 0F;m9_4.textSize = 0F

            m9_3.text = ""; m9_5.text = ""

            m_answ_b1.text = ""
            m_answ_b2.text = ""
            m_answ_b3.text = ""

            mm_11.text = ""
            m_answ_a11.text = ""
            mm_12.text = ""
            m_answ_a12.text = ""
            mm_13.text = ""
            m_answ_a13.text = ""

            mm_21.text = ""
            m_answ_a21.text = ""
            mm_22.text = ""
            m_answ_a22.text = ""
            mm_23.text = ""
            m_answ_a23.text = ""
            mm_31.text = ""
            m_answ_a31.text = ""
            mm_32.text = ""
            m_answ_a32.text = ""
            mm_33.text = ""
            m_answ_a33.text = ""
            m_ans_aa.text = ""
            m_answ_d.text = ""
            textView19.text = ""
            ssss.text = ""

            m_answer.text =""
        }
        }

        catch (e: Exception) {
            Toast.makeText(this, "Ошибка ввода", Toast.LENGTH_SHORT).show()

            Mtitle.text = "Пожалуйста убедитесь что вы правильно ввели переменные"
            d_a_g1.text = ""
            d_a_g8.text = ""
            title_a.text = ""
            m_sc1.text = ""
            m_sc2.text = ""
            d_a1.text = ""
            d_a2.text = ""
            d_a3.text = ""
            d_a4.text = ""
            d_a5.text = ""
            d_a6.text = ""
            d_a7.text = ""
            d_a8.text = ""
            d_a9.text = ""
            textView5.text = ""
            title_a.text = ""
            sc_a1.text = ""
            sc_a2.text = ""
            m_sc1.text = ""
            m_sc2.text = ""
            m_sc1.textSize = 0F
            m_sc2.textSize = 0F
            divider6.visibility = View.INVISIBLE

            q1.text = ""
            q2.text = ""
            q3.text = ""
            textView2.text = ""
            textView53.text = ""
            title_x3.text = ""
            sc_x31.text = ""
            sc_x32.text = ""
            d_x31.text = ""
            d_x32.text = ""
            d_x33.text = ""
            d_x34.text = ""
            d_x35.text = ""
            d_x36.text = ""
            d_x37.text = ""
            d_x38.text = ""
            d_x39.text = ""

            d_x3_g1.text = ""
            d_x3_g8.text = ""
            divider2.visibility = View.INVISIBLE
            divider3.visibility = View.INVISIBLE
            divider4.visibility = View.INVISIBLE
            divider5.visibility = View.INVISIBLE
            answer.text = ""

            answ_x1.text = ""
            answ_x2.text = ""
            answ_x3.text = ""
            textView51.text = ""
            title_x1.text = ""
            sc_x11.text = ""
            sc_x12.text = ""
            d_x11.text = ""
            d_x12.text = ""
            d_x13.text = ""
            d_x14.text = ""
            d_x15.text = ""
            d_x16.text = ""
            d_x17.text = ""
            d_x18.text = ""
            d_x19.text = ""
            d_x1_g1.text = ""
            d_x1_g8.text = ""

            textView52.text = ""
            title_x2.text = ""
            sc_x21.text = ""
            sc_x22.text = ""
            d_x21.text = ""
            d_x22.text = ""
            d_x23.text = ""
            d_x24.text = ""
            d_x25.text = ""
            d_x26.text = ""
            d_x27.text = ""
            d_x28.text = ""
            d_x29.text = ""

            d_x2_g1.text = ""
            d_x2_g8.text = ""
            m_sc1.text = ""
            m_sc2.text = ""

            m_a11.text = ""

            m_sc1.text = ""
            m_sc2.text = ""



            m_a12.text = ""
            plus_1.text = ""




            m_a13.text = ""
            plus_4.text = ""


            m_a21.text = ""

            m_a22.text = ""
            plus_2.text = ""


            m_a23.text = ""
            plus_5.text = ""

            m_a31.text = ""

            m_a32.text = ""
            plus_3.text = ""


            m_a33.text = ""
            plus_6.text = ""

            m_b1.text = ""
            m_b2.text =""
            m_b3.text = ""
            divider8.visibility = View.INVISIBLE



            ////////////////


            answer_m1.text = ""
            answer.text = ""
            answ_x1.textSize = 0F
            answ_x2.textSize = 0F
            answ_x3.textSize = 0F
            answ_m2.text =
                ""
            m1_1.text = ""; m1_2.textSize = 0F;m1_4.textSize = 0F

            m1_3.text = ""; m1_5.text = ""


            m2_1.text = ""; m2_2.textSize = 0F;m2_4.textSize = 0F

            m2_3.text = ""; m2_5.text = ""


            m3_1.text = ""; m3_2.textSize = 0F;m3_4.textSize = 0F

            m3_3.text = ""; m3_5.text = ""


            m4_1.text = ""; m4_2.textSize = 0F;m4_4.textSize = 0F

            m4_3.text = ""; m4_5.text = ""


            m5_1.text = ""; m5_2.textSize = 0F;m5_4.textSize = 0F

            m5_3.text = ""; m5_5.text = ""


            m6_1.text = ""; m6_2.textSize = 0F;m6_4.textSize = 0F

            m6_3.text = ""; m6_5.text = ""


            m7_1.text = ""; m7_2.textSize = 0F;m7_4.textSize = 0F

            m7_3.text = ""; m7_5.text = ""


            m8_1.text = ""; m8_2.textSize = 0F;m8_4.textSize = 0F

            m8_3.text = ""; m8_5.text = ""


            m9_1.text = ""; m9_2.textSize = 0F;m9_4.textSize = 0F

            m9_3.text = ""; m9_5.text = ""



            m_answ_b1.text = ""
            m_answ_b2.text = ""
            m_answ_b3.text = ""

            mm_11.text = ""
            m_answ_a11.text = ""
            mm_12.text = ""
            m_answ_a12.text = ""
            mm_13.text = ""
            m_answ_a13.text = ""

            mm_21.text = ""
            m_answ_a21.text =""
            mm_22.text = ""
            m_answ_a22.text = ""
            mm_23.text = ""
            m_answ_a23.text = ""
            mm_31.text = ""
            m_answ_a31.text = ""
            mm_32.text =""
            m_answ_a32.text = ""
            mm_33.text = ""
            m_answ_a33.text = ""
            m_ans_aa.text = ""
            m_answ_d.text = ""
            textView19.text = ""
            divider19.visibility = View.INVISIBLE
            divider20.visibility = View.INVISIBLE
            divider21.visibility = View.INVISIBLE
            divider22.visibility = View.INVISIBLE
            divider23.visibility = View.INVISIBLE
            divider6.visibility = View.INVISIBLE
            divider24.visibility = View.INVISIBLE
            divider8.visibility = View.INVISIBLE
            divider2.visibility = View.INVISIBLE
            ssss.text = ""

            m_answer.text = ""






            textView51.text = ""
            title_x1.text = ""
            sc_x11.text = ""
            sc_x12.text = ""
            d_x11.text = ""
            d_x12.text = ""
            d_x13.text = ""
            d_x14.text = ""
            d_x15.text =""
            d_x16.text = ""
            d_x17.text = ""
            d_x18.text = ""
            d_x19.text = ""

            d_x1_g1.text = ""
            d_x1_g8.text = ""
            d_x2_g1.text = ""
            d_x2_g8.text = ""
            d_x3_g1.text = ""
            d_x3_g8.text = ""


            textView52.text = ""
            title_x2.text = ""
            sc_x21.text = ""
            sc_x22.text = ""
            d_x21.text = ""
            d_x22.text = ""
            d_x23.text = ""
            d_x24.text =""
            d_x25.text = ""
            d_x26.text = ""
            d_x27.text = ""
            d_x28.text = ""
            d_x29.text = ""

            d_x2_g1.text = ""
            d_x2_g8.text = ""
////
            textView53.text = ""
            title_x3.text = ""
            sc_x31.text = ""
            sc_x32.text = ""
            d_x31.text = ""
            d_x32.text = ""
            d_x33.text = ""
            d_x34.text =""
            d_x35.text = ""
            d_x36.text = ""
            d_x37.text = ""
            d_x38.text = ""
            d_x39.text = ""
            d_x1_g1.text = ""
            d_x1_g8.text = ""
            d_x3_g8.text = ""
            divider2.visibility = View.INVISIBLE
            divider3.visibility = View.INVISIBLE
            divider4.visibility = View.INVISIBLE
            divider5.visibility = View.INVISIBLE

            answer.text = ""
        }


    }
}


































