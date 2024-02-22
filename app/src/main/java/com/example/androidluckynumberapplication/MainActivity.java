package com.example.androidluckynumberapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button btn;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText =(EditText) findViewById(R.id.enterYourName);
        btn = (Button)  findViewById(R.id.button);
        txt = (TextView) findViewById(R.id.textView);
    }
}