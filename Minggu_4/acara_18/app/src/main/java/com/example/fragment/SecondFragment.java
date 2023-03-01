package com.example.fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
import android.app.FragmentTransaction;
import android.app.FragmentManager;
import android.app.Fragment;


public class SecondFragment extends Fragment {
    View view;
    Button SecondButton;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle saveInstanceState){
        //inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_second, container, false);
        //get the reference of button
        SecondButton = view.findViewById(R.id.secondButton);
        //perform setOnClikclistteneron secondButton
        SecondButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){
                //display a massage by using a toast
                Toast.makeText(getActivity(),"second fragment", Toast.LENGTH_LONG).show();
            }
        });
        return  view;
    }
}