package com.jimcode.helmascot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ResultadoActivity extends AppCompatActivity {

    Button btnRetornar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        btnRetornar = (Button) findViewById(R.id.btnRegresarExitoso);

        String especie = getIntent().getStringExtra("especie");
        String raza = getIntent().getStringExtra("raza");
        String color = getIntent().getStringExtra("color");
        String lugar = getIntent().getStringExtra("lugar");

        String resultado = "Especie: " + especie + "\n"
                + "Raza : " + raza + "\n"
                + "Color : " + color + "\n"
                + "Ubicación : " + lugar;

        Toast.makeText(this, resultado, Toast.LENGTH_LONG).show();
    }

    public void volverAtras(View view){
        startActivity(new Intent(ResultadoActivity.this, InicioActivity.class));
    }
}