package com.snersbots.activitytimer.service

class WorkoutService {

    /**
     * Handles:
     *
     * foreground service
     * screen-off reliability
     */

    /**
     * START
     *
     * REST
     *   countdown
     *   end => double short vibrate
     *
     * EXERCISE
     *   countdown
     *   end =>
     *       if last rep:
     *            triple short vibrate
     *            COMPLETE
     *       else:
     *            single long vibrate
     *            REST
     */

    /**
     * Background Execution
     *
     * This matters.
     *
     * If the screen turns off, Android may suspend things unless handled properly.
     *
     * Use a Foreground Service
     *
     * This is the correct modern approach.
     *
     * Your timer should run inside:
     *
     * a foreground service
     * with persistent notification
     *
     * Docs:
     *
     * Foreground services overview
     *
     * Without this:
     *
     * timing may drift
     * app may pause
     * vibrations may stop
     */

    /**
     * 1. Large Fullscreen Countdown
     *
     * Because user is exercising.
     */

    /**
     * 2. Colour Coding
     * REST = blue/green
     * EXERCISE = red/orange
     */

}

