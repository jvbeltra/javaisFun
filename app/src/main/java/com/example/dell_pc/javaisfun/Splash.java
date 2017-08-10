package com.example.dell_pc.javaisfun;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent i = new Intent(Splash.this, MainActivity.class);
                startActivity(i);

                overridePendingTransition(R.anim.up_in, R.anim.up_out);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
