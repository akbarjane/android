package com.example.MatrixMath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView



class DetActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nav_det)
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
    fun Det_list_selected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.Det_Screen_3 -> {
                startActivity(Intent(this, Det_Screen_3::class.java))
            }

            R.id.Det_Screen_2 -> {
                startActivity(Intent(this, Det_Screen_2::class.java))
            }

            R.id.Rev_Screen_3 -> {
                startActivity(Intent(this, Rev_Screen_3::class.java))
            }

            R.id.Rev_Screen_2 -> {
                startActivity(Intent(this, Rev_Screen_2::class.java))
            }
            R.id.Minor_Screen -> {
                startActivity(Intent(this, Minor_Screen::class.java))
        }
            R.id.Rang_Screen -> {
                startActivity(Intent(this, Rang_Screen::class.java))
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }



}