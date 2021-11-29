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
        products.add(new Product(1, "Lenovo Thinkpad 3945", 20000, "https://cdn.pixabay.com/photo/2014/09/24/14/29/macbook-459196__340.jpg"
                ,"Best laptop ever", "This everyday laptop is powered by an Intel Celeron N4020 processor, 4GB DDR4 RAM, and 64 GB M.2 PCIe SSD storage. Enjoy videos or browse online on a 14\" HD display panel, framed by narrow bezels Dolby Audio delivers crystal-clear sound through the built-in dual stereo speakers"));
        products.add(new Product(2, "Samsung Galaxy A99", 15270, "https://cdn.pixabay.com/photo/2016/12/19/08/39/mobile-phone-1917737__340.jpg"
                ,"Best laptop ever", "Flex Your Best Angle: With Flex Mode, just unfold your mobile phone’s screen to your best angle for hands-free pics and video calls; Choose what you want to capture, set it down, stand back and shoot your best shot"));
        products.add(new Product(3, "Sony Wireless Headphones", 10000, "https://cdn.pixabay.com/photo/2018/09/17/14/27/headphones-3683983__340.jpg"
                ,"Best laptop ever", "Industry-leading noise canceling with Dual Noise Sensor technology. Next-level music with Edge-AI, co-developed with Sony Music Studios Tokyo Up to 30-hour battery life with quick charging (10 min charge for 5 hours of playback)"));
        products.add(new Product(4, "Redragon Bluetooth Keyboard ", 3000, "https://cdn.pixabay.com/photo/2014/04/03/11/07/keyboard-311803__340.png"
                ,"Best laptop ever", "87 Key Mechanical Gaming Keyboard with Custom Switches (Cherry Blue equivalent) for longevity with greater durability and responsiveness offering clicky medium resistance audible loud click sound crisp precise tactile feedback for typing and gaming"));


        adapter.setProducts(products);
    }
    public static ArrayList<Product> getAll(){
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Lenovo Thinkpad 3945", 20000, "https://cdn.pixabay.com/photo/2014/09/24/14/29/macbook-459196__340.jpg"
                ,"Best laptop ever", "This everyday laptop is powered by an Intel Celeron N4020 processor, 4GB DDR4 RAM, and 64 GB M.2 PCIe SSD storage. Enjoy videos or browse online on a 14\" HD display panel, framed by narrow bezels Dolby Audio delivers crystal-clear sound through the built-in dual stereo speakers"));
        products.add(new Product(2, "Samsung Galaxy A99", 15270, "https://cdn.pixabay.com/photo/2016/12/19/08/39/mobile-phone-1917737__340.jpg"
                ,"Best laptop ever", "Flex Your Best Angle: With Flex Mode, just unfold your mobile phone’s screen to your best angle for hands-free pics and video calls; Choose what you want to capture, set it down, stand back and shoot your best shot"));
        products.add(new Product(3, "Sony Wireless Headphones", 10000, "https://cdn.pixabay.com/photo/2018/09/17/14/27/headphones-3683983__340.jpg"
                ,"Best laptop ever", "Industry-leading noise canceling with Dual Noise Sensor technology. Next-level music with Edge-AI, co-developed with Sony Music Studios Tokyo Up to 30-hour battery life with quick charging (10 min charge for 5 hours of playback)"));
        products.add(new Product(4, "Redragon Bluetooth Keyboard ", 3000, "https://cdn.pixabay.com/photo/2014/04/03/11/07/keyboard-311803__340.png"
                ,"Best laptop ever", "87 Key Mechanical Gaming Keyboard with Custom Switches (Cherry Blue equivalent) for longevity with greater durability and responsiveness offering clicky medium resistance audible loud click sound crisp precise tactile feedback for typing and gaming"));

        return products;
    }
}