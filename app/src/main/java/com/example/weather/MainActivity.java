package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.weather.util.CityTest;

import org.litepal.LitePal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        LitePal.getDatabase();
        CityTest.queryProvince();
    }
}