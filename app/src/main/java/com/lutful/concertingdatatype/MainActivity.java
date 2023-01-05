package com.lutful.concertingdatatype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edBuy, edSell;
    Button buttonCalculate;
    TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edSell = findViewById(R.id.edSell);
        edBuy = findViewById(R.id.edBuy);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        tvDisplay = findViewById(R.id.tvDisplay);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               Float byPrice, sellPrice, profit, profitPercent;

                String edSell = MainActivity.this.edSell.getText().toString();
                String buyEd = edBuy.getText().toString();

                byPrice = Float.parseFloat(buyEd);
               sellPrice = Float.parseFloat(edSell);

               profit = byPrice - sellPrice;

               profitPercent = profit /byPrice*100;

                tvDisplay.setText("\nYour profit is ="+profit+"\nYour profit % persent ==> "+profitPercent);



            }
        });




    }
}