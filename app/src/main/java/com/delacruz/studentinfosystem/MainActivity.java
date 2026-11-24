package com.delacruz.studentinfosystem;

import android.os.Bundle;
import android.widget.Toast;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity {

    public class demoUser {
        String username = "lol";
        String password = "lol";
        String LastName = "";
        String FirstName = "";
        String MiddleName = "";
        int year = 3;
        String program = "";
        String specialization = "";
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        demoUser user = new demoUser();

        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.login);

        Button loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(v ->{
            Toast.makeText(this, "loggin in", Toast.LENGTH_SHORT).show();

            String username;
            String password;

            TextInputEditText x = findViewById(R.id.usernameEditText);
            TextInputEditText y = findViewById(R.id.passwordIdText);

            username = x.getText() != null ? x.getText().toString() : "";
            password = y.getText() != null ? y.getText().toString() : "";

            if(username.equals(user.username) && password.equals(user.password)) {
                setContentView(R.layout.studentinfo);
                Toast.makeText(this, "correct credentials", Toast.LENGTH_SHORT).show();
            }

        });
    }
}