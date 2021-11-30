package com.geektech.month3_android1_homework5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        getSupportFragmentManager().beginTransaction().add(R.id.container, new MainFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container2, new SecondFragment()).commit();
        ArrayList<String> list = new ArrayList<>();

            list.add("Blank Space");

        recyclerAdapter = new RecyclerAdapter(list);
        recyclerView.setAdapter(recyclerAdapter);
    }
}