package com.example.personal.dharma;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MenuPrincipal extends AppCompatActivity {

    TextView tituloPantalla;
    TextView numeroMesa;
    TextView numeroMesa1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_menu_principal);

        //Establece el tipo de letra del título de la pantalla
        tituloPantalla = (TextView) findViewById(R.id.titulo);
        String font_path = "font/Humanst521_BT.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(), font_path);
        tituloPantalla.setTypeface(TF);

        //Establece el tipo de letra del mensaje de número de mesa
        numeroMesa = (TextView) findViewById(R.id.numero_mesa);
        String font_path1 = "font/Keira_Normal.ttf";
        Typeface TF1 = Typeface.createFromAsset(getAssets(), font_path1);
        numeroMesa.setTypeface(TF1);

        //Establece el tipo de letra del mensaje de número de mesa
        numeroMesa1 = (TextView) findViewById(R.id.numeroDeLaMesa);
        String font_path2 = "font/Keira_Normal.ttf";
        Typeface TF2 = Typeface.createFromAsset(getAssets(), font_path2);
        numeroMesa1.setTypeface(TF2);

        TextView numberTable = (TextView) findViewById(R.id.numeroDeLaMesa);

        //Recibir el número de la mesa
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if(extras != null){
            String datoMesa = (String) extras.get("mesa");
            numberTable.setText(datoMesa);
        }

        //Al tocar sobre el botón de Hacer pedido, se pasa a la actividad HacerPedido de la aplicación
        findViewById(R.id.pedir_plato).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuPrincipal.this, HacerPedido.class));
            }
        });

        //Al tocar sobre el botón de entretenimiento, se pasa a la actividad Entretenimiento de la aplicación
        findViewById(R.id.entretenimiento).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuPrincipal.this, Entretenimiento.class));
            }
        });

        //Al tocar sobre el botón de pagar, se pasa a la actividad Pagar de la aplicación
        findViewById(R.id.pagar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuPrincipal.this, Pagar.class));
            }
        });

        //Al tocar sobre el botón de pqrs, se pasa a la actividad Pqrs de la aplicación
        findViewById(R.id.pqrs).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuPrincipal.this, Pqrs.class));
            }
        });

        //Al tocar sobre el botón de Cambiar número de mesa, se pasa a la actividad NumeroMesa de la aplicación
        findViewById(R.id.boton_cambiar_mesa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuPrincipal.this, NumeroMesa.class));
            }
        });

        //Al tocar sobre el botón de Ayuda, se pasa a la actividad Ayuda de la aplicación
        findViewById(R.id.boton_ayuda).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuPrincipal.this, Ayuda.class));
            }
        });

    }
}
