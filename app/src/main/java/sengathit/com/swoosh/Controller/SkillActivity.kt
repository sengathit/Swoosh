package sengathit.com.swoosh.Controller

import android.os.Bundle
import android.widget.Toast
import sengathit.com.swoosh.Utilities.EXTRA_LEAGUE
import sengathit.com.swoosh.R

class SkillActivity : BaseActivity() {
    var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        Toast.makeText(this,league,Toast.LENGTH_SHORT).show()
    }
}
