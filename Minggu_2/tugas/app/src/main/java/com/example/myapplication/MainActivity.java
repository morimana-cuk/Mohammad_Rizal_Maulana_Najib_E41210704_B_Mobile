package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnconstrain(View view){
        Intent intent = new Intent(MainActivity.this, com.example.myapplication.ConstrainActivity.class);
        startActivity(intent);
    }

    public void btnlinier(View view){
        Intent intent = new Intent(MainActivity.this, com.example.myapplication.LinearLayout.class);
        startActivity(intent);
    }

    public void btnframe(View view){
        Intent intent = new Intent(MainActivity.this, com.example.myapplication.FrameActivity.class);
        startActivity(intent);
    }

    public void btnhorizontal(View view){
        Intent intent = new Intent(MainActivity.this, com.example.myapplication.HorizontalActivity.class);
        startActivity(intent);
    }

    public void btnmaterial(View view){
        Intent intent = new Intent(MainActivity.this, com.example.myapplication.MaterialActivity.class);
        startActivity(intent);
    }

    public void btnrelative(View view){
        Intent intent = new Intent(MainActivity.this, com.example.myapplication.relative_layout.class);
        startActivity(intent);
    }

    public void btnscroll(View view){
        Intent intent = new Intent(MainActivity.this, com.example.myapplication.ScrollActivity.class);
        startActivity(intent);
    }

    public void btntabel(View view){
        Intent intent = new Intent(MainActivity.this, com.example.myapplication.TabelActivity.class);
        startActivity(intent);
    }
}