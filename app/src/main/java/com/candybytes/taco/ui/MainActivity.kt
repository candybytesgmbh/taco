package com.candybytes.taco.ui

import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import com.candybytes.taco.R
import com.candybytes.taco.databinding.MainActivityBinding
import com.candybytes.taco.ui.vm.MainViewModel
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat
import java.util.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    private lateinit var appBarConfiguration: AppBarConfiguration

    private lateinit var bottomNavigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: MainActivityBinding =
            DataBindingUtil.setContentView(this, R.layout.main_activity)

        binding.apply {
            // Specify the current activity as the lifecycle owner.
            viewModel = this@MainActivity.viewModel
            lifecycleOwner = this@MainActivity
            this@MainActivity.bottomNavigation = navBottomBar

            //access navigation controller
            val navHostFragment =
                supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
            val navController = navHostFragment.navController
            appBarConfiguration = AppBarConfiguration(navController.graph)
            challengeTimer()

            //setup header and footer
            toolbar.setupWithNavController(navController, appBarConfiguration)
            navBottomBar.setupWithNavController(navController)
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }

    /**
     * Updates bottom bar, based on first install time
     */
    private fun challengeTimer() = GlobalScope.launch(Dispatchers.Default) {

        //get installTime information for this app from system package manager
        val installTime = packageManager.getPackageInfo(
            applicationContext.packageName,
            PackageManager.GET_CONFIGURATIONS
        ).firstInstallTime

        //format delta time to string for bottom bar
        val timeFormatter = SimpleDateFormat("HH:mm:ss", Locale.getDefault())

        do {
            //calculate the time that has passed since first install
            val deltaTime = System.currentTimeMillis() - installTime

            //UI
            withContext(Dispatchers.Main) {
                //update passed time since challenge started in bottom bar
                bottomNavigation.menu[1].title = timeFormatter.format(deltaTime - (60 * 60 * 1000))
            }

            //stop time when 4hrs of work has passed
        } while (deltaTime < (4 * 60 * 60 * 1000))

        bottomNavigation.menu[1].title = "stop it ;-)"
    }
}
