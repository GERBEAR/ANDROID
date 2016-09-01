package com.gerard.todoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DisplayTasksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_tasks);

        //Getting a reference to the ListView on the screen.
        ListView taskListView = (ListView) findViewById(R.id.task_list);

        //Setting the size of the array to the same as the taskList
        String[] taskTitles = new String[AddNewTaskActivity.taskList.size()];

        //Populating the array with the lit of tasks
        for(int i = 0; i < taskTitles.length; ++i){
            taskTitles[i] = AddNewTaskActivity.taskList.get(i).getTitle();

        }//end forloop

        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, taskTitles);

        taskListView.setAdapter(adapter);

        //Implementing what happens on a longpick.
        taskListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                //Remove the long clcked item from the List and recreate it.
                AddNewTaskActivity.taskList.remove(position);
                recreate();
                return false;
            }
        });
    }

}
