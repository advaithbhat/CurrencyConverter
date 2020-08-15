package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pound extends AppCompatActivity {
    private EditText e2;
    private TextView t2;
    private Button b10,b11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pound);

        e2=findViewById(R.id.editText3);
        t2=findViewById(R.id.textView5);
        b10=findViewById(R.id.button10);
        b11=findViewById(R.id.button11);

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double pound=Double.parseDouble(e2.getText().toString());
                double rup=88.83;
                double ans=pound*rup;
                t2.setText(ans+"");
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText("Rupees");
                e2.setText("");
            }
        });
    }
}
