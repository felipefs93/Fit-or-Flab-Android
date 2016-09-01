package com.soaresfelipef.fitorflab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    public static final String EXERCISE_WEIGHTS = "Weight lifting";
    public static final String EXERCISE_YOGA = "Yoga";
    public static final String EXERCISE_CARDIO = "Cardio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout weightButton = (RelativeLayout)findViewById(R.id.weightButton);
        RelativeLayout lotusButton = (RelativeLayout)findViewById(R.id.yogaButton);
        RelativeLayout cardioButton = (RelativeLayout)findViewById(R.id.cardioButton);

        weightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(EXERCISE_WEIGHTS);
            }
        });

        lotusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(EXERCISE_YOGA);
            }
        });

        cardioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDetailActivity(EXERCISE_CARDIO);
            }
        });
    }

    private void loadDetailActivity(String exerciseTitle){

    }
}
