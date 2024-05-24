package com.example.sharedpreferences;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    UserSetting userSetting;

    Button submit;
    Button editProfile;

    TextView FullName;
    TextView Age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userSetting = new UserSetting(this);

        submit = findViewById(R.id.submit);
        editProfile = findViewById(R.id.editProfileButton);

        FullName = findViewById(R.id.fullName);
        Age = findViewById(R.id.ageText);


        FullName.setText("Name : " + userSetting.getSharedPrefFirstname() + " " + userSetting.getSharedPrefLastname());
        Age.setText("Age : " + userSetting.getSharedPrefAge());


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FormActivity.class);
                userSetting.setSharedPrefFirstname("");
                startActivity(intent);
                finish();
            }
        });

        editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FormActivity.class);
                userSetting.setSharedPrefFirstname("");
                startActivity(intent);
                finish();
            }
        });


    }
}