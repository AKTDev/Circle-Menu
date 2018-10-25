package com.nilprojects.circlemenu

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var arrList = arrayOf("Facebook","Twitter","Insta","ShareIt","Snapchat")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        circle_menu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.main1,R.drawable.main)
                .addSubMenu(Color.parseColor("#25BCFE"),R.drawable.sub1)
                .addSubMenu(Color.parseColor("#6D4C41"),R.drawable.sub2)
                .addSubMenu(Color.parseColor("#ff0000"),R.drawable.sub3)
                .addSubMenu(Color.parseColor("#1a237e"),R.drawable.sub4)
                .addSubMenu(Color.parseColor("#03a9f4"),R.drawable.sub5)
                .setOnMenuSelectedListener {
                   index -> Toast.makeText(this,"Selected" +arrList[index],Toast.LENGTH_SHORT).show()

                    when(arrList[index])
                    {
                        "Facebook" -> {
                            val intent = Intent(this, facebook :: class.java)
                            startActivity(intent)
                        }
                    }
                }

    }
}
