package com.example.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;

public class UserSetting {
    private SharedPreferences sharedPref;

    public UserSetting(Context context) {
        sharedPref = context.getSharedPreferences("app_settings", Context.MODE_PRIVATE);
    }

    public void setSharedPrefFirstname(String first_name) {
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("first_name", first_name);
        editor.apply();
    }

    public void setSharedPrefLastname(String last_name) {
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("last_name", last_name);
        editor.apply();
    }

    public void setSharedPrefAge(String age) {
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("age", age);
        editor.apply();
    }


    public String getSharedPrefFirstname() {
        return sharedPref.getString("first_name", "");
    }

    public String getSharedPrefLastname() {
        return sharedPref.getString("last_name", "");
    }

    public String getSharedPrefAge() {
        return sharedPref.getString("age", "");
    }


}