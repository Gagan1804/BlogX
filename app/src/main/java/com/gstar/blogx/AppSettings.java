package com.gstar.blogx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AppSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_settings);
    }

    public void onBackPressed() {

        Intent i = new Intent(AppSettings.this, MainActivity.class);
        startActivity(i);
        finish();
    }

}
