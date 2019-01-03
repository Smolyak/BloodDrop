package com.simpleondrew.blooddrop.app.extensions

import androidx.navigation.NavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

/**
 * Created by: Andrey Smolyak
 * email: simpleondrew@ya.ru
 * 03.01.2019 0:46
 **/
fun BottomNavigationView.setupWithNavController(navController: NavController) {
    NavigationUI.setupWithNavController(this, navController)
}