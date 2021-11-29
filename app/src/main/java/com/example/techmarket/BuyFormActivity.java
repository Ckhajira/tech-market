package com.example.techmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class BuyFormActivity extends AppCompatActivity {
private EditText editTxtName, editTxtAddress, editTxtPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_form);

        editTxtName =findViewById(R.id.editTxtName);
        editTxtAddress = findViewById(R.id.editTxtAddress);
        editTxtPhone = findViewById(R.id.editTxtPhone);
    }
}