package com.example.personal.dharma;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_menu_principal);

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
