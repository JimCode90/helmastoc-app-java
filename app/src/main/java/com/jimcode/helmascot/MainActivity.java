package com.jimcode.helmascot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.jimcode.helmascot.Adaptador.Mascota;
import com.jimcode.helmascot.Adaptador.MascotaAdaptador;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas = new ArrayList<>();
    Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRegresar = (Button) findViewById(R.id.btnRegresarInicio2);

        mascotas.add(new Mascota("gringa", R.drawable.perro1, "perro", "Gato encontrado deambulando en la Av. Alfonso Ugarte en estado de desnutrición", "13/07/20"));
        mascotas.add(new Mascota("gringa", R.drawable.perro2, "perro", "Gato encontrado deambulando en la Av. Alfonso Ugarte en estado de desnutrición", "13/07/20"));
        mascotas.add(new Mascota("gringa", R.drawable.perro3, "perro", "Gato encontrado deambulando en la Av. Alfonso Ugarte en estado de desnutrición", "13/07/20"));
        mascotas.add(new Mascota("gringa", R.drawable.perro4, "perro", "Gato encontrado deambulando en la Av. Alfonso Ugarte en estado de desnutrición", "13/07/20"));
        mascotas.add(new Mascota("gringa", R.drawable.perro5, "perro", "Gato encontrado deambulando en la Av. Alfonso Ugarte en estado de desnutrición", "13/07/20"));
        mascotas.add(new Mascota("gringa", R.drawable.perro6, "perro", "Gato encontrado deambulando en la Av. Alfonso Ugarte en estado de desnutrición", "13/07/20"));
        mascotas.add(new Mascota("gringa", R.drawable.perro7, "perro", "Gato encontrado deambulando en la Av. Alfonso Ugarte en estado de desnutrición", "13/07/20"));

        RecyclerView rvMascota = findViewById(R.id.rvMascota);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvMascota.setLayoutManager(layoutManager);

        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        rvMascota.setAdapter(adaptador);


        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, InicioActivity.class));
            }
        });

    }
}