package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class euro extends AppCompatActivity {
    private EditText e1;
    private TextView t1;
    private Button b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_euro);

        e1=findViewById(R.id.editText2);
        t1=findViewById(R.id.textView4);
        b3=findViewById(R.id.button8);
        b4=findViewById(R.id.button9);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double euro=Double.parseDouble(e1.getText().toString());
                double r=78.45;
                double res=euro*r;
                t1.setText(res+"");

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("Rupees");
                e1.setText("");
            }
        });
    }
}
