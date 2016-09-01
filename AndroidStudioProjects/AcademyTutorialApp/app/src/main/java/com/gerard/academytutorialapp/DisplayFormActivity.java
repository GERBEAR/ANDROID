package com.gerard.academytutorialapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayFormActivity extends AppCompatActivity {

    public static final String USERNAME_KEY     = "USERNAME";
    public static final String AGE_KEY          = "USERAGE";
    public static final String EMAIL_KEY        = "USEREMAIL";
    public static final String PHONENUM_KEY     = "USERPHONENUM";

    private EditText mNameField;
    private EditText mAgeField;
    private EditText mEmailField;
    private EditText mPhoneNumber;
    private Button   mSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_form);

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/riddler.ttf"); // Setting The Font On The Input Fields And Button

        mNameField    = (EditText) findViewById(R.id.enter_form_name_field);
        mAgeField     = (EditText) findViewById(R.id.enter_form_age_field);
        mEmailField   = (EditText) findViewById(R.id.enter_form_email_field);
        mPhoneNumber  = (EditText) findViewById(R.id.enter_form_phone_number);
        mSubmitButton = (Button)   findViewById(R.id.submit_details);

        mNameField.setTypeface(tf);
        mAgeField.setTypeface(tf);
        mEmailField.setTypeface(tf);
        mPhoneNumber.setTypeface(tf);
        mSubmitButton.setTypeface(tf);

    }//end onCreate

    public void onSubmitPressed(View view){

        String userName         = mNameField.getText().toString();
        String userAge          = mAgeField.getText().toString();
        String userEmail        = mEmailField.getText().toString();
        String userPhoneNumber  = mPhoneNumber.getText().toString();


        //String output = "Greeting's " +userName+ "You Are " +userAge+ "Years Old.\n" + "\nYour Phone Number Is: "+userPhoneNumber+ "\nYour Email Is: " +userEmail;
        //Toast.makeText(this, output, Toast.LENGTH_SHORT).show();

        Bundle bundle = new Bundle();
        bundle.putString(USERNAME_KEY, userName);
        bundle.putString(AGE_KEY, userAge);
        bundle.putString(EMAIL_KEY, userEmail);
        bundle.putString(PHONENUM_KEY, userPhoneNumber);

        TextView displayName = (TextView) findViewById(R.id.display_name_field);

        //Creating The Intent And Adding The Bundle To It.
        Intent intent = new Intent(this,DisplayInformationActivity.class);
        intent.putExtras(bundle);

        //Starting the Intent
        startActivity(intent);

    }//end onSubmitPressed
}
