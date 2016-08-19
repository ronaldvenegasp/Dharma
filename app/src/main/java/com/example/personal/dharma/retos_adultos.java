package com.example.personal.dharma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class retos_adultos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retos_adultos);

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
