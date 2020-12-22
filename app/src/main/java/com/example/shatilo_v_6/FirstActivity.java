package com.example.shatilo_v_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_screen);
    }
    public void onNextClick(View v)
    {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}