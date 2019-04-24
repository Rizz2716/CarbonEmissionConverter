package com.example.carbonemissionconverter;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class SettingActivity extends AppCompatActivity {

    public static int Global_Color = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (Global_Color == 0)
        {
            LinearLayout ll_MainPage = findViewById(R.id.settings_main_layout);
            ll_MainPage.setBackgroundColor(Color.WHITE);
        }
        if (Global_Color == 1)
        {
            LinearLayout ll_MainPage = findViewById(R.id.settings_main_layout);
            ll_MainPage.setBackgroundColor( getResources().getColor(R.color.lightPurple));
        }
        if (Global_Color == 2)
        {
            LinearLayout ll_MainPage = findViewById(R.id.settings_main_layout);
            ll_MainPage.setBackgroundColor( getResources().getColor(R.color.lightBlue));
        }
        if (Global_Color == 3)
        {
            LinearLayout ll_MainPage = findViewById(R.id.settings_main_layout);
            ll_MainPage.setBackgroundColor( getResources().getColor(R.color.lightSeaGreen));
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_setting, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.settings:
                startActivity(new Intent(this,MainActivity.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void whitecolor(View view) {
        MainActivity.Global_Color = 0;
        startActivity(new Intent(SettingActivity.this, MainActivity.class));
        finish();
    }
    public void lightPurple(View view) {
        MainActivity.Global_Color = 1;
        startActivity(new Intent(SettingActivity.this, MainActivity.class));
        finish();
    }
    public void lightblue(View view) {
        MainActivity.Global_Color = 2;
        startActivity(new Intent(SettingActivity.this, MainActivity.class));
        finish();
    }

    public void lightSeaGreen(View view) {
        MainActivity.Global_Color = 3;
        startActivity(new Intent(SettingActivity.this, MainActivity.class));
        finish();
    }


}
