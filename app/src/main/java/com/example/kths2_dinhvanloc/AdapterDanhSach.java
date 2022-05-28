package com.example.kths2_dinhvanloc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdapterDanhSach  extends ArrayAdapter<Danhsach> {
    Context context;
    int res;
    ArrayList<Danhsach> listDanhsach;

    public AdapterDanhSach(@NonNull Context context, int resource, @NonNull ArrayList<Danhsach> objects) {
        super(context, resource, objects);

        this.context = context;
        this.res = resource;
        this.listDanhsach=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null)
            convertView= LayoutInflater.from(context).inflate(res,parent,false);
        ImageView hinhanh=convertView.findViewById(R.id.coquocgia);
        TextView ten=convertView.findViewById(R.id.quocgia);
        TextView danso=convertView.findViewById(R.id.danso);


        Danhsach ds=listDanhsach.get(position);
        int anh= ds.getCoquocgia();
        hinhanh.setImageResource(anh);
        String tenquocgia= ds.getTenquocgia();
        ten.setText(tenquocgia);
        String chitiet=ds.getDanso();
        danso.setText(chitiet);

        return convertView;

    }
}