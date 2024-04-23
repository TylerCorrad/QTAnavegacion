package com.example.qta

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.qta.databinding.ActivityActividadBottomDrawerBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class ActividadBottomDrawer : AppCompatActivity() {

    private lateinit var binding: ActivityActividadBottomDrawerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityActividadBottomDrawerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(findViewById(R.id.toolbar))
        val navView: BottomNavigationView = binding.navView
        val nombreUsuario = intent.getStringExtra("USUARIO")

        val navController =
            findNavController(R.id.nav_host_fragment_activity_actividad_bottom_drawer)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}