package com.example.personal.dharma;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class PagoCredito extends AppCompatActivity {

    TextView tituloPantalla;
    TextView registrar;
    TextView escanear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago_credito);

        //Establece el tipo de letra del título de la pantalla
        tituloPantalla = (TextView) findViewById(R.id.titulo);
        String font_path = "font/Humanst521_BT.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(), font_path);
        tituloPantalla.setTypeface(TF);

        //Establece el tipo de letra de Registrar Tarjeta
        registrar = (TextView) findViewById(R.id.registrar_text);
        String font_path1 = "font/Keira_Normal.ttf";
        Typeface TF1 = Typeface.createFromAsset(getAssets(), font_path1);
        registrar.setTypeface(TF1);

        //Establece el tipo de letra de Escanear Tarjeta
        escanear = (TextView) findViewById(R.id.escanear_text);
        String font_path2 = "font/Keira_Normal.ttf";
        Typeface TF2 = Typeface.createFromAsset(getAssets(), font_path2);
        escanear.setTypeface(TF2);

        //Al tocar sobre el botón de Ayuda, se pasa a la actividad Ayuda de la aplicación
        findViewById(R.id.boton_ayuda).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PagoCredito.this, Ayuda.class));
            }
        });

        //Al tocar sobre el botón de Menú Principal, se pasa a la actividad menu_principal de la aplicación
        findViewById(R.id.menu_principal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PagoCredito.this, MenuPrincipal.class));
            }
        });

        //Al tocar sobre el botón de Formulario, se pasa a la actividad formulario tarjeta crédito de la aplicación
        findViewById(R.id.formulario).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PagoCredito.this, formulario_tarjeta_credito.class));
            }
        });
    }
}
