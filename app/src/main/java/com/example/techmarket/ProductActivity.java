package com.example.techmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ProductActivity extends AppCompatActivity {

    private TextView txtProductName, txtProductPrice, txtProductDescription;
    private Button btnBuyNow;
    private ImageView productImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        initViews();

        Product product = new Product(1, "Mac", 200, "https://cdn.pixabay.com/photo/2014/09/24/14/29/macbook-459196__340.jpg"
                ,"Best laptop ever", "This is long");
        setData(product);
    }
    private void setData(Product product){
        txtProductName.setText(product.getName());
        txtProductPrice.setText(String.valueOf(product.getPrice()));
        txtProductDescription.setText(product.getLongDesc());
        Glide.with(this)
                .asBitmap().load(product.getImageUrl())
                .into(productImage);
    }

    private void initViews(){
        txtProductName = findViewById(R.id.txtProductName);
        txtProductPrice = findViewById(R.id.txtProductPrice);
        txtProductDescription = findViewById(R.id.txtProductDescription);

        btnBuyNow = findViewById(R.id.btnBuyNow);

        productImage = findViewById(R.id.imgProduct);
    }
}