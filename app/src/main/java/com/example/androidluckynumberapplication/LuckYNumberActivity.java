package com.example.androidluckynumberapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LuckYNumberActivity extends AppCompatActivity {
    TextView welcomeTxt, luckyNumberTxt;
    Button shareBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luck_ynumber);
        welcomeTxt =(TextView) findViewById(R.id.textViewYourLuckyNumber);
        luckyNumberTxt = (TextView)  findViewById(R.id.textViewNumber);
        shareBtn = (Button)  findViewById(R.id.shareNumber);
    }
}