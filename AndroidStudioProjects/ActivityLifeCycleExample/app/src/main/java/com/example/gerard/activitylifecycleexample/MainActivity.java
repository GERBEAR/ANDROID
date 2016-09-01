package com.example.gerard.activitylifecycleexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("In onCreate()");

    }

    @Override
    protected void onPause(){
        super.onPause();    //We Call The Super When Override
        System.out.println("In onPause()");
    }

    @Override
    protected void onRestart(){
        super.onRestart();  //We Call The Super When Ovveride
        System.out.println("In onRestart()");
    }

    @Override
    protected void onResume(){
        super.onResume();   //We Call The Super When Override
        System.out.println("In onResume()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();  //We Call The Super When Override
        System.out.println("In onDestroy()");
    }

    @Override
    protected void onStop(){
        super.onStop(); //We Call The Super When Override
        System.out.println("In onStop()");
    }
}