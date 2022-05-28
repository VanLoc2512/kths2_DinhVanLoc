package com.example.kths2_dinhvanloc;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    ListView listdanhsach;
    ArrayList<Danhsach> danhsach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Danh Sách");
        actionBar.setDisplayHomeAsUpEnabled(true);
//        actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_menu_24);
        setContentView(R.layout.activity_main);

        listdanhsach = findViewById(R.id.danhsach);
        danhsach = Danhsach.dulieu();
        AdapterDanhSach adapterDanhSach = new AdapterDanhSach(MainActivity.this, R.layout.item_danhsach, danhsach);
        listdanhsach.setAdapter(adapterDanhSach);
        listdanhsach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String ten;
                ten = danhsach.get(i).getTenquocgia();
                Toast.makeText(MainActivity.this, ten, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                //onBackPressed();
                Toast.makeText(this, "Bạn vừa bấm menu", Toast.LENGTH_LONG).show();
                return true;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }


}