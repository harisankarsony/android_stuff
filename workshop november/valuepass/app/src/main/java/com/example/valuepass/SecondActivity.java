package com.example.valuepass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle bObj = getIntent().getExtras();
        String a = bObj.getString("val");
        String b = bObj.getString("val2");
        EditText e2 = (EditText) findViewById(R.id.et1);
        e2.setText(a+b);
    }
    public void onHide(View v) {
        finish();
    }
}