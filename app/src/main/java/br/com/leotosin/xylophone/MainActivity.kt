package br.com.leotosin.xylophone

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun playSound()
    {
        val sound :MediaPlayer = MediaPlayer.create(this, R.raw.note1)

        sound.start()
    }
}