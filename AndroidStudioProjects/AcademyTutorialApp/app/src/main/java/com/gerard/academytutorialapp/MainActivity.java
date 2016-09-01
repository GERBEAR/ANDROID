package com.gerard.academytutorialapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mNameField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameField = (EditText)findViewById(R.id.enter_name_field);
        TextView textView = (TextView) findViewById(R.id.greeting_message);

        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/riddler.ttf"); //Imports Font.
        mNameField.setTypeface(tf);
        textView.setTypeface(tf);

    }//end onCreate

    public void onButtonClicked(View view){
        //This code is executed when a button had been clicked.
        String enteredName = mNameField.getText().toString();
        Toast.makeText(this, "Hello There " + enteredName,Toast.LENGTH_LONG).show();

    }//end onButtonClicked

    public void onViewImageButton(View view){
        //This Code Will Start A New Activity, It Will Trigger When Appropriate Button Is Clicked
        /*
        The Intent Takes 2 Arguments, The 1st Is The Context Which Allows The App To Know What Activity Is Currently Active.
        The 2nd is the .class Field Within The Activity That You Change To, This Way It Changes From The Activity You're Currently
        In To The One That You Specify As The 2nd Parameter.
         */
        Intent intent = new Intent(this, DisplayImageActivity.class);
        startActivity(intent); //Starts The New Activity.

    }//end onViewImageButton

    public void onFormClick(View view){
        Intent intent1 = new Intent(this, DisplayFormActivity.class);
        startActivity(intent1);
    }

    public void onGridButtonClick(View view){
        Intent intent2 = new Intent(this, ImageGridActivity.class);
        startActivity(intent2);
    }
}//end class
