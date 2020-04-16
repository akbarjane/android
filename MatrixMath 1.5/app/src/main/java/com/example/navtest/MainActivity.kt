package com.example.MatrixMath

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
//import com.example.myapplication.DetA
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception
import kotlinx.android.synthetic.main.matrix_kramer.*
import kotlin.math.pow

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

        lateinit var toolbar: Toolbar
        lateinit var drawerLayout: DrawerLayout
        lateinit var navView: NavigationView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.nav_calc)
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

            calcNum.addTextChangedListener(object : TextWatcher{
                override fun afterTextChanged(s: Editable?) {
                }
                override fun beforeTextChanged( s: CharSequence?, start: Int, count: Int, after: Int) {

                }
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    try {
                        val ex = ExpressionBuilder(calcNum.text.toString()).build()
                        val result = ex.evaluate()
                        val longRes = result.toLong()
                        if (result == longRes.toDouble()){
                            calcPrev.setText("$longRes").toString()
                        }
                        else{
                            calcPrev.setText("$result").toString()
                        }
                    } catch (e: Exception) {
                        Log.d("Ошибка", "Сообщение : ${e.message}")
                    }
                }
            })

            num_0.setOnClickListener { setTextFields("0") }

            num_1.setOnClickListener { setTextFields("1") }

            num_2.setOnClickListener { setTextFields("2") }

            num_3.setOnClickListener { setTextFields("3") }

            num_4.setOnClickListener { setTextFields("4") }

            num_5.setOnClickListener { setTextFields("5") }

            num_6.setOnClickListener { setTextFields("6") }

            num_7.setOnClickListener { setTextFields("7") }

            num_8.setOnClickListener { setTextFields("8") }

            num_9.setOnClickListener { setTextFields("9") }

            num_open.setOnClickListener { setTextFields("(") }

            num_close.setOnClickListener { setTextFields(")") }

            num_cona.setOnClickListener { setTextFields(".") }

            num_clear.setOnClickListener {
                calcNum.setText("").toString()
            }

            num_clear.setOnLongClickListener {
                calcNum.setText("").toString().toBoolean()
                calcAnswer.setText("").toString().toBoolean()
            }

            num_back.setOnClickListener {
                val str = calcNum.text.toString()
                if (str.isNotEmpty()) {
                    calcNum.setText(str.substring(0, str.length - 1))
                }
            }

            num_plus.setOnClickListener { setTextFields("+")}

            num_minus.setOnClickListener { setTextFields("-") }

            num_devision.setOnClickListener { setTextFields("/")
            }

            num_mult.setOnClickListener { setTextFields("*") }

            num_x2.setOnClickListener {
                try {
                    val ex = ExpressionBuilder(calcNum.text.toString()).build()
                    var result = ex.evaluate().toString().toDouble().pow(2)
                    val longRes = result.toLong()
                    if (result == longRes.toDouble()) {
                        calcAnswer.setText("(${calcNum.text})² =  ${result.toInt()}").toString()
                        calcNum.setText("${result.toInt()}").toString()
                    }
                    else{
                        calcAnswer.setText("($result)²").toString()
                        calcNum.setText("$result").toString()
                    }
                } catch (e: Exception) {
                    Log.d("Ошибка", "Сообщение : ${e.message}")
                }
            }

            num_root.setOnClickListener {
                try {
                    val ex = ExpressionBuilder(calcNum.text.toString()).build()
                    var result = ex.evaluate().toString().toDouble().pow(0.5)
                    val longRes = result.toLong()
                    if (result == longRes.toDouble()) {
                        calcAnswer.setText("²√(${calcNum.text}) =  ${result.toInt()}").toString()
                        calcNum.setText("${result.toInt()}").toString()
                    }
                    else{
                        calcAnswer.setText("²√($result)").toString()
                        calcNum.setText("$result").toString()
                    }
                } catch (e: Exception) {
                    Log.d("Ошибка", "Сообщение : ${e.message}")
                }
            }

            num_answer.setOnClickListener {
                try {
                    val ex = ExpressionBuilder(calcNum.text.toString()).build()
                    val result = ex.evaluate()
                    val longRes = result.toLong()
                    if (result == longRes.toDouble()){
                        calcAnswer.setText(calcNum.text.toString() + " = " + longRes).toString()
                        calcNum.setText("$longRes").toString()
                    }
                    else{
                        calcAnswer.setText("$result").toString()
                    }
                } catch (e: Exception) {
                    Log.d("Ошибка", "Сообщение : ${e.message}")
                }
            }
        }


    private fun setTextFields(str: String){
        calcNum.append(str)
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

    }

