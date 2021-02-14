package br.com.leotosin.xylophone

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun clickLamina(view : View)
    {
        val button : Button = view as Button

        this.playSound(this.findSound(button.tag.toString().toInt()))
    }

    private fun playSound(note :Int)
    {
        val sound :MediaPlayer = MediaPlayer.create(this, note)

        sound.setOnCompletionListener {
            it.release()
        }

        sound.start()

    }

    private fun findSound(note :Int) :Int
    {
        return when (note)
        {
            1 -> R.raw.note1
            2 -> R.raw.note2
            3 -> R.raw.note3
            4 -> R.raw.note4
            5 -> R.raw.note5
            6 -> R.raw.note6
            7 -> R.raw.note7
            else -> 0
        }
    }
}