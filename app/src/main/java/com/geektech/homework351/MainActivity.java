package com.geektech.homework351;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Integer> numbers;
    private RecyclerView recyclerView;
    private NumberAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadData();
        recyclerView = findViewById(R.id.recycler);
        adapter = new NumberAdapter(numbers);
        recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        numbers = new ArrayList<>();
        numbers.add(700234411);
        numbers.add(707774311);
        numbers.add(500243544);
        numbers.add(312113222);
        numbers.add(312231111);
        numbers.add(312231211);
        numbers.add(312231223);
        numbers.add(312432211);
        numbers.add(505430323);
        numbers.add(500341345);
        numbers.add(700563423);
        numbers.add(700344556);
        numbers.add(502020600);
    }
}