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

    ImageView Worm1;
    ImageView Worm2;
    ImageView Worm3;
    ImageView Worm4;
    ImageView Worm5;
    ImageView Worm6;
    ImageView Worm7;
    ImageView Worm8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_one);
        textView = findViewById(R.id.timerTextView);

        Worm1= findViewById(R.id.worm1);
        Worm2= findViewById(R.id.worm2);
        Worm3= findViewById(R.id.worm3);
        Worm4= findViewById(R.id.worm4);
        Worm5= findViewById(R.id.worm5);
        Worm6= findViewById(R.id.worm6);
        Worm7= findViewById(R.id.worm7);
        Worm8= findViewById(R.id.worm8);

        Worm1.setVisibility(View.INVISIBLE);
        Worm2.setVisibility(View.INVISIBLE);
        Worm3.setVisibility(View.INVISIBLE);
        Worm4.setVisibility(View.INVISIBLE);
        Worm5.setVisibility(View.INVISIBLE);
        Worm6.setVisibility(View.INVISIBLE);
        Worm7.setVisibility(View.INVISIBLE);
        Worm8.setVisibility(View.INVISIBLE);

        new CountDownTimer(50000, 1000) {
            public void onTick(long millisUntilFinished) {
                long sec = (millisUntilFinished / 1000) ;
                textView.setText(sec+"");
            }
            // When the task is over it will print 00:00:00 there
            public void onFinish() {
                textView.setText("0");
            }
        }
        .start();

        new CountDownTimer(3000, 1000) {
            public void onTick(long millisUntilFinished) {
                long sec = (millisUntilFinished / 1000) ;
                Worm1.setVisibility(View.VISIBLE);
                Worm1.onTouchEvent(){
            }
            // When the task is over it will print 00:00:00 there
            public void onFinish() {
                Worm1.setVisibility(View.INVISIBLE);
            }
        }
        .start();
    }
}