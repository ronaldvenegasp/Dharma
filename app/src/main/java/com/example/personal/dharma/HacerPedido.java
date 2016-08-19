package com.example.personal.dharma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HacerPedido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hacer_pedido);

        //Al tocar sobre el botón de Ayuda, se pasa a la actividad Ayuda de la aplicación
        findViewById(R.id.boton_ayuda).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HacerPedido.this, Ayuda.class));
            }
        });
    }
}
