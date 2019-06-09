package sengathit.com.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import sengathit.com.swoosh.R
import sengathit.com.swoosh.Utilities.LEAGUE

class FinishActivity : AppCompatActivity() {
    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        league = intent.getStringExtra(LEAGUE)
        searchLeagueTxt.text = league
    }


}
