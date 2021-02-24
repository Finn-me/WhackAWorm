package com.example.whackaworm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LevelOneActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_one);
        textView = findViewById(R.id.timerTextView);

        new CountDownTimer(50000, 1000) {
            public void onTick(long millisUntilFinished) {
                long sec = (millisUntilFinished / 1000) ;
                textView.setText(sec+"");
            }
            // When the task is over it will print 00:00:00 there
            public void onFinish() {
                textView.setText("0");
            }
        }.start();
    }
}