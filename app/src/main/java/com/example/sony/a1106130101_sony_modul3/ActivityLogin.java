package com.example.sony.a1106130101_sony_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class ActivityLogin extends AppCompatActivity {

    EditText username, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        login = (Button)findViewById(R.id.btnlogin);

        login.setOnClickListener(()){

                    password.getText().toString();
                    if (username.getText().toString().equals("EAD")&& password.getText().toString().equals("MOBILE")){
                        Toast.makeText(context ActivityLogin.this, text "Login Berhasil",Toast.makeText(LENGTH_LONG).show();)
                    }
    }
}
