package com.gerard.academytutorialapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayInformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_information);

        //Retrieves The Intent Which Started This Activity.
        //We Then Get The Bundle Out Of The Intent.
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String userName     = bundle.getString(DisplayFormActivity.USERNAME_KEY);
        String userAge      = bundle.getString(DisplayFormActivity.AGE_KEY);
        String userEmail    = bundle.getString(DisplayFormActivity.EMAIL_KEY);
        String userPhoneNum = bundle.getString(DisplayFormActivity.PHONENUM_KEY);


        TextView displayName = (TextView) findViewById(R.id.display_name_field);
        displayName.setText(userName);

        TextView displayAge = (TextView) findViewById(R.id.display_age_field);
        displayAge.setText(userAge);

        TextView displayEmail = (TextView) findViewById(R.id.display_email_field);
        displayEmail.setText(userEmail);

        TextView displayPhone =(TextView) findViewById(R.id.display_phone_field);
        displayPhone.setText(userPhoneNum);


    }//end onCreate
}
