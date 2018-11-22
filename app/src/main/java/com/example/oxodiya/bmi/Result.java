package com.example.oxodiya.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent i = getIntent();

        String Result = i.getStringExtra("M");
        String bmi = i.getStringExtra("B");

        TextView txtResult = findViewById(R.id.txtResult);
        txtResult.setTextSize(40);
        txtResult.setText(Result);


        TextView txtBmi = findViewById(R.id.txtBmi);
        txtBmi.setTextSize(40);
        txtBmi.setText(bmi);

    }
}
