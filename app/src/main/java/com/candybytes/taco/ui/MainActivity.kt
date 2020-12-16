package com.candybytes.taco.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import com.candybytes.taco.R
import com.candybytes.taco.databinding.MainActivityBinding
import com.candybytes.taco.ui.vm.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: MainActivityBinding =
            DataBindingUtil.setContentView(this, R.layout.main_activity)

        binding.apply {
            // Specify the current activity as the lifecycle owner.
            viewModel = this@MainActivity.viewModel
            lifecycleOwner = this@MainActivity

            //access navigation controller
            val navHostFragment =
                supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
            val navController = navHostFragment.navController
            appBarConfiguration = AppBarConfiguration(navController.graph)

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
}
