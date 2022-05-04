package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import javax.crypto.SecretKey;

public class RegistrationActivity extends AppCompatActivity {
    EditText nameEditText;
    EditText emailEditText;
    EditText phoneEditText;
    EditText userNameEditText;
    EditText passEditText;
    EditText passrepeatEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Bundle bundle = getIntent().getExtras();
        int secretKey = bundle.getInt("SECRET_KEY");

        if (secretKey != 99) {
            finish();
        }

        nameEditText = findViewById(R.id.editTextNameRegister);
        emailEditText = findViewById(R.id.editTextEmailAddress);
        phoneEditText = findViewById(R.id.editTextPhoneNumber);
        userNameEditText = findViewById(R.id.editUserNameRegister);
        passEditText = findViewById(R.id.editTextPasswordRegister);
        passrepeatEditText = findViewById(R.id.editTextPasswordRepeat);
    }

    public void Cancel(View view) {
        finish();
    }

    public void Registration(View view) {
        String userName = nameEditText.getText().toString();
        String email = emailEditText.getText().toString();
        String phoneNumber = phoneEditText.getText().toString();
        String user = userNameEditText.getText().toString();
        String password = passEditText.getText().toString();
        String passwordRepeat = passrepeatEditText.getText().toString();
    }
}
