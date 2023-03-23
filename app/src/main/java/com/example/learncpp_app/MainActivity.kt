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
                    supportFragmentManager.beginTransaction().replace(R.id.frame,Introduction()).addToBackStack("one").commit()
                    supportActionBar?.setTitle("Introduction to C++")
                    drawerLayout.closeDrawers()
                }

                R.id.two-> {
                    supportFragmentManager.beginTransaction().replace(R.id.frame,VariablesData()).addToBackStack("two").commit()
                    supportActionBar?.setTitle("Variables and Data Types")
                    drawerLayout.closeDrawers()
                }
                R.id.three->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,OperatorsExpression()).addToBackStack("three").commit()
                    supportActionBar?.setTitle("Operators and Expressions")
                    drawerLayout.closeDrawers()
                }
                R.id.four->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,ControlStructure()).addToBackStack("four").commit()
                    supportActionBar?.setTitle("Control Structures")
                    drawerLayout.closeDrawers()
                }
                R.id.five->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,Functions()).addToBackStack("five").commit()
                    supportActionBar?.setTitle("Functions")
                    drawerLayout.closeDrawers()
                }
                R.id.six->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,ArraysPointer()).addToBackStack("six").commit()
                    supportActionBar?.setTitle("Arrays and Pointers")
                    drawerLayout.closeDrawers()
                }
                R.id.seven->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,ClassesObject()).addToBackStack("seven").commit()
                    supportActionBar?.setTitle("Classes and Objects")
                    drawerLayout.closeDrawers()
                }
                R.id.eight->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,InheritancePoly()).addToBackStack("eight").commit()
                    supportActionBar?.setTitle("Inheritance and Polymorphism")
                    drawerLayout.closeDrawers()
                }

                R.id.nine-> {
                    supportFragmentManager.beginTransaction().replace(R.id.frame,Template()).addToBackStack("nine").commit()
                    supportActionBar?.setTitle("Templates")
                    drawerLayout.closeDrawers()
                }
                R.id.ten->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,STL()).addToBackStack("ten").commit()
                    supportActionBar?.setTitle("STL")
                    drawerLayout.closeDrawers()
                }
                R.id.eleven->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,InputOutput()).addToBackStack("eleven").commit()
                    supportActionBar?.setTitle("Input and Output Streams")
                    drawerLayout.closeDrawers()
                }
                R.id.twelve->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,Memory()).addToBackStack("twelve").commit()
                    supportActionBar?.setTitle("Memory Management and Smart Pointers")
                    drawerLayout.closeDrawers()
                }
                R.id.thirteen->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,Exception()).addToBackStack("thirteen").commit()
                    supportActionBar?.setTitle("Exception Handling")
                    drawerLayout.closeDrawers()
                }
                R.id.fourteen->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,Multithreading()).addToBackStack("fourteen").commit()
                    supportActionBar?.setTitle("Multithreading and Concurrency")
                    drawerLayout.closeDrawers()
                }
                R.id.fifteen->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,Debug()).addToBackStack("fifteen").commit()
                    supportActionBar?.setTitle("Debugging Techniques and Tools")
                    drawerLayout.closeDrawers()
                }
                R.id.sixteen->{
                    supportFragmentManager.beginTransaction().replace(R.id.frame,End()).addToBackStack("sixteen").commit()
                    supportActionBar?.setTitle("End")
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

    override fun onBackPressed() {
        super.onBackPressed()

    }
}