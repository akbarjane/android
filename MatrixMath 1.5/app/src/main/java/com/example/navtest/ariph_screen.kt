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
import kotlinx.android.synthetic.main.activity_det_activity.*

class ariph_screen : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nav_ariph)
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
    fun Ariph_list_selected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.ariph_1 -> {
                startActivity(Intent(this, Sum_Screen::class.java))
            }

            R.id.ariph_2 -> {
                startActivity(Intent(this, minus_screen::class.java))
            }

            R.id.ariph_3 -> {
                startActivity(Intent(this, Mult_screen::class.java))
            }

            R.id.ariph_4 -> {
                startActivity(Intent(this, Mult_screen_1::class.java))
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}
