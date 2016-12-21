package com.example.csaper6.collegeapp.Presenter;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.csaper6.collegeapp.R;

/**
 * Created by csaper6 on 12/15/16.
 */
public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        //countdown timer to start the intent???
        final TextView timeRemain = (TextView) findViewById(R.id.timeRemain);

        new CountDownTimer(5000, 1000) { //5 seconds
            public void onTick(long millisUntilFinished) {
                timeRemain.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                startActivity(new Intent(SplashScreen.this, LoginScreen.class));
                finish();
            }

        }.start();

    }
}
