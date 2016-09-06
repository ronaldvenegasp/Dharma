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
    TextView sopaDeLetras;
    TextView culturaHinduText;
    TextView adivinanzas;

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

        //Establece el tipo de letra de Sopa de Letras
        sopaDeLetras = (TextView) findViewById(R.id.sopa_de_letras_text);
        String font_path1 = "font/Keira_Normal.ttf";
        Typeface TF1 = Typeface.createFromAsset(getAssets(), font_path1);
        sopaDeLetras.setTypeface(TF1);

        //Establece el tipo de letra de Cultura Hindú
        culturaHinduText = (TextView) findViewById(R.id.escanear_text);
        String font_path2 = "font/Keira_Normal.ttf";
        Typeface TF2 = Typeface.createFromAsset(getAssets(), font_path2);
        culturaHinduText.setTypeface(TF2);

        //Establece el tipo de letra de Adivinanzas
        adivinanzas = (TextView) findViewById(R.id.adivinanza_text);
        String font_path3 = "font/Keira_Normal.ttf";
        Typeface TF3 = Typeface.createFromAsset(getAssets(), font_path3);
        adivinanzas.setTypeface(TF3);

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
        findViewById(R.id.escanear).setOnClickListener(new View.OnClickListener() {
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
