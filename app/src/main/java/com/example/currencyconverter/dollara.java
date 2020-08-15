package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class dollara extends AppCompatActivity {
    private EditText e;
    private TextView t;
    private Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dollara);

        e=findViewById(R.id.editText);
        t=findViewById(R.id.textView3);
        b1=findViewById(R.id.button6);
        b2=findViewById(R.id.button7);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double dollar=Double.parseDouble(e.getText().toString());
                double rs=71.645;
                double result=dollar*rs;
                t.setText(result+"");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setText("Rupees");
                e.setText("");
            }
        });

    }
}
