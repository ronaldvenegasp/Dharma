package com.example.personal.dharma;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tituloPantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        tituloPantalla = (TextView) findViewById(R.id.titulo);

        String font_path = "font/Century725_Cn _BT.ttf";

        Typeface TF = Typeface.createFromAsset(getAssets(), font_path);

        tituloPantalla.setTypeface(TF);


    //Al tocar sobre el botón de Ayuda, se pasa a la actividad Ayuda de la aplicación
        findViewById(R.id.boton_ayuda).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Ayuda.class));
            }
        });

        //Al tocar sobre la pantalla, se pasa a la actividad Número de mesa de la aplicación
        findViewById(R.id.transicion).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NumeroMesa.class));
            }
        });
    }
}
