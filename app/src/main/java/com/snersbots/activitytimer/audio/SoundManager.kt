package com.snersbots.activitytimer.audio

class SoundManager {

    /**
     * Use Sound Pool not MediaPlayer. KIS
     * https://developer.android.com/reference/android/media/SoundPool?utm_source=chatgpt.com
     *
     * Sound Design Advice
     *
     * You specifically said:
     *
     * low pitched
     * not irritating
     * bell-like acceptable
     *
     * Good choices:
     *
     * soft wood block
     * muted bell
     * low marimba
     * soft click
     *
     * You can:
     *
     * bundle WAV files in /res/raw
     * play matching sound lengths
     *
     * Example:
     *
     * short vibrate → short “tok”
     * long vibrate → longer “bong”
     */
}