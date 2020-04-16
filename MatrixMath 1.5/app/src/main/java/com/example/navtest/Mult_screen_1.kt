package com.example.MatrixMath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_det__screen_3.*
import kotlinx.android.synthetic.main.activity_det__screen_3.imageView2
import kotlinx.android.synthetic.main.activity_mult_screen_1.*

class Mult_screen_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mult_screen_1)

        imageView2.setOnClickListener{
            startActivity(Intent(this,ariph_screen::class.java))
        }

        btn_mult_1.setOnClickListener {
            try {
                var result = arrayOf(
                    arrayOf(0, 0, 0),
                    arrayOf(0, 0, 0),
                    arrayOf(0, 0, 0))

                var a_a11 = findViewById<EditText>(R.id.a_m1_a11).text.toString()
                var a_a12 = findViewById<EditText>(R.id.a_m1_a12).text.toString()
                var a_a13 = findViewById<EditText>(R.id.a_m1_a13).text.toString()

                var a_a21 = findViewById<EditText>(R.id.a_m1_a21).text.toString()
                var a_a22 = findViewById<EditText>(R.id.a_m1_a22).text.toString()
                var a_a23 = findViewById<EditText>(R.id.a_m1_a23).text.toString()

                var a_a31 = findViewById<EditText>(R.id.a_m1_a31).text.toString()
                var a_a32 = findViewById<EditText>(R.id.a_m1_a32).text.toString()
                var a_a33 = findViewById<EditText>(R.id.a_m1_a33).text.toString()
                val A = arrayOf(
                    arrayOf(a_a11, a_a12, a_a13),
                    arrayOf(a_a21, a_a22, a_a23),
                    arrayOf(a_a31, a_a32, a_a33))


                var b_a1 = findViewById<EditText>(R.id.b_a1).text.toString()



                for (l in A.indices) {
                    for (j in A.indices) {
                        result[l][j] += ((A[l][j]).toInt() * b_a1.toInt())

                    }
                }

                a_m1A_a11.setText("${result[0][0]}").toString()
                a_m1A_a12.setText("${result[0][1]}").toString()
                a_m1A_a13.setText("${result[0][2]}").toString()

                a_m1A_a21.setText("${result[1][0]}").toString()
                a_m1A_a22.setText("${result[1][1]}").toString()
                a_m1A_a23.setText("${result[1][2]}").toString()

                a_m1A_a31.setText("${result[2][0]}").toString()
                a_m1A_a32.setText("${result[2][1]}").toString()
                a_m1A_a33.setText("${result[2][2]}").toString()
                mult_1_title.setText("Ответ равен :").toString()
            }
            catch (e: Exception){
                a_m1A_a11.setText("").toString()
                a_m1A_a12.setText("").toString()
                a_m1A_a13.setText("").toString()

                a_m1A_a21.setText("").toString()
                a_m1A_a22.setText("").toString()
                a_m1A_a23.setText("").toString()

                a_m1A_a31.setText("").toString()
                a_m1A_a32.setText("").toString()
                a_m1A_a33.setText("").toString()
                mult_1_title.setText("Пожалуйста введите все переменные !").toString()
            }
        }



    }

}
