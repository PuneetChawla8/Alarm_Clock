package com.example.student.alarmclock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    public static final int SPLASH_TIME_OUT=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TextView text=(TextView)findViewById(R.id.text);
        text.setTranslationY(-3000f);
        text.animate().translationYBy(3000f).setDuration(3000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(Splash.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
