package com.example.personal.dharma;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class Pqrs extends AppCompatActivity {

    TextView tituloPantalla;
    String mensaje = "vacio";
    ImageView estrella1;
    ImageView estrella2;
    ImageView estrella3;
    ImageView estrella4;
    ImageView estrella5;
    ImageView pesos;
    ImageView espera;
    ImageView celular;

    public void cambioEstrella1(View view){
        if(mensaje == "vacio"){
            estrella1.setImageResource(R.drawable.estrella);
            mensaje = "lleno";
        }
        else if(mensaje == "lleno"){
            estrella1.setImageResource(R.drawable.estrellavacia);
            mensaje = "vacio";
        }
    }

    public void cambioEstrella2(View view) {
        if(mensaje == "vacio"){
            estrella2.setImageResource(R.drawable.estrella);
            mensaje = "lleno";
        }
        else if(mensaje == "lleno"){
            estrella2.setImageResource(R.drawable.estrellavacia);
            mensaje = "vacio";
        }
    }

    public void cambioEstrella3(View view){
        if(mensaje == "vacio"){
            estrella3.setImageResource(R.drawable.estrella);
            mensaje = "lleno";
        }
        else if(mensaje == "lleno"){
            estrella3.setImageResource(R.drawable.estrellavacia);
            mensaje = "vacio";
        }
    }

    public void cambioEstrella4(View view){
        if(mensaje == "vacio"){
            estrella4.setImageResource(R.drawable.estrella);
            mensaje = "lleno";
        }
        else if(mensaje == "lleno"){
            estrella4.setImageResource(R.drawable.estrellavacia);
            mensaje = "vacio";
        }
    }

    public void cambioEstrella5(View view){
        if(mensaje == "vacio"){
            estrella5.setImageResource(R.drawable.estrella);
            mensaje = "lleno";
        }
        else if(mensaje == "lleno"){
            estrella5.setImageResource(R.drawable.estrellavacia);
            mensaje = "vacio";
        }
    }

    public void cambioPesos(View view){
        if(mensaje == "vacio"){
            pesos.setImageResource(R.drawable.signopesos);
            mensaje = "lleno";
        }
        else if(mensaje == "lleno"){
            pesos.setImageResource(R.drawable.signopesos2);
            mensaje = "vacio";
        }
    }

    public void cambioEspera(View view){
        if(mensaje == "vacio"){
            espera.setImageResource(R.drawable.espera);
            mensaje = "lleno";
        }
        else if(mensaje == "lleno"){
            espera.setImageResource(R.drawable.espera2);
            mensaje = "vacio";
        }
    }

    public void cambioApp(View view){
        if(mensaje == "vacio"){
            celular.setImageResource(R.drawable.app2);
            mensaje = "lleno";
        }
        else if(mensaje == "lleno"){
            celular.setImageResource(R.drawable.app);
            mensaje = "vacio";
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_pqrs);

        //Establece el tipo de letra del título de la pantalla
        tituloPantalla = (TextView) findViewById(R.id.titulo);
        String font_path = "font/Humanst521_BT.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(), font_path);
        tituloPantalla.setTypeface(TF);

        estrella1 = (ImageView) findViewById(R.id.estrella_1);
        estrella2 = (ImageView) findViewById(R.id.estrella_2);
        estrella3 = (ImageView) findViewById(R.id.estrella_3);
        estrella4 = (ImageView) findViewById(R.id.estrella_4);
        estrella5 = (ImageView) findViewById(R.id.estrella_5);
        pesos = (ImageView) findViewById(R.id.signoPesos);
        espera = (ImageView) findViewById(R.id.espera);
        celular = (ImageView) findViewById(R.id.celular);

        //Al tocar sobre el botón de Enviar, se pasa a la actividad Agradecimiento
        findViewById(R.id.boton_enviar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pqrs.this, agradecimiento_calificacion.class));
            }
        });
    }
}
