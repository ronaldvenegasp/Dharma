package com.example.personal.dharma;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class retos_adultos extends AppCompatActivity {

    TextView tituloPantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_retos_adultos);

        //Establece el tipo de letra del título de la pantalla
        tituloPantalla = (TextView) findViewById(R.id.titulo);
        String font_path = "font/Humanst521_BT.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(), font_path);
        tituloPantalla.setTypeface(TF);

        //Al tocar sobre el botón de Ayuda, se pasa a la actividad Ayuda de la aplicación
        findViewById(R.id.boton_ayuda).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(retos_adultos.this, Ayuda.class));
            }
        });

        //Al tocar sobre el botón de Menú Principal, se pasa a la actividad menu_principal de la aplicación
        findViewById(R.id.menu_principal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(retos_adultos.this, MenuPrincipal.class));
            }
        });

        //Al tocar sobre el botón de Sopa de letras, se pasa a la actividad menu_principal de la aplicación
        findViewById(R.id.sopa_letras).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(retos_adultos.this, MenuPrincipal.class));
            }
        });

        //Al tocar sobre el botón de Cultura Hindú, se pasa a la actividad menu_principal de la aplicación
        findViewById(R.id.cultura_hindu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(retos_adultos.this, MenuPrincipal.class));
            }
        });

        //Al tocar sobre el botón de Adivinanzas, se pasa a la actividad menu_principal de la aplicación
        findViewById(R.id.adivinanzas).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(retos_adultos.this, MenuPrincipal.class));
            }
        });
    }
}
