package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class spalsh : AppCompatActivity() {
    lateinit var instagram:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spalsh)
        instagram=findViewById(R.id.instaImg_id)
        instagram.alpha=1f
        instagram.animate().setDuration(3000).alpha(0f).withStartAction(){
            startActivity(Intent(this,MainActivity::class.java))
            overridePendingTransition(android.R.anim.fade_out,android.R.anim.fade_in)
        }
    }
}