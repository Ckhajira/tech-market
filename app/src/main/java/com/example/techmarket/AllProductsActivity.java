package com.example.techmarket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class AllProductsActivity extends AppCompatActivity {

    private RecyclerView productsRecView;
    private ProductRecViewAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_products);



        adapter = new ProductRecViewAdapter(this);
        productsRecView = findViewById(R.id.productsRecView);

        productsRecView.setAdapter(adapter);
        productsRecView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Mac", 200, "https://cdn.pixabay.com/photo/2014/09/24/14/29/macbook-459196__340.jpg"
        ,"Best laptop ever", "This is long"));
        adapter.setProducts(products);
    }
}