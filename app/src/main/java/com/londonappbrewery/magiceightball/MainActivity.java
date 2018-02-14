package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton = (Button) findViewById(R.id.buttonAsk);
        final ImageView viewImage = (ImageView) findViewById(R.id.imageView);


        final int[] imageArray = {R.drawable.ball1_2x,
                R.drawable.ball2_2x,
                R.drawable.ball3_2x,
                R.drawable.ball4_2x,
                R.drawable.ball5_2x};
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomImage = new Random();
                int number =randomImage.nextInt(5);

                viewImage.setImageResource(imageArray[number]);


            }
        });

    }
}