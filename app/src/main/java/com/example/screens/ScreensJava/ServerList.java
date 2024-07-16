package com.example.screens.ScreensJava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

import com.example.screens.R;

public class ServerList extends AppCompatActivity {
    Button addSV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.serverlist);

        Button addSV = findViewById(R.id.buttonAddSV);
        Button back = findViewById(R.id.buttonBack2);

        addSV.setOnClickListener(new View.OnClickListener() { /*go to CreateServer page*/
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ServerList.this, CreateServer.class);
                startActivity(i);
            }
        });

        back.setOnClickListener(new View.OnClickListener() { /*go to user dashboard page*/
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ServerList.this, UserDashboard.class);
                startActivity(i);
            }
        });



    }
}