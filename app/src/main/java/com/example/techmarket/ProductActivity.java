package com.example.techmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductActivity extends AppCompatActivity {

    private TextView txtProductName, txtProductPrice, txtProductDescription;
    private Button btnBuyNow;
    private ImageView productImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        initViews();
    }

    private void initViews(){
        txtProductName = findViewById(R.id.txtProductName);
        txtProductPrice = findViewById(R.id.txtProductPrice);
        txtProductDescription = findViewById(R.id.txtProductDescription);

        btnBuyNow = findViewById(R.id.btnBuyNow);

        productImage = findViewById(R.id.imgProduct);
    }
}