package com.dhumal.studyquizadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(1500);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent l = new Intent(splash.this,MainActivity.class);
                    startActivity(l);
                }
            }
        };thread.start();



    }
}