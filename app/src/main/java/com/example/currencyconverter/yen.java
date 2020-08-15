package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class yen extends AppCompatActivity {
     private EditText e4;
     private TextView t4;
     private Button b20,b21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yen);

        e4=findViewById(R.id.editText4);
        t4=findViewById(R.id.textView6);
        b20=findViewById(R.id.button12);
        b21=findViewById(R.id.button13);

        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double yen=Double.parseDouble(e4.getText().toString());
                double rr=0.66;
                double answer=yen*rr;
                t4.setText(answer+"");
            }
        });

        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t4.setText("Rupees");
                e4.setText("");
            }
        });

    }
}
