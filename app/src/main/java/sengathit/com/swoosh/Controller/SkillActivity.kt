package sengathit.com.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import sengathit.com.swoosh.Utilities.EXTRA_LEAGUE
import sengathit.com.swoosh.R
import sengathit.com.swoosh.Utilities.LEAGUE

class SkillActivity : BaseActivity() {
    var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        Toast.makeText(this,league,Toast.LENGTH_SHORT).show()
    }

    fun beginnerClicked(view: View){
        advancedToggleBtn.isChecked = false
        league = "Beginner"
    }

    fun advancedClicked(view: View) {
        beginnerToggleBtn.isChecked = false
        league = "Advanced"
    }

    fun finishedClicked(view: View){
        if(league != "") {
            val finishActivity = Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(LEAGUE,league)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please select a level!",Toast.LENGTH_SHORT).show()
        }
    }
}
