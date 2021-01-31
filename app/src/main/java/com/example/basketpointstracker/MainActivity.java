package com.example.basketpointstracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    int teamAScore=0;
    int teamBScore=0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doInc3ForTeamA(View view)
    {
        teamAScore=teamAScore+3;
        displayA(teamAScore);
    }

    public void doInc2ForTeamA(View view)
    {
        teamAScore=teamAScore+2;
        displayA(teamAScore);
    }

    public void freeThrowA(View view)
    {
        teamAScore=teamAScore+1;
        displayA(teamAScore);
    }

    public void displayA(int number)
    {
        TextView tv=(TextView) findViewById(R.id.team_a_points);
        tv.setText(""+number);
    }

    public void doInc3ForTeamB(View view)
    {
        teamBScore=teamBScore+3;
        displayB(teamBScore);
    }

    public void doInc2ForTeamB(View view)
    {
        teamBScore=teamBScore+2;
        displayB(teamBScore);
    }

    public void freeThrowB(View view)
    {
        teamBScore=teamBScore+1;
        displayB(teamBScore);
    }

    public void displayB(int number)
    {
        TextView tv=(TextView) findViewById(R.id.team_b_points);
        tv.setText(""+number);
    }

    public void resetScores(View view)
    {
        teamAScore=0;
        teamBScore=0;
        displayA(0);
        displayB(0);
    }
}