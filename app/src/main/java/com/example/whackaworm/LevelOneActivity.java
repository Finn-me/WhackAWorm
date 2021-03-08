package com.example.whackaworm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class LevelOneActivity extends AppCompatActivity {
    TextView textView;
    TextView ScoreView;
ImageView[] Worms = new ImageView[8];
    int score = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_one);
        textView = findViewById(R.id.timerTextView);
        ScoreView = findViewById(R.id.ScoreView);



        ImageView Worm1= findViewById(R.id.worm1);
        ImageView Worm2= findViewById(R.id.worm2);
        ImageView Worm3= findViewById(R.id.worm3);
        ImageView Worm4= findViewById(R.id.worm4);
        ImageView Worm5= findViewById(R.id.worm5);
        ImageView Worm6= findViewById(R.id.worm6);
        ImageView Worm7= findViewById(R.id.worm7);
        ImageView Worm8= findViewById(R.id.worm8);

        Worm1.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Worm1.setVisibility(View.INVISIBLE);
                Toast.makeText(getApplicationContext(),"worm 1 was touched", Toast.LENGTH_SHORT).show();
               score = score + 1;
                ScoreView.setText(score+"");
                return false;
            }
        });
        Worm2.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Worm2.setVisibility(View.INVISIBLE);
                Toast.makeText(getApplicationContext(),"worm 2 was touched", Toast.LENGTH_SHORT).show();
                score = score + 1;
                ScoreView.setText(score+"");
                return false;
            }
        });
        Worm3.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Worm3.setVisibility(View.INVISIBLE);
                Toast.makeText(getApplicationContext(),"worm 3 was touched", Toast.LENGTH_SHORT).show();
                score = score + 1;
                ScoreView.setText(score+"");
                return false;
            }
        });
        Worm4.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Worm4.setVisibility(View.INVISIBLE);
                Toast.makeText(getApplicationContext(),"worm 4 was touched", Toast.LENGTH_SHORT).show();
                score = score + 1;
                ScoreView.setText(score+"");
                return false;
            }
        });
        Worm5.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Worm5.setVisibility(View.INVISIBLE);
                Toast.makeText(getApplicationContext(),"worm 5 was touched", Toast.LENGTH_SHORT).show();
                score = score + 1;
                ScoreView.setText(score+"");
                return false;
            }
        });
        Worm6.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Worm6.setVisibility(View.INVISIBLE);
                Toast.makeText(getApplicationContext(),"worm 6 was touched", Toast.LENGTH_SHORT).show();
                score = score + 1;
                ScoreView.setText(score+"");
                return false;
            }
        });
        Worm7.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Worm7.setVisibility(View.INVISIBLE);
                Toast.makeText(getApplicationContext(),"worm 7 was touched", Toast.LENGTH_SHORT).show();
                score = score + 1;
                ScoreView.setText(score+"");
                return false;
            }
        });
        Worm8.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Worm8.setVisibility(View.INVISIBLE);
                Toast.makeText(getApplicationContext(),"worm 8 was touched", Toast.LENGTH_SHORT).show();
                score = score + 1;
                ScoreView.setText(score+"");
                return false;
            }
        });

        Worm1.setVisibility(View.INVISIBLE);
        Worm2.setVisibility(View.INVISIBLE);
        Worm3.setVisibility(View.INVISIBLE);
        Worm4.setVisibility(View.INVISIBLE);
        Worm5.setVisibility(View.INVISIBLE);
        Worm6.setVisibility(View.INVISIBLE);
        Worm7.setVisibility(View.INVISIBLE);
        Worm8.setVisibility(View.INVISIBLE);

        Worms[0] = Worm1;
        Worms[1] = Worm2;
        Worms[2] = Worm3;
        Worms[3] = Worm4;
        Worms[4] = Worm5;
        Worms[5] = Worm6;
        Worms[6] = Worm7;
        Worms[7] = Worm8;
        CountDownTimer wormTimer = new CountDownTimer(3000, 3000) {
            //Declare a global variable here
            Random random = new Random();
            int randNum;

            public void onTick(long millisUntilFinished) {
                //Get the actual random value here
                randNum = random.nextInt(8);
                Worms[randNum].setVisibility(View.VISIBLE);
            }

            public void onFinish() {
                Worms[randNum].setVisibility(View.INVISIBLE);

                start();


            }
        }.start();

        CountDownTimer mainTimer = new CountDownTimer(30000, 1000) {
            public void onTick(long millisUntilFinished) {
                long sec = millisUntilFinished / 1000;
                textView.setText(sec+"");
            }
            // When the task is over it will print 00:00:00 there
            public void onFinish() {
                wormTimer.cancel();
                textView.setText("0");
            }
        }.start();



    }
}
