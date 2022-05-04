package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private static final int SECRET_KEY = 99;
    /**Username és Password beolvasó változók az EditText mezőből */
    EditText userNameReader;
    EditText passwordReader;

    private SharedPreferences mainActivityPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        /**Username és Password beolvasása az EditText mezőből */
        userNameReader = findViewById(R.id.EditTextUserNameInsertion);
        passwordReader = findViewById(R.id.EditTextUserPasswordInsertion);

    }

    public void Login(View view) {

        String userName = userNameReader.getText().toString();
        String password = passwordReader.getText().toString();
    }

    public void LoginWithGoogle(View view) {
    }

    public void LoginWithFacebook(View view) {
    }
    /**REgisztráció intentje, ezzel aktiváljuk a RegistrationActivity-t */
    public void register(View view) {
        Intent registerIntent = new Intent(this, RegistrationActivity.class);
        registerIntent.putExtra("SECRET_KEY", 99);
        startActivity(registerIntent);
    }
//TODO: Ezt a kommentet átírni
    /**Pause esetén az adatokat átmenetileg tároljuk 2. videó 1 óra körül folyt*/
    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences.Editor saveFields = mainActivityPref.edit();
        saveFields.putString("userName", userNameReader.getText().toString());
        saveFields.putString("password", passwordReader.getText().toString());
        saveFields.apply();

    }
}