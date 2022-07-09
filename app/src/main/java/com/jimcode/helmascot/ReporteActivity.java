package com.jimcode.helmascot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class ReporteActivity extends AppCompatActivity {

    TextInputEditText txinetEspecie, txinetRaza, txinetColor, txinetLugar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte);

        txinetEspecie = (TextInputEditText) findViewById(R.id.txinetEspecie);
        txinetRaza = (TextInputEditText) findViewById(R.id.txinetRaza);
        txinetColor = (TextInputEditText) findViewById(R.id.txinetColor);
        txinetLugar = (TextInputEditText) findViewById(R.id.txinetLugar);

    }

    public void reportar(View view){



        String especie, raza, color, lugar;
        especie = txinetEspecie.getText().toString();
        raza = txinetRaza.getText().toString();
        color = txinetColor.getText().toString();
        lugar = txinetLugar.getText().toString();

        if ("".equals(especie)){
            validarCampos("El campo especie es requerido", txinetEspecie);
        }

        else if ("".equals(raza)){
            validarCampos("El campo raza es requerido", txinetRaza);
        }

        else if ("".equals(color)){
            validarCampos("El campo color es requerido", txinetColor);
        }

        else if ("".equals(lugar)){
            validarCampos("El campo lugar es requerido", txinetLugar);
        }


        Intent intent = new Intent(this, ResultadoActivity.class);
        intent.putExtra("especies", especie);
        intent.putExtra("raza", raza);
        intent.putExtra("color", color);
        intent.putExtra("lugar", lugar);
        startActivity(intent);

    }

    public void regresar(View view){
        startActivity(new Intent(ReporteActivity.this, InicioActivity.class));
    }

    public void validarCampos(String mensaje, TextInputEditText elemento){
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
        elemento.requestFocus();
    }
}