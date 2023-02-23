package com.example.acara_15_recycle_view;

import android.view.View;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder>{

    private ArrayList<Mahasiswa> dataList;
    public MahasiswaAdapter(ArrayList<Mahasiswa>dataList){
        this.dataList=dataList;
    }

    @Override
    public MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater LayoutInflater = android.view.LayoutInflater.from(parent.getContext());
        View view = LayoutInflater.inflate(R.layout.layout_list_view_item, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MahasiswaViewHolder Holder, int position){
        Holder.txtNama.setText(dataList.get(position).getNama());
        Holder.txtNpm.setText(dataList.get(position).getNpm());
        Holder.txtNoHp.setText(dataList.get(position).getNohp());
    }

    @Override
    public  int getItemCount(){
        return (dataList !=null)? dataList.size():0;
    }
    public class MahasiswaViewHolder extends  RecyclerView.ViewHolder{
    private TextView txtNama, txtNpm, txtNoHp;
    public MahasiswaViewHolder(View itemView){
        super(itemView);
        txtNama =(TextView) itemView.findViewById(R.id.txt_nama_mahasiswa);
        txtNpm =(TextView) itemView.findViewById(R.id.txt_npm_mahasiswa);
        txtNoHp =(TextView) itemView.findViewById(R.id.txt_nohp_mahasiswa);
    }
    }
}
