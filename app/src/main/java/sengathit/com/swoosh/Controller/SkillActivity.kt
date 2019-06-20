package sengathit.com.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import sengathit.com.swoosh.Model.Player
import sengathit.com.swoosh.R
import sengathit.com.swoosh.Utilities.EXTRA_PLAYER

class SkillActivity : BaseActivity() {
    lateinit var player: Player

    override fun onSaveInstanceState(outState: Bundle?){
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?){
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun beginnerClicked(view: View){
        advancedToggleBtn.isChecked = false
        player.skill = "Beginner"
    }

    fun advancedClicked(view: View) {
        beginnerToggleBtn.isChecked = false
        player.skill = "Advanced"
    }

    fun finishedClicked(view: View){
        if(player.skill != "") {
            val finishActivity = Intent(this,FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please select a level!",Toast.LENGTH_SHORT).show()
        }
    }
}
