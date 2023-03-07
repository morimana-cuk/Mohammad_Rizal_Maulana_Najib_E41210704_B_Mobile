package com.example.intent_explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    Button btnsend;

    private String KEY_NAME="NAMA";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.edit_nama);
        btnsend = (Button) findViewById(R.id.btn_send);

                btnsend.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            String nama = name.getText().toString();
                            if (nama !=""){
                                Intent i = new Intent(MainActivity.this, activity_second.class);
                                i.putExtra(KEY_NAME, nama);
                                startActivity(i);
                            }
                            else {
                                Toast.makeText(getApplication(),"you need to fill your name", Toast.LENGTH_SHORT);
                            }

                        }catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(getApplication(),"error, try again!", Toast.LENGTH_SHORT);
                        }
                    }
                });
    }
}