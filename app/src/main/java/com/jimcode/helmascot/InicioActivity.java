package com.jimcode.helmascot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InicioActivity extends AppCompatActivity {

    Button btnBuscarMascota, btnReportarMascota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        btnBuscarMascota = (Button) findViewById(R.id.btnBuscarMascota);
        btnReportarMascota = (Button) findViewById(R.id.btnReportarMascota);

        btnBuscarMascota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InicioActivity.this, MainActivity.class));
            }
        });

        btnReportarMascota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InicioActivity.this, ReporteActivity.class));
            }
        });
    }
}