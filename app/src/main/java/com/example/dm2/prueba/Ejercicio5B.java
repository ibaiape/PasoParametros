package com.example.dm2.prueba;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Ejercicio5B extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio5_b);
        Bundle extras = getIntent().getExtras();
        RelativeLayout rl = (RelativeLayout)findViewById(R.id.layout5b);
        rl.setBackgroundColor(Color.parseColor("#"+extras.getString("codigo")));
    }

    public void volver(View v){
        finish();
    }
}
