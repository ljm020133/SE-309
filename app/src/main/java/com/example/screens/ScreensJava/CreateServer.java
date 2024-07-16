package com.example.screens.ScreensJava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import com.example.screens.Classes.ServerSettings;
import com.example.screens.R;

public class CreateServer extends AppCompatActivity {


    Spinner size, limit, access;
    Button deploy;
    EditText nameSV, password;
    String sizeString, limitString, accessString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_server);
        Button back = findViewById(R.id.buttonBack3);

        size = findViewById(R.id.spinnerSize);
        limit = findViewById(R.id.spinnerTurnLimit);
        access = findViewById(R.id.spinnerAccess);

        deploy = findViewById(R.id.buttonDeploy);

        nameSV = findViewById(R.id.editTextNameSV);
        password = findViewById(R.id.editTextPassword);


//Adapter for map_size spinner
        ArrayAdapter<CharSequence> adapterMapSize = ArrayAdapter.createFromResource(
                this,
                R.array.map_Size,
                android.R.layout.simple_spinner_item
        );
        adapterMapSize.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        size.setAdapter(adapterMapSize);

// Adapter for turnLimit spinner
        ArrayAdapter<CharSequence> adapterTurnLimit = ArrayAdapter.createFromResource(
                this,
                R.array.turn_Limit,
                android.R.layout.simple_spinner_item
        );
        adapterTurnLimit.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        limit.setAdapter(adapterTurnLimit);

// Adapter for accessibility spinner
        ArrayAdapter<CharSequence> adapterAccessibility = ArrayAdapter.createFromResource(
                this,
                R.array.accessibility,
                android.R.layout.simple_spinner_item
        );
        adapterAccessibility.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        access.setAdapter(adapterAccessibility);


        sizeString = size.getSelectedItem().toString();
        limitString = limit.getSelectedItem().toString();
        accessString = access.getSelectedItem().toString();

        back.setOnClickListener(new View.OnClickListener() { /*go to CreateServer page*/
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CreateServer.this, ServerList.class);
                startActivity(i);
            }
        });



        size.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { //function that setting value for each player count item
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String a = size.getItemAtPosition(position).toString();
                switch (position){
                    case 0:

                        //setSize(30);
                        break;
                    case 1:
                        //setSize(40);
                        break;
                    case 2:
                        //setSize(50);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        limit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { //function that setting value for each turn limit item
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String a = limit.getItemAtPosition(position).toString();
                    switch (position){
                        case 0:
                            //setLimit(30);
                            break;
                        case 1:
                            //setLimit(40);
                            break;
                        case 2:
                            //setLimit(50);
                            break;
                    }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        access.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String a = access.getItemAtPosition(position).toString();
                if (a.equals("Private")) { //part to check accessibility spinner is private and activate edittext password
                      //part to check accessibility spinner is private and activate edittext password
                        password.setFocusableInTouchMode(true);
                        password.setFocusable(true);
                    } else {
                        password.setFocusable(false);
                        password.setClickable(false);
                    }
                }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
            });


                nameSV.addTextChangedListener(new TextWatcher() {

                    String sizeString = size.getSelectedItem().toString();
                    String limitString = limit.getSelectedItem().toString();
                    String accessString = access.getSelectedItem().toString();

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {

                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                        if (s.length() > 0) {
                            deploy.setClickable(true);
                            deploy.setBackgroundColor(Color.BLUE);
                        } else {
                            deploy.setClickable(false);
                            deploy.setBackgroundColor(Color.GRAY);
                        }
                    }

                });

        deploy.setOnClickListener(new View.OnClickListener() { //Deploy button
            @Override
            public void onClick(View v) {
                if(nameSV.getText().toString().length() > 0){
                    String title = nameSV.getText().toString();
                    //arrayList.add(name);
                    //arrayAdapter.notifyDataSetChanged();
                }
            }
        });

    }
        }

