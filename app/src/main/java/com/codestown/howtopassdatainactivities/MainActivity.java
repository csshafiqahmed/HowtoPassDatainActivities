package com.codestown.howtopassdatainactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void gotoNext(View view) {
        Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
        intent.putExtra("name","Ahsan");
        intent.putExtra("age",20);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}