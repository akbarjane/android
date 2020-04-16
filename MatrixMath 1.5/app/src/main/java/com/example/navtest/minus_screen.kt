package com.example.MatrixMath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_det__screen_3.*
import kotlinx.android.synthetic.main.activity_det__screen_3.imageView2
import kotlinx.android.synthetic.main.activity_minus_screen.*
import kotlinx.android.synthetic.main.activity_sum__screen.*

class minus_screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_minus_screen)

        imageView2.setOnClickListener{
            startActivity(Intent(this,ariph_screen::class.java))
        }

        btn_minus.setOnClickListener {
            try {
                var result = arrayOf(
                    arrayOf(0, 0, 0),
                    arrayOf(0, 0, 0),
                    arrayOf(0, 0, 0))

                var a_a11 = findViewById<EditText>(R.id.a_m_a11).text.toString()
                var a_a12 = findViewById<EditText>(R.id.a_m_a12).text.toString()
                var a_a13 = findViewById<EditText>(R.id.a_m_a13).text.toString()

                var a_a21 = findViewById<EditText>(R.id.a_m_a21).text.toString()
                var a_a22 = findViewById<EditText>(R.id.a_m_a22).text.toString()
                var a_a23 = findViewById<EditText>(R.id.a_m_a23).text.toString()

                var a_a31 = findViewById<EditText>(R.id.a_m_a31).text.toString()
                var a_a32 = findViewById<EditText>(R.id.a_m_a32).text.toString()
                var a_a33 = findViewById<EditText>(R.id.a_m_a33).text.toString()
                val A = arrayOf(
                    arrayOf(a_a11, a_a12, a_a13),
                    arrayOf(a_a21, a_a22, a_a23),
                    arrayOf(a_a31, a_a32, a_a33))


                var b_a11 = findViewById<EditText>(R.id.a_m2_a11).text.toString()
                var b_a12 = findViewById<EditText>(R.id.a_m2_a12).text.toString()
                var b_a13 = findViewById<EditText>(R.id.a_m2_a13).text.toString()

                var b_a21 = findViewById<EditText>(R.id.a_m2_a21).text.toString()
                var b_a22 = findViewById<EditText>(R.id.a_m2_a22).text.toString()
                var b_a23 = findViewById<EditText>(R.id.a_m2_a23).text.toString()

                var b_a31 = findViewById<EditText>(R.id.a_m2_a31).text.toString()
                var b_a32 = findViewById<EditText>(R.id.a_m2_a32).text.toString()
                var b_a33 = findViewById<EditText>(R.id.a_m2_a33).text.toString()
                val B = arrayOf(
                    arrayOf(b_a11, b_a12, b_a13),
                    arrayOf(b_a21, b_a22, b_a23),
                    arrayOf(b_a31, b_a32, b_a33))


                for (l in A.indices) {
                    for (j in B[0].indices) {
                        result[l][j] += ((A[l][j]).toInt() - (B[l][j]).toInt())

                    }
                }

                a_mA_a11.setText("${result[0][0]}").toString()
                a_mA_a12.setText("${result[0][1]}").toString()
                a_mA_a13.setText("${result[0][2]}").toString()

                a_mA_a21.setText("${result[1][0]}").toString()
                a_mA_a22.setText("${result[1][1]}").toString()
                a_mA_a23.setText("${result[1][2]}").toString()

                a_mA_a31.setText("${result[2][0]}").toString()
                a_mA_a32.setText("${result[2][1]}").toString()
                a_mA_a33.setText("${result[2][2]}").toString()
                minus_title.setText("Ответ равен :").toString()
            }
            catch (e: Exception){
                a_mA_a11.setText("").toString()
                a_mA_a12.setText("").toString()
                a_mA_a13.setText("").toString()

                a_mA_a21.setText("").toString()
                a_mA_a22.setText("").toString()
                a_mA_a23.setText("").toString()

                a_mA_a31.setText("").toString()
                a_mA_a32.setText("").toString()
                a_mA_a33.setText("").toString()
                minus_title.setText("Пожалуйста введите все переменные !").toString()
            }
        }
    }

}
