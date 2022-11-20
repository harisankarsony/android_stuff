package com.example.optionsmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.id1:
                Toast.makeText(this,"New Group selected!",Toast.LENGTH_LONG).show();
                return true;
            case R.id.id2:
                Toast.makeText(this,"New Broadcast selected!",Toast.LENGTH_LONG).show();
                return true;
            case R.id.id3:
                Toast.makeText(this,"Linked Devices selected!",Toast.LENGTH_LONG).show();
                return true;
            case R.id.id4:
                Toast.makeText(this,"Logout selected!",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}