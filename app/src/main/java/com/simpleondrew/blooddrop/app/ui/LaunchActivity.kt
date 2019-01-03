package com.simpleondrew.blooddrop.app.ui

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.simpleondrew.blooddrop.R
import com.simpleondrew.blooddrop.app.common.ActivityAlias
import com.simpleondrew.blooddrop.app.extensions.setupWithNavController

/**
 * Created by: Andrey Smolyak
 * email: simpleondrew@ya.ru
 * 02.12.2018 17:15
 **/

class LaunchActivity : ActivityAlias() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)

        val host: NavHostFragment = supportFragmentManager
                .findFragmentById(R.id.nav_host_fragment) as NavHostFragment? ?: return

        val navController = host.navController


        setupBottomNavigation(navController)
    }

    private fun setupBottomNavigation(navController: NavController) {
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav_view)
        bottomNav?.setupWithNavController(navController)
    }
}
