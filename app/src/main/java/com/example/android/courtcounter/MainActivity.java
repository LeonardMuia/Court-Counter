package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    /* Global Variables */

    int resetValues = 0;
    int threePointerA = 0;
    int threePointerB = 0;
    int twoPointerA = 0;
    int twoPointerB = 0;
    int singlePointerA = 0;
    int singlePointerB = 0;
    int totalPointsA1;
    int totalPointsA2;
    int totalPointsA3;
    int totalPointsB1;
    int totalPointsB2;
    int totalPointsB3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Increment Button 3 Points Team A. */

    public void display1(View v) {
        threePointerA = threePointerA + 3;
        displayForTeamA1(threePointerA);
        totalPointsA1 = threePointerA;
        displayForTeamATotal(totalPointsA1 + totalPointsA2 + totalPointsA3);
    }

    /* Increment Button 2 Points Team A. */

    public void display2(View v) {
        twoPointerA = twoPointerA + 2;
        totalPointsA2 = twoPointerA;
        displayForTeamA2(twoPointerA);
        displayForTeamATotal(totalPointsA1 + totalPointsA2 + totalPointsA3);
    }

    /* Increment Button 1 Points Team A. */

    public void display3(View v) {
        singlePointerA = singlePointerA + 1;
        totalPointsA3 = singlePointerA;
        displayForTeamA3(singlePointerA);
        displayForTeamATotal(totalPointsA1 + totalPointsA2 + totalPointsA3);
    }

    /* Increment Button 3 Points Team B. */

    public void display4(View v) {
        threePointerB = threePointerB + 3;
        displayForTeamB1(threePointerB);
        totalPointsB1 = threePointerB;
        displayForTeamBTotal (totalPointsB1 + totalPointsB2 + totalPointsB3);
    }

    /* Increment Button 2 Points Team B. */

    public void display5(View v) {
        twoPointerB = twoPointerB + 2;
        displayForTeamB2(twoPointerB);
        totalPointsB2 = twoPointerB;
        displayForTeamBTotal (totalPointsB1 + totalPointsB2 + totalPointsB3);
    }

    /* Increment Button 1 Points Team B. */

    public void display6(View v) {
        singlePointerB = singlePointerB + 1;
        displayForTeamB3(singlePointerB);
        totalPointsB3 = singlePointerB;
        displayForTeamBTotal (totalPointsB1 + totalPointsB2 + totalPointsB3);
    }

    /* Reset Button */

    public void display7(View v) {
        threePointerA = 0;
        threePointerB = 0;
        twoPointerA = 0;
        twoPointerB = 0;
        singlePointerA = 0;
        singlePointerB = 0;
        totalPointsA1 = 0;
        totalPointsA2 = 0;
        totalPointsA3 = 0;
        totalPointsB1 = 0;
        totalPointsB2 = 0;
        totalPointsB3 = 0;
        displayForTeamA1(resetValues);
        displayForTeamA2(resetValues);
        displayForTeamA3(resetValues);
        displayForTeamB1(resetValues);
        displayForTeamB2(resetValues);
        displayForTeamB3(resetValues);
        displayForTeamATotal(resetValues);
        displayForTeamBTotal( resetValues);
    }


    /* Displays the given score for Team A. */

    public void displayForTeamA1(int score) {
        TextView scoreView = findViewById(R.id.three_points_team_A);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamA2(int score) {
        TextView scoreView = findViewById(R.id.two_points_team_A);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamA3(int score) {
        TextView scoreView = findViewById(R.id.single_point_team_A);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamATotal(int score) {
        TextView scoreView = findViewById(R.id.total_points_teamA);
        scoreView.setText(String.valueOf(score));
    }

    /* Displays the given score for Team B. */

    public void displayForTeamB1(int score) {
        TextView scoreView = findViewById(R.id.three_points_team_B);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB2(int score) {
        TextView scoreView = findViewById(R.id.two_points_team_B);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB3(int score) {
        TextView scoreView = findViewById(R.id.single_point_team_B);
        scoreView.setText(String.valueOf(score));}

    public void displayForTeamBTotal(int score) {
        TextView scoreView = findViewById(R.id.total_points_teamB);
        scoreView.setText(String.valueOf(score));
    }
}
