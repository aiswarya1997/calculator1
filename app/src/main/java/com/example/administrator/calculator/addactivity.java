package com.example.administrator.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class addactivity extends AppCompatActivity {
 EditText ed1,ed2,ed3;
    Button b1,b2;
    int num1,num2,num3,num4;
    String s1,s2,s3,s4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addactivity);
        ed1=(EditText)findViewById(R.id.n1);
        ed2=(EditText)findViewById(R.id.n2);
        ed3=(EditText)findViewById(R.id.n3);
        b1=(Button)findViewById(R.id.ad);
        b2=(Button)findViewById(R.id.bk);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=ed1.getText().toString();
                s2=ed2.getText().toString();
                s3=ed3.getText().toString();
                num1=Integer.parseInt(s1);
                num2=Integer.parseInt(s2);
                num3=Integer.parseInt(s3);
                num4=num1+num2+num3;
                s4=String.valueOf(num4);
                Toast.makeText(getApplicationContext(),s4,Toast.LENGTH_LONG).show();
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
