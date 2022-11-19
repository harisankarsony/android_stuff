package com.example.addnos3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    int  first,second,result;
    TextView number_1,number_2;
    EditText   answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number_1=findViewById(R.id.textView4);
        number_2=findViewById(R.id.textView5);
        answer=findViewById(R.id.editTextTextPersonName3);
        final Random myRandom = new Random();
        number_1.setText(String.valueOf(myRandom.nextInt(100)));
        number_2.setText(String.valueOf(myRandom.nextInt(100)));
        first=Integer.parseInt(number_1.getText().toString());
        second=Integer.parseInt(number_2.getText().toString());




        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(TextUtils.isEmpty(answer.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Empty Box",Toast.LENGTH_LONG).show();

                }else {


                    result= Integer.parseInt(answer.getText().toString());

                    if ((first+second)==result){
                        Toast.makeText(getApplicationContext(),"YOU WON...",Toast.LENGTH_LONG).show();

                    }else {
                        Toast.makeText(getApplicationContext(),"YOU LOST...",Toast.LENGTH_LONG).show();

                    }


                }


            }
        });







    }
}

