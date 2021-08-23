package com.neppplus.lifecycle_2021_08_23_4_46

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("메인화면", "MainActivity onCreate 실행됨")

        moveBtn.setOnClickListener {
            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)
        }
    }

    override fun onResume() {
        super.onResume()

        Log.d("메인화면", "onResume 실행 됨")

    }

    override fun onPause() {
        super.onPause()

        Log.d("메인화면", "onPause 실행 됨")
    }


    fun test() {
        Toast.makeText(this, "테스트 토스트", Toast.LENGTH_SHORT).show()
    }

}