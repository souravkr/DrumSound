package com.example.android.drumsound

import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var  listOfColours :List<Int> = listOf(
        Color.parseColor("#e23047"),
        Color.parseColor("#c5a182"),
        Color.parseColor("#6fa482"),
        Color.parseColor("#a0dacd"),
        Color.parseColor("#0cc697"),
        Color.parseColor("#33ecc5"),
        Color.parseColor("#ed925c"),
        Color.parseColor("#abdfd4"),
        Color.parseColor("#3f3f37"),
        Color.parseColor("#edc014"),
        Color.parseColor("#fb940c")
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(applicationContext,"Click on the Boxes to Play sound",Toast.LENGTH_LONG).show()
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(
                button1,button2,button3,
                button4, button6,button7,
                button8, button5,button9,
                button10, button11,button12)

        for (item in clickableViews) {
            item.setOnClickListener { playsound(it) }
        }
    }

    private fun playsound(view: View) {
        when(view.id){

                   R.id.button1-> {MediaPlayer.create (this, R.raw.stick).start()
                        view.setBackgroundColor(getRandomColor())
                   }
                   R.id.button2->{MediaPlayer.create (this, R.raw.d).start()
                       view.setBackgroundColor(getRandomColor())
                   }
                    R.id.button3->{MediaPlayer.create (this, R.raw.c).start()
                        view.setBackgroundColor(getRandomColor())
                    }
                    R.id.button4->{ MediaPlayer.create (this, R.raw.g).start()
                        view.setBackgroundColor(getRandomColor())
                    }
                    R.id.button6->{ MediaPlayer.create (this, R.raw.e).start()
                        view.setBackgroundColor(getRandomColor())
                    }
                    R.id.button7->{MediaPlayer.create (this, R.raw.j).start()
                        view.setBackgroundColor(getRandomColor())
                    }
                    R.id.button8->{MediaPlayer.create (this, R.raw.f).start()
                        view.setBackgroundColor(getRandomColor())
                    }
                    R.id.button5->{ MediaPlayer.create (this, R.raw.i).start()
                        view.setBackgroundColor(getRandomColor())
                    }
                    R.id.button9->{MediaPlayer.create (this, R.raw.h).start()
                        view.setBackgroundColor(getRandomColor())
                    }
                    R.id.button10->{MediaPlayer.create (this, R.raw.k).start()
                        view.setBackgroundColor(getRandomColor())
                    }
                    R.id.button11->{MediaPlayer.create (this, R.raw.l).start()
                        view.setBackgroundColor(getRandomColor())
                    }
                    R.id.button12->{  MediaPlayer.create (this, R.raw.n).start()
                        view.setBackgroundColor(getRandomColor())
                    }
        }


    }
    private fun getRandomColor(): Int {
        return listOfColours.get(Random.nextInt(0,11))
    }

}
