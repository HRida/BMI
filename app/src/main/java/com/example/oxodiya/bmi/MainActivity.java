package com.example.oxodiya.bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText H;
    EditText W;
    Button btnMetric;

    double myHeight;
    double myWeight;
    double bmi = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        H = findViewById(R.id.height);
        W = findViewById(R.id.weight);
        btnMetric = findViewById(R.id.btnCalculate);

        btnMetric.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });
    }


    public void calculateBMI() {
        String message;
        myHeight = Double.parseDouble(H.getText().toString());
        myWeight = Double.parseDouble(W.getText().toString());
        bmi = myWeight / (myHeight * myHeight);

        if (bmi < 18.5) {
            message = "Under Weight";
        } else if (bmi >= 18.5 && bmi <= 29.9) {
            message = "Normal Weight";
        } else if (bmi >= 25 && bmi <= 29.9) {
            message = "Over Weight";
        } else {
            message = "obese";
        }
        String StringBMI = Double.toString(bmi); //convert double bmi to string

        Intent i = new Intent(this, Result.class);
        i.putExtra("B", StringBMI);
        i.putExtra("M", message);

        startActivity(i);


    }
}