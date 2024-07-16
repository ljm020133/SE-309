package com.example.screens.ScreensJava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;

import com.example.screens.R;

public class MainActivity extends AppCompatActivity {
    private static final String url = "https://3fe17056-4125-4ca3-ba66-81c21ed306b8.mock.pstmn.io/Login";

    String ID = "admin";
    String Password = "admin";
    String users = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        Button start = findViewById(R.id.buttonStart);
        Button register = findViewById(R.id.buttonRegister);
        Button quit = findViewById(R.id.buttonQuit);

        EditText username = findViewById(R.id.IDText);
        EditText password = findViewById(R.id.PasswordText);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))   {

                    Intent intent = new Intent(MainActivity.this, UserDashboard.class);
                    startActivity(intent);
                } else {
                    //wrong password
                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ID = username.getText().toString();
                Password = password.getText().toString();
                Intent intent = new Intent(MainActivity.this, UserDashboard.class);
                startActivity(intent);
            }
        });

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v ) {

            }
        });
    }












//    private void getRequest() {
//        EditText testText = findViewById(R.id.testText);
//        EditText username = findViewById(R.id.IDText);
//        EditText password = findViewById(R.id.PasswordText);
//        // Request a string response from the provided URL.
//        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        // Display the first 500 characters of the response string.
//                        // String response can be converted to JSONObject via
//                        // JSONObject object = new JSONObject(response);
//                        JSONObject jsonResponse = null;
//                        try {
//                            jsonResponse = new JSONObject(response);
//                        } catch (JSONException e) {
//                            throw new RuntimeException(e);
//                        }
//                        try {
//                            String jsonUsername = jsonResponse.getString("username");
//                            String jsonEmail = jsonResponse.getString("email");
//                            String jsonPassword = jsonResponse.getString("password");
//                            testText.setText("Response is: "+ response);
//                            username.setText(jsonUsername);
//                            password.setText(jsonPassword);
//
//
//                        } catch (JSONException e) {
//                            throw new RuntimeException(e);
//                        }
//                        testText.setText("Response is: "+ response);
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        testText.setText("That didn't work!" + error.toString());
//                    }
//                }){
//
//            @Override
//            public Map<String, String> getHeaders() throws AuthFailureError {
//                HashMap<String, String> headers = new HashMap<String, String>();
//                //                headers.put("Authorization", "Bearer YOUR_ACCESS_TOKEN");
//                //                headers.put("Content-Type", "application/json");
//                return headers;
//            }
//
//            @Override
//            protected Map<String, String> getParams() {
//                Map<String, String> params = new HashMap<String, String>();
//                //                params.put("param1", "value1");
//                //                params.put("param2", "value2");
//                return params;
//            }
//        };
//
//        // Adding request to request queue
//        VolleySingleton.getInstance(getApplicationContext()).addToRequestQueue(stringRequest);
//    }
//
//    private void postRequest() {
//
//        // Convert input to JSONObject
//        JSONObject postBody = null;
//        EditText reportUsername = findViewById(R.id.IDText);
//        EditText reportPassword = findViewById(R.id.PasswordText);
//        EditText testText = findViewById(R.id.testText);
//
//        try{
//            // etRequest should contain a JSON object string as your POST body
//            // similar to what you would have in POSTMAN-body field
//            // and the fields should match with the object structure of @RequestBody on sb
//            postBody = new JSONObject(reportUsername.getText().toString());
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//
//        JsonObjectRequest request = new JsonObjectRequest(
//                Request.Method.POST,
//                url,
//                postBody,
//                new Response.Listener<JSONObject>() {
//                    @Override
//                    public void onResponse(JSONObject response) {
//                        testText.setText(response.toString());
//                    }
//                },
//                new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        testText.setText(error.getMessage());
//                    }
//                }
//        ){
//            @Override
//            public Map<String, String> getHeaders() throws AuthFailureError {
//                HashMap<String, String> headers = new HashMap<String, String>();
//                //                headers.put("Authorization", "Bearer YOUR_ACCESS_TOKEN");
//                //                headers.put("Content-Type", "application/json");
//                return headers;
//            }
//
//            @Override
//            protected Map<String, String> getParams() {
//                Map<String, String> params = new HashMap<String, String>();
//                //                params.put("param1", "value1");
//                //                params.put("param2", "value2");
//                return params;
//            }
//        };
//
//        // Adding request to request queue
//        VolleySingleton.getInstance(getApplicationContext()).addToRequestQueue(request);
//    }
}

