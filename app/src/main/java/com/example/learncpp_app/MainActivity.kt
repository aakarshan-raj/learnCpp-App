package com.example.learncpp_app

import android.bluetooth.BluetoothCsipSetCoordinator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.internal.NavigationMenu
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var drawerLayout:DrawerLayout
    lateinit var coordinatorLayout:CoordinatorLayout
    lateinit var toolbar:Toolbar
    lateinit var navigationView:NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawerLayout = findViewById(R.id.drawerLayout)
        coordinatorLayout = findViewById(R.id.coordinatorLayout)
        toolbar = findViewById(R.id.toolbar)
        navigationView = findViewById(R.id.navigationView)
        setToolBar()
        var actionBarDrawerToggle = ActionBarDrawerToggle(this@MainActivity,drawerLayout,R.string.open_drawer,R.string.close_drawer)
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
        navigationView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.one->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,Introduction()).commit()
                    drawerLayout.closeDrawers()
                }

                R.id.two->Toast.makeText(this,"Basics",Toast.LENGTH_LONG).show()
                R.id.three->Toast.makeText(this,"Variables",Toast.LENGTH_LONG).show()
                R.id.four->Toast.makeText(this,"Loops",Toast.LENGTH_LONG).show()
                R.id.five->Toast.makeText(this,"Headers",Toast.LENGTH_LONG).show()
                R.id.six->Toast.makeText(this,"Compiler",Toast.LENGTH_LONG).show()
                R.id.seven->Toast.makeText(this,"Extras",Toast.LENGTH_LONG).show()
            }
            return@setNavigationItemSelectedListener true
        }
    }

    fun setToolBar(){
        setSupportActionBar(toolbar)
        supportActionBar?.title = "LearnCpp"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var icon = item.itemId
        if(icon == android.R.id.home){
            drawerLayout.openDrawer(GravityCompat.START)
        }
        return super.onOptionsItemSelected(item)
    }
}