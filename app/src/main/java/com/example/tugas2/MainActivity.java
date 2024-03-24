package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Model> model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recyclerview);
        adapter = new Adapter(model);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    private void getData() {
        model = new ArrayList<>();
        model.add(new Model("M. Farhan Aulia Pratama", R.drawable.farhana12250113521 , "12250113521"));
        model.add(new Model("Ready Malik Putra", R.drawable.redi12250113761, "12250113761"));
        model.add(new Model("Rifki Faiz Azzurananda ", R.drawable.faiz12250113451,"12250113451"));
        model.add(new Model("Restu Kharrisa Andini ", R.drawable.andin12250124591,"122501134591"));
        model.add(new Model("Nur Delifah ", R.drawable.deli12250123957,"12250113957"));
        model.add(new Model("Farhan Fadhila ", R.drawable.farhanf12250113444,"12250113444"));
        model.add(new Model("Aqmal Syarif Fadilah ", R.drawable.aqmal12250113564,"12250113564"));
        model.add(new Model("Fadlan Nur Ramadhan ", R.drawable.alan12250113820,"12250113820"));
        model.add(new Model("Harry Finaldhi", R.drawable.harry12250113594,"12250113594"));
        model.add(new Model("Muhammad Ilham Akbar ", R.drawable.akbar12250113387,"12250113387"));
        model.add(new Model("Salsabila Aurelia Rickardo ", R.drawable.caca12250121918,"12250121918"));
        model.add(new Model("Tasya Dwi Yanti ", R.drawable.tasya12250123081,"12250113081"));
        model.add(new Model("Yuliana Mislianingsih", R.drawable.yana12250123497,"12250123497"));
        model.add(new Model("Muhammad Raja Fahrezy", R.drawable.raja12250113812,"12250113812" ));
    }
}