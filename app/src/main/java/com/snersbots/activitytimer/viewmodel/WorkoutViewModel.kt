package com.snersbots.activitytimer.viewmodel

/**
 * Contains:
 *
 * timer state
 * coroutine logic
 * state machine
 */
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
