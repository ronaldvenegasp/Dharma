package com.example.personal.dharma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        TextView numberTable = (TextView) findViewById(R.id.numeroDeLaMesa);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if(extras != null){
            String datoMesa = (String) extras.get("mesa");

            numberTable.setText(datoMesa);
        }

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
