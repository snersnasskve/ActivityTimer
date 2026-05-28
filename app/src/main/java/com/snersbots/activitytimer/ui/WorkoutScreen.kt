package com.snersbots.activitytimer.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WorkoutScreen() {

    var exerciseSeconds by remember { mutableStateOf("30") }
    var restSeconds by remember { mutableStateOf("10") }
    var numReps by remember { mutableStateOf("5") }

    var currentPhase by remember { mutableStateOf("REST") }
    var countdown by remember { mutableStateOf(10) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),

        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Workout Timer",
            fontSize = 32.sp
        )

        OutlinedTextField(
            value = exerciseSeconds,
            onValueChange = { exerciseSeconds = it },
            label = { Text("Exercise Seconds") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            )

        )

        OutlinedTextField(
            value = restSeconds,
            onValueChange = { restSeconds = it },
            label = { Text("Rest Seconds") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            )
        )

        OutlinedTextField(
            value = numReps,
            onValueChange = { numReps = it },
            label = { Text("Number of Reps") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            )
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = currentPhase,
            fontSize = 40.sp
        )

        Text(
            text = countdown.toString(),
            fontSize = 64.sp
        )

        Button(
            onClick = {
                // start workout here
            }
        ) {
            Text("Start")
        }
    }
}