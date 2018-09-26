package com.chuks.chioma.eight_ball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static com.chuks.chioma.eight_ball.R.id.askButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall);

        final int[]  ballArray = {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3,
                R.drawable.ball4, R.drawable.ball5};

        Button myButton;
        myButton = (Button) findViewById(askButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator= new Random();
                int num = randomNumberGenerator.nextInt(5);
                ballDisplay.setImageResource(ballArray[num]);
            }
        });
    }
}
