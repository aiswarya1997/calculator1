package com.example.administrator.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class mulactivity extends AppCompatActivity {
 EditText ed1,ed2;
    Button b1,b2;
    String s1,s2,s3;
    int num1,num2,num3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulactivity);
        ed1=(EditText)findViewById(R.id.n12);
        ed2=(EditText)findViewById(R.id.n23);
        b1=(Button)findViewById(R.id.mu);
        b2=(Button)findViewById(R.id.bk3);
         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 s1=ed1.getText().toString();
                 s2=ed2.getText().toString();
                 num1=Integer.parseInt(s1);
                 num2=Integer.parseInt(s2);
                 num3=num1*num2;
                 s3=String.valueOf(num3);
                 Toast.makeText(getApplicationContext(),s3,Toast.LENGTH_LONG).show();
             }
         });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}
