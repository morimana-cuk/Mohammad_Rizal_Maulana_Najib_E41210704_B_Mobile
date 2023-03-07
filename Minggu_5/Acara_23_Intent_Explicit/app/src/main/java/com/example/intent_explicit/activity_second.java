package com.example.intent_explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class activity_second extends AppCompatActivity {
    TextView txthello;
    private String nama;
    private  String KEY_NAMA="NAMA";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txthello =(TextView) findViewById(R.id.txthello);

        Bundle extra = getIntent().getExtras();
        nama = extra.getString(KEY_NAMA);
        txthello.setText("hello,"+nama+"!");
    }
}