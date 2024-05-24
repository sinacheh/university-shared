package com.example.sharedpreferences;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.content.Intent;

import java.util.Objects;

public class FormActivity extends AppCompatActivity {

    UserSetting userSetting;

    Button registerSubmit;

    EditText Firstname;
    EditText Lastname;
    EditText Age;

    private void goToNextPage(){
        Intent intent = new Intent(FormActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_activity);
        
        userSetting = new UserSetting(this);

        if(!Objects.equals(userSetting.getSharedPrefFirstname(), "")){
            finish();
            goToNextPage();
        }

        Firstname = findViewById(R.id.firstName);
        Lastname = findViewById(R.id.lastName);
        Age = findViewById(R.id.ageText);


        registerSubmit = findViewById(R.id.button);

        registerSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormActivity.this, MainActivity.class);

                userSetting.setSharedPrefFirstname(Firstname.getText().toString());
                userSetting.setSharedPrefLastname(Lastname.getText().toString());
                userSetting.setSharedPrefAge(Age.getText().toString());


                startActivity(intent);
                finish();
            }
        });
    }

}