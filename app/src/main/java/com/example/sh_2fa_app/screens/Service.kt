package com.example.sh_2fa_app.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.sh_2fa_app.data.PrefsViewModel
import com.example.sh_2fa_app.ui.components.Base

@Composable
fun Service(navController: NavController, prefsViewModel: PrefsViewModel) {
    Base(title = "Service page") {
        Text("service2834728")
    }
}