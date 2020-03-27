package com.example.navtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
//import com.example.myapplication.DetA
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
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
                this, drawerLayout, toolbar, 0,0)
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()
            navView.setNavigationItemSelectedListener(this)






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
                calcNum.text = ""
            }

            num_back.setOnClickListener {
                val str = calcNum.text.toString()
                if (str.isNotEmpty()) {
                    calcNum.text = str.substring(0, str.length - 1)
                }
            }

            num_plus.setOnClickListener { setTextFields("+") }

            num_minus.setOnClickListener { setTextFields("-") }

            num_devision.setOnClickListener { setTextFields("/") }

            num_mult.setOnClickListener { setTextFields("*") }

            num_x2.setOnClickListener {
                try {
                    var exx = calcNum.text.toString().toDouble()
                    var result = exx.pow(2)
                    val longRes = result.toLong()
                    if (result == longRes.toDouble())
                        calcAnswer.text = ("\n" + longRes.toString())
                    else
                        calcAnswer.text = result.toString()
                } catch (e: Exception) {
                    Log.d("Ошибка", "Сообщение : ${e.message}")
                }
            }

            num_root.setOnClickListener {
                try {
                    var exx = calcNum.text.toString().toDouble()
                    var result = exx.pow(0.5)
                    val longRes = result.toLong()
                    if (result == longRes.toDouble())
                        calcAnswer.text = "\n" + longRes.toString()
                    else
                        calcAnswer.text = result.toString()
                } catch (e: Exception) {
                    Log.d("Ошибка", "Сообщение : ${e.message}")
                }
            }

            num_answer.setOnClickListener {
                try {
                    val ex = ExpressionBuilder(calcNum.text.toString()).build()
                    val result = ex.evaluate()
                    val longRes = result.toLong()
                    if (result == longRes.toDouble())
                        calcAnswer.text = "\n" + longRes.toString()
                    else
                        calcAnswer.text = result.toString()
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
                Toast.makeText(this, "Calculator clicked", Toast.LENGTH_SHORT).show()
                val screen = Intent(this, MainActivity::class.java)
                startActivity(screen)
            }
            R.id.matrix_kramer_screen -> {
                Toast.makeText(this, "Matrix clicked", Toast.LENGTH_SHORT).show()
                val screen = Intent(this, Matrix_activity::class.java)
                startActivity(screen)
            }
            R.id.matrix_det_screen -> {
                Toast.makeText(this, "DEt clicked", Toast.LENGTH_SHORT).show()
                val screen = Intent(this, DetActivity::class.java)
                startActivity(screen)
            }
//            R.id.nav_update -> {
//                Toast.makeText(this, "Update clicked", Toast.LENGTH_SHORT).show()
//            }
//            R.id.nav_logout -> {
//                Toast.makeText(this, "Sign out clicked", Toast.LENGTH_SHORT).show()
//                }
            }
            drawerLayout.closeDrawer(GravityCompat.START)
            return true
        }




    }

