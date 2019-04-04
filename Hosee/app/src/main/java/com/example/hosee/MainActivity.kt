package com.example.hosee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.example.projectxd.R
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*






open class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.projectxd.R.layout.activity_main)
        setSupportActionBar(toolbar)
//        showDetails()


        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, com.example.projectxd.R.string.navigation_drawer_open, com.example.projectxd.R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()


        nav_view.setNavigationItemSelectedListener(this)
    }
//    var count = 0
//    fun showDetails() {
//        val thread = object : Thread() {
//
//            override fun run() {
//                try {
//                    while (!this.isInterrupted) {
//                        Thread.sleep(1000)
//                        runOnUiThread {
//                            // update TextView here!
//                        }
//                    }
//                } catch (e: InterruptedException) {
//                }
//
//            }
//        }
//
//        thread.start()
//    }




    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }

    }
//
//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        menuInflater.inflate(R.menu.activity_drawer_main, menu)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        when (item.itemId) {
////            R.id.action_settings -> return true
//            else -> return super.onOptionsItemSelected(item)
//        }
//    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {


        when (item.itemId) {
            R.id.nav_history -> {

                // Handle the camera action
            }

            R.id.nav_notification -> {

            }
            R.id.nav_help -> {

            }
            R.id.nav_sos -> {

            }
            R.id.nav_introduce -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
