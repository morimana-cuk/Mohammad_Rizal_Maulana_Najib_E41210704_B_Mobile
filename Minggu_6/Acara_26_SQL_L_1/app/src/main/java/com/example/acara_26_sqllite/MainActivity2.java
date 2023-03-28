package com.example.acara_26_sqllite;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Environment;
import android.view.View;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import android.widget.TextView;
import android.os.Bundle;
public class MainActivity2 extends AppCompatActivity {
    TextView showText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        showText = (TextView) findViewById(R.id.getText);
    }
    public  void back(){
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }
    public void getPublic (View view){
        File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);//folder name
        File myFile = new File(folder, "myDataR.txt");//file name
        String text = getdata(myFile);
        if (text != null){
            showText.setText(text);
        }else {
            showText.setText("No Data");
        }
    }

    public void getPrivate(View view) {
        File folder = getExternalFilesDir("rizal");//file folder
        File myFile = new File(folder, "myData2R.txt");//file name
        String text = getdata(myFile);
        if (text != null){
            showText.setText(text);
        }else{
            showText.setText("no data");
        }
    }

    private  String getdata(File myFile){
        FileInputStream fileinputStream = null;
        try {
            fileinputStream = new FileInputStream(myFile);
            int i = -1;
            StringBuffer buffer = new StringBuffer();
            while ((i = fileinputStream.read())!=-1){
                buffer.append((char)i);
            }
            return buffer.toString();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (fileinputStream != null){
                try {
                    fileinputStream.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        return  null;
    }
}