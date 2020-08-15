package com.example.currencyconverter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   private Button c1,c2,c3,c4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1=findViewById(R.id.button);
        c2=findViewById(R.id.button3);
        c3=findViewById(R.id.button4);
        c4=findViewById(R.id.button5);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(MainActivity.this,dollara.class);
                startActivity(a);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b=new Intent(MainActivity.this,euro.class);
                startActivity(b);
            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c=new Intent(MainActivity.this,pound.class);
                startActivity(c);
           }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d=new Intent(MainActivity.this,yen.class);
                startActivity(d);
            }
        });

   }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
          int itemid=item.getItemId();
          switch(itemid)
          {
              case R.id.refresh:
                  Toast.makeText(this,"Page refreshed",Toast.LENGTH_SHORT).show();
                  finish();
                  startActivity(getIntent());
                  return true;

              case R.id.info:
                  startActivity(new Intent(MainActivity.this,Main2Activity.class));
                  finish();
                  return true;

          }
        return super.onOptionsItemSelected(item);
    }
}
