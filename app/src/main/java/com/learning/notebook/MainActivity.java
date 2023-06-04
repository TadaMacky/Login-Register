package com.learning.notebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton Fingerprint;
    private EditText passwordInput;
    private EditText userIdInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        passwordInput = findViewById(R.id.Password_Input);
        userIdInput = findViewById(R.id.User_Id_Input);
    }

    public void Login(View view) {
        String password = passwordInput.getText().toString();
        String userId = userIdInput.getText().toString();

        if (password.equals("123") && userId.equals("071303")) {
            // Correct credentials, switch activity and close current activity
            Intent intent = new Intent(this, MainMenu.class);
            startActivity(intent);
            finish();
        } else {
            // Wrong credentials or fingerprint doesn't match, show toast
            Toast.makeText(this, "Wrong Credentials or Fingerprint Doesn't Match", Toast.LENGTH_SHORT).show();
        }
    }
}