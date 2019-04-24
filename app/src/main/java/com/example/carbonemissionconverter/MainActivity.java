package com.example.carbonemissionconverter;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    public static int Global_Color = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (Global_Color == 0)
        {
            LinearLayout ll_MainPage = findViewById(R.id.main_menu_layout);
            ll_MainPage.setBackgroundColor(Color.WHITE);
        }
        if (Global_Color == 1)
        {
            LinearLayout ll_MainPage = findViewById(R.id.main_menu_layout);
            ll_MainPage.setBackgroundColor( getResources().getColor(R.color.lightPurple));
        }
        if (Global_Color == 2)
        {
            LinearLayout ll_MainPage = findViewById(R.id.main_menu_layout);
            ll_MainPage.setBackgroundColor( getResources().getColor(R.color.lightBlue));
        }
        if (Global_Color == 3)
        {
            LinearLayout ll_MainPage = findViewById(R.id.main_menu_layout);
            ll_MainPage.setBackgroundColor( getResources().getColor(R.color.lightSeaGreen));
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.action_settings:
                startActivity(new Intent(this,SettingActivity.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    void convertKmtoC02()
    {  EditText km= findViewById(R.id.km);
        km.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText  co2= findViewById(R.id.co2);
        co2.setInputType(InputType.TYPE_CLASS_NUMBER);

        float a=Float.parseFloat(km.getText().toString());
        float result=a*186;
        co2.setText(String.valueOf(result));

    }
    public void click(View view)
    {
        convertKmtoC02();
        Button b1= findViewById(R.id.km_co2Converter);
        b1.setEnabled(false);
    }
    void convertCO2tokm()
    {  EditText km= findViewById(R.id.km);
        km.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText  co2= findViewById(R.id.co2);
        co2.setInputType(InputType.TYPE_CLASS_NUMBER);

        float a=Float.parseFloat(co2.getText().toString());
        float result=a/186;
        km.setText(String.valueOf(result));

    }
    public void click2(View view)
    {
        convertCO2tokm();
        Button b2= findViewById(R.id.co2_kmConverter);
        b2.setEnabled(false);
    }
    public void reset(View view)
    {
        Button b1= findViewById(R.id.km_co2Converter);
        b1.setEnabled(true);
        Button b2= findViewById(R.id.co2_kmConverter);
        b2.setEnabled(true);
        EditText km=  findViewById(R.id.km);
        EditText co2= findViewById(R.id.co2);
        km.setText("");
        co2.setText("");

    }





}
