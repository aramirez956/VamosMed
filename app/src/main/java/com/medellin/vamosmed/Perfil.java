package com.medellin.vamosmed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Perfil extends AppCompatActivity {

    TextView sede, coorX, coorY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        Toolbar toolbar = findViewById(R.id.toolbarPerfil);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        Modelo modelo = (Modelo) getApplicationContext();
        sede = (TextView)findViewById(R.id.sede);
        coorX = (TextView)findViewById(R.id.coorX);
        coorY = (TextView)findViewById(R.id.coorY);
        sede.setText("Id sede "+modelo.getIdSedeDestino());
        coorX.setText("X: "+modelo.getX());
        coorY.setText("Y: "+modelo.getY());

    }

    public void onClickAtras(View view) {
        Intent perfil = new Intent(this, Bienvenida.class);
        startActivity(perfil);
        finish();
    }

    @Override
    public boolean onSupportNavigateUp() {
        Intent perfil = new Intent(this, Bienvenida.class);
        startActivity(perfil);
        finish();
        return true;
    }
}