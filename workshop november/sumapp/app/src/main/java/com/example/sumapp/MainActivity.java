package com.example.sumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bm,b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bm = (Button) findViewById(R.id.bminus);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b,s;
                EditText e1,e2,e3;
                e1 = (EditText) findViewById(R.id.t1);
                e2 = (EditText) findViewById(R.id.t2);
                e3 = (EditText) findViewById(R.id.t3);
                a = Integer.parseInt(e1.getText().toString());
                b = Integer.parseInt(e2.getText().toString());
                s = a - b;
                e3.setText(""+s);
            }
        });
    }
    public void onplus(View v) {
        int a,b,s;
        EditText e1,e2,e3;
        e1 = (EditText) findViewById(R.id.t1);
        e2 = (EditText) findViewById(R.id.t2);
        e3 = (EditText) findViewById(R.id.t3);
        a = Integer.parseInt(e1.getText().toString());
        b = Integer.parseInt(e2.getText().toString());
        s = a + b;
        e3.setText(""+s);
    }

    @Override
    public void onClick(View v) {
        EditText e1;
        e1 = (EditText) findViewById(R.id.t1);
        String str = e1.getText().toString();
        Button b = (Button)v;
        str = str + b.getText().toString();
        e1.setText(str);
    }
}