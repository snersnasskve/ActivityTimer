package com.snersbots.activitytimer.audio

class VibrationManager {

    /**
     * Use:
     *
     * VibratorManager (modern Android)
     * fallback to Vibrator for old versions
     *
     * Official docs:
     *
     * Android vibration APIs
     * https://developer.android.com/develop/ui/views/haptics/haptics-apis?utm_source=chatgpt.com
     *
     */

    val startOfRestPattern = longArrayOf(0, 300)
    val endOfRestPattern = longArrayOf(0, 100, 100, 100)
    val finalCompletionPattern = longArrayOf(0, 100, 100, 100, 100, 100)

}