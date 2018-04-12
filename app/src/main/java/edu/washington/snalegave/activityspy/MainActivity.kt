package edu.washington.snalegave.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState != null) {
            Log.i(TAG, "onCreate fired, State:" + savedInstanceState)
        } else {
            Log.i(TAG, "onCreate fired")
        }
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume fired")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.e(TAG, "We’re going down, Captain!")
    }

}
