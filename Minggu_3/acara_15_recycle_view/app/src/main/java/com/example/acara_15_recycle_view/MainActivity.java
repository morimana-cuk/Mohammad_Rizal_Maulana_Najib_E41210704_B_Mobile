package com.example.acara_15_recycle_view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> MahasiswaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycleview);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new MahasiswaAdapter(MahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    void addData(){

    MahasiswaArrayList = new ArrayList<>();
    MahasiswaArrayList.add(new Mahasiswa("Dimas Maulana", "1414370309","123456789"));
        MahasiswaArrayList.add(new Mahasiswa("fadly", "1214234560","987654321"));
        MahasiswaArrayList.add(new Mahasiswa("Ariyandi Nugraha", "1214230345","987648765"));
        MahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "1214378098","098758124"));
    }
}


