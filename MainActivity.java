package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreWrestler1 = 0;
    int scoreWrestler2 = 0;
    /**
     * Displays the given score for Team A.
     */
    public void displayForWrestler1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.wrestler_1_score);
        scoreView.setText(String.valueOf(score));
        if(scoreWrestler1 == 99)
        {
            scoreView.setText(String.valueOf("WIN"));
            displayForWrestler2(scoreWrestler1);
        }
        if(scoreWrestler2 == 99)
        {
            scoreView.setText(String.valueOf("LOSE"));
        }

    }

    public void addOneForWrestler1(View v) {
        scoreWrestler1 = scoreWrestler1 + 1;
        displayForWrestler1(scoreWrestler1);
    }

    public void addTwoForWrestler1(View v) {
        scoreWrestler1 = scoreWrestler1 + 2;
        displayForWrestler1(scoreWrestler1);
    }

    public void addThreeForWrestler1(View v) {
        scoreWrestler1 = scoreWrestler1 + 3;
        displayForWrestler1(scoreWrestler1);
    }

    public void pinForWrestler1(View v) {
        scoreWrestler1 = 99;
        displayForWrestler1(scoreWrestler1);

    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForWrestler2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.wrestler_2_score);
        scoreView.setText(String.valueOf(score));
        if (scoreWrestler2 == 99)
        {
            scoreView.setText(String.valueOf("WIN"));
            displayForWrestler1(scoreWrestler2);
        }
        if (scoreWrestler1 == 99)
        {
            scoreView.setText(String.valueOf("LOSE"));
        }

    }

    public void addOneForWrestler2(View v) {
        scoreWrestler2 = scoreWrestler2 + 1;
        displayForWrestler2(scoreWrestler2);
    }

    public void addTwoForWrestler2(View v) {
        scoreWrestler2 = scoreWrestler2 + 2;
        displayForWrestler2(scoreWrestler2);
    }

    public void addThreeForWrestler2(View v) {
        scoreWrestler2 = scoreWrestler2 + 3;
        displayForWrestler2(scoreWrestler2);
    }

    public void pinForWreslter2(View v) {
        scoreWrestler2 = 99;
        displayForWrestler2(scoreWrestler2);
    }

    public void reset(View v){
        scoreWrestler1 = 0;
        scoreWrestler2 = 0;
        displayForWrestler1(scoreWrestler1);
        displayForWrestler2(scoreWrestler2);
    }






}

