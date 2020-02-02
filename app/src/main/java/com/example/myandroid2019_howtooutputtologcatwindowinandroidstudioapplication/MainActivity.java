package com.example.myandroid2019_howtooutputtologcatwindowinandroidstudioapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


/**
 *Android 2019 : How to output to Logcat window in Android Studio
 * @Author Solomon Mayfield
 *
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.v("MainActivity"," onCreate Method");
    }
}
