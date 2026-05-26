package com.snersbots.activitytimer

import android.os.Bundle
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
        setContent {
            WorkoutApp()
        }
    }
}


@Composable
fun WorkoutApp() {
    MaterialTheme {
        WorkoutScreen()
    }
}



