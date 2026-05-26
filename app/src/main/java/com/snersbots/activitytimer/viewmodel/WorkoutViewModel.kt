package com.snersbots.activitytimer.viewmodel

enum class Phase {
    REST,
    EXERCISE,
    COMPLETE
}

data class WorkoutState(
    val phase: Phase,
    val secondsRemaining: Int,
    val currentRep: Int,
    val totalReps: Int,
    val running: Boolean
)
