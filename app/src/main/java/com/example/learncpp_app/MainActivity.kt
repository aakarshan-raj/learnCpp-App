package com.example.learncpp_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
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

                R.id.two-> {
                    supportFragmentManager.beginTransaction().replace(R.id.frame,VariablesData()).commit()
                    drawerLayout.closeDrawers()
                }
                R.id.three->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,OperatorsExpression()).commit()
                    drawerLayout.closeDrawers()
                }
                R.id.four->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,ControlStructure()).commit()
                    drawerLayout.closeDrawers()
                }
                R.id.five->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,Functions()).commit()
                    drawerLayout.closeDrawers()
                }
                R.id.six->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,ArraysPointer()).commit()
                    drawerLayout.closeDrawers()
                }
                R.id.seven->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,ClassesObject()).commit()
                    drawerLayout.closeDrawers()
                }
                R.id.eight->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,InheritancePoly()).commit()
                    drawerLayout.closeDrawers()
                }

                R.id.nine-> {
                    supportFragmentManager.beginTransaction().replace(R.id.frame,Template()).commit()
                    drawerLayout.closeDrawers()
                }
                R.id.ten->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,STL()).commit()
                    drawerLayout.closeDrawers()
                }
                R.id.eleven->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,InputOutput()).commit()
                    drawerLayout.closeDrawers()
                }
                R.id.twelve->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,Memory()).commit()
                    drawerLayout.closeDrawers()
                }
                R.id.thirteen->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,Exception()).commit()
                    drawerLayout.closeDrawers()
                }
                R.id.fourteen->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,Multithreading()).commit()
                    drawerLayout.closeDrawers()
                }
                R.id.fifteen->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,Debug()).commit()
                    drawerLayout.closeDrawers()
                }
                R.id.sixteen->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,End()).commit()
                    drawerLayout.closeDrawers()
                }
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