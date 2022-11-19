package com.example.anywhatsapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button whatsappButton1;
    private EditText phoneNumber;
    private EditText message;
    private EditText countryCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        whatsappButton1 = (Button) findViewById(R.id.whatsappButton);
        phoneNumber = (EditText) findViewById(R.id.editTextPhone) ;
        countryCode = (EditText) findViewById(R.id.editTextNumbeCC) ;
        message = (EditText) findViewById(R.id.editTextMessage);
        whatsappButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isWhatsappInstalled()) {
                    if(phoneNumber.getText().toString().isEmpty() ) {
                        Toast.makeText(MainActivity.this,"Please enter a valid phone number",Toast.LENGTH_SHORT).show();

                        return;
                    }
                    String number = countryCode.getText().toString() + phoneNumber.getText().toString();
                    String stippedPhoneNumber = PhoneNumberUtils.stripSeparators(number);
                    String jid = stippedPhoneNumber + "@s.whatsapp.net";
                    Log.e("ME", "Number: "+number + " stippedPhoneNumber: "+stippedPhoneNumber + " jid: "+ jid);
                    Intent sendIntent = new Intent();
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.putExtra("jid", jid);//phone number without "+" prefix
                    sendIntent.putExtra(Intent.EXTRA_TEXT, message.getText().toString() );
                    sendIntent.setType("text/plain");
                    sendIntent.setPackage("com.whatsapp");
                    startActivity(sendIntent);



                    Uri uri = Uri.parse("https://api.whatsapp.com/send?phone=" + "8281006132" + "&text=" + "Hello WhatsApp!!");
                    Intent sendIntent1 = new Intent(Intent.ACTION_VIEW, uri);
                    //startActivity(sendIntent1);

                }
            }
        });
    }

    boolean isWhatsappInstalled() {
        PackageManager pkgMgr = getPackageManager();
        boolean installed = false;
        try {
            Log.e("ME", "isWhatsappInstalled");
            PackageInfo packageInfo = pkgMgr.getPackageInfo("com.whatsapp", PackageManager.GET_ACTIVITIES);
            installed = true;

        } catch(PackageManager.NameNotFoundException e) {
            Log.v("ME" ," response " +  e.getMessage());
            Toast.makeText(this,"whatsapp not installed", Toast.LENGTH_SHORT).show();
        }
        return installed;

    }
}