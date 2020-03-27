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
//            }
//            R.id.nav_update -> {
//                Toast.makeText(this, "Update clicked", Toast.LENGTH_SHORT).show()
//            }
//            R.id.nav_logout -> {
//                Toast.makeText(this, "Sign out clicked", Toast.LENGTH_SHORT).show()
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
    fun Det_list_selected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.Det_Screen_3 -> {
                Toast.makeText(this, "Determinant 3x3 clicked", Toast.LENGTH_SHORT).show()
                val screen = Intent(this, Det_Screen_3::class.java)
                startActivity(screen)
            }

            R.id.Det_Screen_2 -> {
                Toast.makeText(this, "Determinant 2x2 clicked", Toast.LENGTH_SHORT).show()
                val screen = Intent(this, Det_Screen_2::class.java)
                startActivity(screen)

            }

            R.id.Rev_Screen_3 -> {
                Toast.makeText(this, "Reverse 3x3 clicked", Toast.LENGTH_SHORT).show()
                val screen = Intent(this, Rev_Screen_3::class.java)
                startActivity(screen)
            }

            R.id.Rev_Screen_2 -> {
                Toast.makeText(this, "Reverse 2x2 clicked", Toast.LENGTH_SHORT).show()
                val screen = Intent(this, Rev_Screen_2::class.java)
                startActivity(screen)
            }
            R.id.Minor_Screen -> {
                Toast.makeText(this, "Minors clicked", Toast.LENGTH_SHORT).show()
                val screen = Intent(this, Minor_Screen::class.java)
                startActivity(screen)
        }
            R.id.Rang_Screen -> {
                Toast.makeText(this, "Rang clicked", Toast.LENGTH_SHORT).show()
                val screen = Intent(this, Rang_Screen::class.java)
                startActivity(screen)
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }



}