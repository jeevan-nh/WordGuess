package com.example.jeeva.wordguess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class endActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String scoreMessage = extras.getString("Extra_Score");
        String message = extras.getString("Extra_message");
        TextView scoreText = (TextView) findViewById(R.id.finalScoreTextView);
        TextView endText = (TextView) findViewById(R.id.finishTextView);
        scoreText.setText(scoreMessage);
        endText.setText(message);
    }

    public void playAgain(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
