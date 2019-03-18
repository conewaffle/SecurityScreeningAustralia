package com.example.securityscreeningaustralia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);

        final TextView textView = findViewById(R.id.textView);

        final ImageView up = findViewById(R.id.imageView);

        final ImageView left = findViewById(R.id.imageView2);

        final ImageView right = findViewById(R.id.imageView3);

        final ImageView down = findViewById(R.id.imageView4);

        final Animation fadeIn = new AlphaAnimation(0,1);
        fadeIn.setDuration(500);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){

                up.setVisibility(View.INVISIBLE);
                left.setVisibility(View.INVISIBLE);
                right.setVisibility(View.INVISIBLE);
                down.setVisibility(View.INVISIBLE);

                int random = (int)(Math.random()*4+1);
                if (random==1){
                    textView.setText("Please proceed to the up lane.");
                    textView.startAnimation(fadeIn);
                    up.setVisibility(View.VISIBLE);
                    up.startAnimation(fadeIn);
                }
                else if (random==2){
                    textView.setText("Please proceed to the left lane.");
                    textView.startAnimation(fadeIn);
                    left.setVisibility(View.VISIBLE);
                    left.startAnimation(fadeIn);
                }
                else if (random==3){
                    textView.setText("Please proceed to the right lane.");
                    textView.startAnimation(fadeIn);
                    right.setVisibility(View.VISIBLE);
                    right.startAnimation(fadeIn);
                }
                else {
                    textView.setText("Please proceed to the down lane.");
                    textView.startAnimation(fadeIn);
                    down.setVisibility(View.VISIBLE);
                    down.startAnimation(fadeIn);
                }


            }
        });



    }


}
