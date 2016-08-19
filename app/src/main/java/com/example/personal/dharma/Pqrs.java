package com.example.personal.dharma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pqrs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pqrs);

        //Al tocar sobre el botón de Ayuda, se pasa a la actividad Ayuda de la aplicación
        findViewById(R.id.boton_ayuda).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pqrs.this, Ayuda.class));
            }
        });
    }
}
