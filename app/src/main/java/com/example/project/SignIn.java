package com.example.project;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignIn extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

    }

    public void onButtonSaveUserInfoClicked(View view){
        SharedPreferences preferences = getSharedPreferences("USERINFO", Context.MODE_PRIVATE);

        TextView usernameView = findViewById(R.id.editTextName);
        TextView URLView = findViewById(R.id.editTextURL);

        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("NAME", usernameView.toString());
        editor.putString("URL", URLView.toString());
        finish();
    }
}