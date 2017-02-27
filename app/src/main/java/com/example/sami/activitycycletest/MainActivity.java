package com.example.sami.activitycycletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String ACTIVITY_CYCLE_TAG = "activityCycleTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(ACTIVITY_CYCLE_TAG, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(ACTIVITY_CYCLE_TAG, "onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(ACTIVITY_CYCLE_TAG, "onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(ACTIVITY_CYCLE_TAG, "onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(ACTIVITY_CYCLE_TAG, "onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(ACTIVITY_CYCLE_TAG, "onRestart");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(ACTIVITY_CYCLE_TAG, "onDestroy");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(ACTIVITY_CYCLE_TAG, "onSaveInstanceState");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(ACTIVITY_CYCLE_TAG, "onRestoreInstanceState");
    }
}
