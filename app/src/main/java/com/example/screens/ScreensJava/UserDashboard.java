package com.example.screens.ScreensJava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

import com.example.screens.R;

public class UserDashboard extends AppCompatActivity {
    Button back, setting, start, accountInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashboard);
        Button back = findViewById(R.id.buttonUDback);
        Button setting = findViewById(R.id.buttonUDsetting);
        Button start = findViewById(R.id.buttonUDstart);
        Button accountInfo = findViewById(R.id.buttonUDinfo);

        back.setOnClickListener(new View.OnClickListener() { //button goes back to main page
            @Override
            public void onClick(View v) {
                Intent i =new Intent(UserDashboard.this, MainActivity.class);
                startActivity(i);
            }
        });

        setting.setOnClickListener(new View.OnClickListener() { //button goes back to main page
            @Override
            public void onClick(View v) {
                Intent i =new Intent(UserDashboard.this, Settings.class);
                startActivity(i);
            }
        });
        start.setOnClickListener(new View.OnClickListener() { //button goes back to main page
            @Override
            public void onClick(View v) {
                Intent i =new Intent(UserDashboard.this, ServerList.class);
                startActivity(i);
            }
        });
        /*accountInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UserDashboard.this, UserInfo.class);
                startActivity(i);
            }
        });*/
    }
}