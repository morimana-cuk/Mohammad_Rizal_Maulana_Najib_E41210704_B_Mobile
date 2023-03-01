package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import androidx.fragment.app.FragmentTransaction;
//import androidx.fragment.app.Fragment;
//import androidx.fragment.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.FragmentManager;
import android.app.Fragment;



public class MainActivity extends AppCompatActivity {
    Button btnFirstFragment, btnSecondFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFirstFragment =(Button) findViewById(R.id.firstFragment);
        btnSecondFragment =(Button) findViewById(R.id.secondFragment);

        btnFirstFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //load first fragment
                loadFragment(new FirstFragment());
            }
        });
        btnSecondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //load second fragment
                loadFragment(new SecondFragment());
            }
        });
    }

    private void loadFragment(Fragment fragment){
        //create a Fragmentmanager
//        FragmentManager fm = getFragmentManager();
        FragmentManager fm = getFragmentManager();
        //create a FragmentTransaction to begin the transaction and replace the fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        //repalce the framelayout with Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();//save the changes
    }
}