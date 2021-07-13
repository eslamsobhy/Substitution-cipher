package com.example.subscipher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actionBtn1(View view) {
        Intent myIntent = new Intent(this, Main2Activity.class);
        startActivity(myIntent);
    }

    public void actionBtn2(View view) {
        Intent myIntent = new Intent(this, Main3Activity.class);
        startActivity(myIntent);
    }

    public void actionBtn6(View view) {
        Intent myIntent = new Intent(this, Main4Activity.class);
        startActivity(myIntent);
    }
}
