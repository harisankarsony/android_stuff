package com.example.callapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onCall(View v){
        Intent in = new Intent(Intent.ACTION_CALL, Uri.parse("tel:8281006132"));
        try {
            startActivity(in);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}