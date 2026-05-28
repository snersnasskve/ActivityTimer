package com.snersbots.activitytimer

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.*
import androidx.compose.runtime.*
import com.snersbots.activitytimer.ui.theme.WorkoutScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
       // If you decide to turn screen off then:
        //clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON).

        setContent {
            WorkoutApp()
        }
    }
}


@Composable
fun WorkoutApp() {
    MaterialTheme {
        WorkoutScreen()

        //* Up To *//
        //Recommended Architecture For Your App
    }
}



