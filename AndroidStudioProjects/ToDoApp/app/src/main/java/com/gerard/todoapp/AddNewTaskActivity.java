package com.gerard.todoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class AddNewTaskActivity extends AppCompatActivity {

    public static ArrayList<Task> taskList = new ArrayList<>();

    private EditText mTitleField;
    private EditText mDescField;
    private Spinner mUrgencyField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_task);

        //Initialize my view variables
        mTitleField = (EditText) findViewById(R.id.task_enter_title_field);
        mDescField = (EditText) findViewById(R.id.task_enter_desc_field);
        mUrgencyField = (Spinner) findViewById(R.id.task_enter_urgency_field);


    }

    public void onSubmitPressed (View view){
        String title = mTitleField.getText().toString();
        String description = mDescField.getText().toString();
        String urgency = mUrgencyField.getSelectedItem().toString();

        if(title.equals("") || description.equals("")){
            Toast.makeText(this, "Please input all information.",Toast.LENGTH_LONG).show();
            return;
        }

        int urgencyLevel = 0;
        switch (urgency){
            case "Very Urgent" : urgencyLevel = 1; break;
            case "Urgent" : urgencyLevel = 2; break;
            case "Not Urgent" : urgencyLevel = 3; break;
        }

        Task task = new Task(title, description,urgencyLevel);
        taskList.add(task);

        Toast.makeText(this,"New To-Do Added!",Toast.LENGTH_LONG).show();

        //Clearing fields, so it appears it was submitted
        mTitleField.setText("");
        mDescField.setText("");
        mUrgencyField.setSelection(0);
    }
}
