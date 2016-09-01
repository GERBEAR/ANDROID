package com.gerard.todoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAddNewActivity(View view){
        Intent intent = new Intent(this, AddNewTaskActivity.class);
        startActivity(intent); //Starts The New Activity.
    }

    public void onViewAllTasks(View view){
        Intent intent = new Intent(this, DisplayTasksActivity.class);
        startActivity(intent);
    }
}
