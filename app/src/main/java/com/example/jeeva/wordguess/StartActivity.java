package com.example.jeeva.wordguess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }
    public void StartGame (View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
