package com.example.simple_login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText=findViewById(R.id.username_input);
        passwordEditText=findViewById(R.id.password_input);
        Button loginButton = findViewById(R.id.login_btn);

        loginButton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if(username.equals("admin") && password.equals("admin")){
                    Toast.makeText(MainActivity.this, "Login successful",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Invalid Username or password",Toast.LENGTH_SHORT).show();
                }
            }
        });
            }
}