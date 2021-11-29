package com.example.techmarket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BuyFormActivity extends AppCompatActivity {
private EditText editTxtName, editTxtAddress, editTxtPhone;
private Button btnBuyFormSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_form);

        editTxtName =findViewById(R.id.editTxtName);
        editTxtAddress = findViewById(R.id.editTxtAddress);
        editTxtPhone = findViewById(R.id.editTxtPhone);
        btnBuyFormSubmit = findViewById(R.id.btnBuyFormSubmit);

        btnBuyFormSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String formName = editTxtName.getText().toString();
                String formAddress = editTxtAddress.getText().toString();
                String formPhone = editTxtPhone.getText().toString();
                Intent intent = new Intent(BuyFormActivity.this, SuccessActivity.class);
            intent.putExtra("formName", formName);
            intent.putExtra("formAddress", formAddress);
            intent.putExtra("formPhone", formPhone);
                startActivity(intent);
                Toast.makeText(BuyFormActivity.this, "Successfully Submitted", Toast.LENGTH_LONG).show();}
        });
    }
}