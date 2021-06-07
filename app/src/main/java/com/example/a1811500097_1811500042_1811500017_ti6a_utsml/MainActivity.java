package com.example.a1811500097_1811500042_1811500017_ti6a_utsml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void search(View view){
        Intent i = new Intent(this, Search.class);
        startActivity(i);
    }

    public void prof(View view){
        Intent i = new Intent(this, Profile.class);
        startActivity(i);
    }

    public void home(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void notif(View view){
        Intent i = new Intent(this, Notifikasi.class);
        startActivity(i);
    }
}