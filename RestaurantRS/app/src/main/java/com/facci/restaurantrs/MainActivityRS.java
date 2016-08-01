package com.facci.restaurantrs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityRS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_rs);
    }

    public void click1(View v){
        Toast.makeText(MainActivityRS.this,"Caldo de pescado",Toast.LENGTH_SHORT).show();

    }

    public void click2(View v){
        Toast.makeText(MainActivityRS.this,"Bandejas de mariscos",Toast.LENGTH_SHORT).show();
    }

    public void click3(View v){
        Toast.makeText(MainActivityRS.this,"Viche de camaron",Toast.LENGTH_SHORT).show();
    }

    public void click4(View v){
        Toast.makeText(MainActivityRS.this,"Viche de pescado",Toast.LENGTH_SHORT).show();
    }

    public void click5(View v){
        Toast.makeText(MainActivityRS.this,"Tonga",Toast.LENGTH_SHORT).show();
    }

    public void click6(View v){
        Toast.makeText(MainActivityRS.this,"Pescado apanado",Toast.LENGTH_SHORT).show();
    }

    public void click7(View v){
        Toast.makeText(MainActivityRS.this,"Ceviche",Toast.LENGTH_SHORT).show();
    }
}
