package com.example.screens.ScreensJava;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragmentCompat;

import com.example.screens.R;

public class Settings extends AppCompatActivity {
    Button ok, policy, credit, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        Button ok = findViewById(R.id.buttonOK); //have to work only when check box's checker
        Button credit = findViewById(R.id.buttonCredit);
        Button back = findViewById(R.id.buttonBack);

        back.setOnClickListener(new View.OnClickListener() { //button goes back to main page
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Settings.this, MainActivity.class);
                startActivity(i);
            }
        });

        /*policy.setOnClickListener(new View.OnClickListener() { //button goes back to policy page
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Settings.this, (policy).class);
                startActivity(i);
            }
        });*/

        /*credit.setOnClickListener(new View.OnClickListener() { //button goes back to credit page
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Settings.this, (credit).class);
                startActivity(i);
            }
        });*/



    }


    public static class SettingsFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey);

        }
    }
}