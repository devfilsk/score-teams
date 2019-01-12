package com.example.filipemaciel.scoreteams;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.score_team_A)
    TextView scoreTeamA;
    @BindView(R.id.score_team_B)
    TextView scoreTeamB;

    private Integer pointsTeamA = 0;
    private Integer pointsTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.home_btn1_A)
    public void treePointsTeamA(){
        this.pointsTeamA += 3;
        scoreTeamA.setText(String.valueOf(this.pointsTeamA));
    }
    @OnClick(R.id.home_btn1_B)
    public void treePointsTeamB(){
        this.pointsTeamB += 3;
        scoreTeamB.setText(String.valueOf(pointsTeamB));
    }
    @OnClick(R.id.home_btn2_A)
    public void twoPointsTeamA(){
        this.pointsTeamA += 2;
        scoreTeamA.setText(String.valueOf(pointsTeamA));
    }
    @OnClick(R.id.home_btn2_B)
    public void twoPointsTeamB(){
        this.pointsTeamB += 2;
        scoreTeamB.setText(String.valueOf(pointsTeamB));
    }
    @OnClick(R.id.home_btn3_A)
    public void throwPointsTeamA(){
        this.pointsTeamA += 1;
        scoreTeamA.setText(String.valueOf(pointsTeamA));
    }
    @OnClick(R.id.home_btn3_B)
    public void throwPointsTeamB(){
        this.pointsTeamB += 1;
        scoreTeamB.setText(String.valueOf(pointsTeamB));
    }

    @OnClick(R.id.home_reset)
    public void resetAllScore(){
        scoreTeamA.setText(String.valueOf(pointsTeamA=0));
        scoreTeamB.setText(String.valueOf(pointsTeamB=0));
    }

    class Teams {
        BindView
    }
}
