package com.example.personal.dharma;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class retos_ninos extends AppCompatActivity {

    TextView tituloPantalla;
    TextView culturaHindu;
    TextView retos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_retos_ninos);

        //Establece el tipo de letra del título de la pantalla
        tituloPantalla = (TextView) findViewById(R.id.titulo);
        String font_path = "font/Humanst521_BT.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(), font_path);
        tituloPantalla.setTypeface(TF);

        //Establece el tipo de letra de Cultura Hindú
        culturaHindu = (TextView) findViewById(R.id.escanear_text);
        String font_path1 = "font/Keira_Normal.ttf";
        Typeface TF1 = Typeface.createFromAsset(getAssets(), font_path1);
        culturaHindu.setTypeface(TF1);

        //Establece el tipo de letra de reto
        retos = (TextView) findViewById(R.id.reto_text);
        String font_path2 = "font/Keira_Normal.ttf";
        Typeface TF2 = Typeface.createFromAsset(getAssets(), font_path2);
        retos.setTypeface(TF2);

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
        findViewById(R.id.escanear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(retos_ninos.this, MenuPrincipal.class));
            }
        });

        //Al tocar sobre el botón de Reto, se pasa a la actividad menu_principal de la aplicación
        findViewById(R.id.formulario).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(retos_ninos.this, MenuPrincipal.class));
            }
        });
    }
}
