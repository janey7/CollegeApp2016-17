package com.example.csaper6.collegeapp.Presenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.csaper6.collegeapp.R;

/**
 * Created by csaper6 on 12/15/16.
 */
public class LoginScreen extends AppCompatActivity implements View.OnClickListener {
    private EditText username, password, forgetPassword;
    private Button login, signUp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_in_screen);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        forgetPassword = (EditText) findViewById(R.id.forgetPassword);
        login = (Button) findViewById(R.id.button_login);
        signUp = (Button) findViewById(R.id.button_signUp);
        login.setOnClickListener(this);
        signUp.setOnClickListener(this);
    }




    @Override
    public void onClick(View view) {
        final int id = view.getId();
        switch (id) {
            case R.id.button_login:
                startActivity((new Intent(this, MainActivity.class)));
                finish();
                break;
            case R.id.button_signUp:
                startActivity((new Intent(this, AccountCreationScreen.class)));
                finish();
                break;
        }
    }
}


