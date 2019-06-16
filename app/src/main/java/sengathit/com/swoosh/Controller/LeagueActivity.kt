package sengathit.com.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import sengathit.com.swoosh.Model.Player
import sengathit.com.swoosh.R
import sengathit.com.swoosh.Utilities.EXTRA_PLAYER

class LeagueActivity : BaseActivity() {

    // var selectedLeague = ""

    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View){
        womensLeagueBtn.isChecked = false
        coEdLeagueBtn.isChecked = false
        player.league = "mens"
    }

    fun onWomensClicked(view: View){
        mensLeagueBtn.isChecked = false
        coEdLeagueBtn.isChecked = false
        player.league = "womens"
    }

    fun onCoEdClicked(view: View){
        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false
        player.league = "co-ed"
    }

    fun leagueNextClicked(view: View){
        if(player.league != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"Please make a selection!",Toast.LENGTH_SHORT).show()
        }
    }
}
