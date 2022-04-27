  package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

  public class MainActivity extends AppCompatActivity {

    private EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
    }

    public void gotoRestaurant(View view){
        String uname = username.getText().toString();
        String pwd = password.getText().toString();
        if(uname.equals("ishu") && pwd.equals("qwerty")){
            Intent intent = new Intent(this, RestaurantActivity.class);
            Toast.makeText(this, "Welcome!", Toast.LENGTH_LONG).show();
            startActivity(intent);
        }else{
            Toast.makeText(this, "Username or password invalid", Toast.LENGTH_LONG).show();
        }
    }
}