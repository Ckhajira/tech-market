package com.example.techmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class AllProducts extends AppCompatActivity {

    private RecyclerView productsRecView;
    private ProductRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_products);

        adapter = new ProductRecViewAdapter(this);
        productsRecView = findViewById(R.id.productsRecView);

        productsRecView.setAdapter(adapter);
    }
}