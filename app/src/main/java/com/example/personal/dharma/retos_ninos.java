package com.example.personal.dharma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class retos_ninos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_retos_ninos);

        //Al tocar sobre el botón de Ayuda, se pasa a la actividad Ayuda de la aplicación
        findViewById(R.id.boton_ayuda).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(retos_ninos.this, Ayuda.class));
            }
        });

        //Al tocar sobre el botón de Menú Principal, se pasa a la actividad menu_principal de la aplicación
        findViewById(R.id.menu_principal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(retos_ninos.this, MenuPrincipal.class));
            }
        });

        //Al tocar sobre el botón de Cultura Hindú, se pasa a la actividad menu_principal de la aplicación
        findViewById(R.id.cultura_hindu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(retos_ninos.this, MenuPrincipal.class));
            }
        });

        //Al tocar sobre el botón de Reto, se pasa a la actividad menu_principal de la aplicación
        findViewById(R.id.reto).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(retos_ninos.this, MenuPrincipal.class));
            }
        });
    }
}
