package com.medellin.vamosmed;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class Bienvenida extends AppCompatActivity{

    TextView saludo ;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        Toolbar toolbar = findViewById(R.id.toolbarBienvenida);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        Modelo modelo = (Modelo) getApplicationContext();

        saludo = (TextView)findViewById(R.id.saludo);
        imageView = findViewById(R.id.imageView4);
        Bundle bundle = this.getIntent().getExtras();
        if(bundle!=null){
            String nombre = bundle.getString("nombre");
            saludo.setText(""+nombre);
            Picasso.get()
                    .load("https://www.jumpstarttech.com/files/2018/08/Network-Profile.png")
                    // .resize(50,50)
                    .placeholder(R.drawable.ic_perfil)
                    .error(R.drawable.ic_perfil)
                    .into(imageView);
            modelo.setFotoPerfil("https://www.jumpstarttech.com/files/2018/08/Network-Profile.png");
        }else{
            saludo.setText(modelo.getNombre());
            Picasso.get()
                    .load(modelo.getFotoPerfil())
                    // .resize(50,50)
                    .placeholder(R.drawable.ic_perfil)
                    .error(R.drawable.ic_perfil)
                    .into(imageView);
        }

    }

    public void onClickSalir(View view) {
        cerrarAplicacion();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            cerrarAplicacion();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void cerrarAplicacion() {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.logo_vamosmed)
                .setTitle("¿Desea cerrar la sesión?")
                .setCancelable(false)
                .setNegativeButton(android.R.string.cancel, null)
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {// un listener que al pulsar, cierre la aplicacion
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //android.os.Process.killProcess(android.os.Process.myPid()); //Su funcion es algo similar a lo que se llama cuando se presiona el botón "Forzar Detención" o "Administrar aplicaciones", lo cuál mata la aplicación
                        SharedPreferences sesion = getSharedPreferences("credencial", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editar = sesion.edit();
                        editar.putString("user","Sin info...");
                        editar.putString("pass", "Sin info...");
                        editar.apply();
                        //Abrimos la Activity Main
                        Intent salida = new Intent(Bienvenida.this, MainActivity.class);
                        startActivity(salida);
                        Toast.makeText(getApplicationContext(),"La sesion ha terminado",Toast.LENGTH_SHORT).show();
                        //Matamos la Activity de Bienvenida
                        finish();
                    }
                }).show();
    }

    public void onClickViajeBici(View view) {
        Modelo modelo = (Modelo) getApplicationContext();
        Intent viajar = new Intent(Bienvenida.this, ViajeBici.class);
        startActivity(viajar);
        modelo.setIdMedio("1");
        //Toast.makeText(getApplicationContext(),"Iniciando el contenido",Toast.LENGTH_SHORT).show();
        //Matamos la Activity de Bienvenida
        finish();
    }

    public void onClickMiPerfil(View view) {
        Intent perfil = new Intent(Bienvenida.this, Perfil.class);
        startActivity(perfil);
        Toast.makeText(getApplicationContext(),"Mi Perfil",Toast.LENGTH_SHORT).show();
    }


}