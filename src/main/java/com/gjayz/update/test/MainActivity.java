package com.gjayz.update.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.gjayz.update.R;

public class MainActivity extends AppCompatActivity {

    String downPath = "http://localhost:8080/update/incremental/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}