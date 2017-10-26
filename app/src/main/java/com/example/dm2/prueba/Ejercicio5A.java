package com.example.dm2.prueba;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Ejercicio5A extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio5_a);
    }


    public void enviar(View v){
        Intent Ejer5B = new Intent(Ejercicio5A.this, Ejercicio5B.class);
        Ejer5B.putExtra("codigo", ((EditText)findViewById(R.id.txtCodigo)).getText().toString());
        startActivity(Ejer5B);
    }
}
