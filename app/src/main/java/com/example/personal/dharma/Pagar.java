package com.example.personal.dharma;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class Pagar extends AppCompatActivity {

    TextView tituloPantalla;
    TextView textoCredito;
    TextView textoEfectivo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_pagar);

        //Establece el tipo de letra del título de la pantalla
        tituloPantalla = (TextView) findViewById(R.id.titulo);
        String font_path = "font/Humanst521_BT.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(), font_path);
        tituloPantalla.setTypeface(TF);

        //Establece el tipo de letra del campo crédito
        textoCredito = (TextView) findViewById(R.id.credito);
        String font_path2 = "font/Keira_Normal.ttf";
        Typeface TF2 = Typeface.createFromAsset(getAssets(), font_path2);
        textoCredito.setTypeface(TF2);

        //Establece el tipo de letra del campo efectivo
        textoEfectivo = (TextView) findViewById(R.id.mejoras);
        String font_path3 = "font/Keira_Normal.ttf";
        Typeface TF3 = Typeface.createFromAsset(getAssets(), font_path3);
        textoEfectivo.setTypeface(TF3);

        //Al tocar sobre el botón de Ayuda, se pasa a la actividad Ayuda de la aplicación
        findViewById(R.id.boton_ayuda).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pagar.this, Ayuda.class));
            }
        });

        //Al tocar sobre el botón de Menú Principal, se pasa a la actividad menu_principal de la aplicación
        findViewById(R.id.menu_principal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pagar.this, MenuPrincipal.class));
            }
        });
    }
}
