package com.example.valuepass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onNext(View v) {
        Intent iObj;
        EditText e1,e2;
        e1 = (EditText) findViewById(R.id.et1);
        e2 = (EditText) findViewById(R.id.et2);
        iObj = new Intent("act2");
        iObj.putExtra("val", e1.getText().toString());
        iObj.putExtra("val2", e2.getText().toString());
        startActivity(iObj);
    }
}