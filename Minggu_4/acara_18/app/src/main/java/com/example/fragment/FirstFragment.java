package com.example.fragment;
import android.os.Bundle;
//import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.app.FragmentTransaction;
import android.app.FragmentManager;
import android.app.Fragment;


import androidx.annotation.Nullable;
public class FirstFragment extends Fragment {
    View view;
    Button firstButton;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle saveInstanceState){
        //inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_first, container, false);
        //get the reference of button
        firstButton = view.findViewById(R.id.firstButton);
        //perform setOnClikclistteneron secondButton
        firstButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){
                //display a massage by using a toast
                Toast.makeText(getActivity(),"first fragment", Toast.LENGTH_LONG).show();
            }
        });
        return  view;
    }
}