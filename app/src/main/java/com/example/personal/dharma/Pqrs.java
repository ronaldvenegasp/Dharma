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
    TextView textoEstrellas;
    TextView textoMejoras;
    TextView textoComentarios;
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
        if(mensaje.equals("vacio")){
            estrella1.setImageResource(R.drawable.estrella);
            mensaje = "lleno";
        }
        else if(mensaje.equals("lleno")){
            estrella1.setImageResource(R.drawable.estrellavacia);
            mensaje = "vacio";
        }
    }

    public void cambioEstrella2(View view) {
        if(mensaje.equals("vacio")){
            estrella2.setImageResource(R.drawable.estrella);
            mensaje = "lleno";
        }
        else if(mensaje.equals("lleno")){
            estrella2.setImageResource(R.drawable.estrellavacia);
            mensaje = "vacio";
        }
    }

    public void cambioEstrella3(View view){
        if(mensaje.equals("vacio")){
            estrella3.setImageResource(R.drawable.estrella);
            mensaje = "lleno";
        }
        else if(mensaje.equals("lleno")){
            estrella3.setImageResource(R.drawable.estrellavacia);
            mensaje = "vacio";
        }
    }

    public void cambioEstrella4(View view){
        if(mensaje.equals("vacio")){
            estrella4.setImageResource(R.drawable.estrella);
            mensaje = "lleno";
        }
        else if(mensaje.equals("lleno")){
            estrella4.setImageResource(R.drawable.estrellavacia);
            mensaje = "vacio";
        }
    }

    public void cambioEstrella5(View view){
        if(mensaje.equals("vacio")){
            estrella5.setImageResource(R.drawable.estrella);
            mensaje = "lleno";
        }
        else if(mensaje.equals("lleno")){
            estrella5.setImageResource(R.drawable.estrellavacia);
            mensaje = "vacio";
        }
    }

    public void cambioPesos(View view){
        if(mensaje.equals("vacio")){
            pesos.setImageResource(R.drawable.signopesos);
            mensaje = "lleno";
        }
        else if(mensaje.equals("lleno")){
            pesos.setImageResource(R.drawable.signopesos2);
            mensaje = "vacio";
        }
    }

    public void cambioEspera(View view){
        if(mensaje.equals("vacio")){
            espera.setImageResource(R.drawable.espera);
            mensaje = "lleno";
        }
        else if(mensaje.equals("lleno")){
            espera.setImageResource(R.drawable.espera2);
            mensaje = "vacio";
        }
    }

    public void cambioApp(View view){
        if(mensaje.equals("vacio")){
            celular.setImageResource(R.drawable.app2);
            mensaje = "lleno";
        }
        else if(mensaje.equals("lleno")){
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

        //Establece el tipo de letra del campo mensaje estrellas
        textoEstrellas = (TextView) findViewById(R.id.mensaje_estrellas);
        String font_path2 = "font/Keira_Normal.ttf";
        Typeface TF2 = Typeface.createFromAsset(getAssets(), font_path2);
        textoEstrellas.setTypeface(TF2);

        //Establece el tipo de letra del campo mejoras
        textoMejoras = (TextView) findViewById(R.id.mejoras);
        String font_path3 = "font/Keira_Normal.ttf";
        Typeface TF3 = Typeface.createFromAsset(getAssets(), font_path3);
        textoMejoras.setTypeface(TF3);

        //Establece el tipo de letra del campo dejar comentario
        textoComentarios = (TextView) findViewById(R.id.comentario);
        String font_path4 = "font/Keira_Normal.ttf";
        Typeface TF4 = Typeface.createFromAsset(getAssets(), font_path4);
        textoComentarios.setTypeface(TF4);

        estrella1 = (ImageView) findViewById(R.id.estrella_1);
        estrella2 = (ImageView) findViewById(R.id.estrella_2);
        estrella3 = (ImageView) findViewById(R.id.estrella_3);
        estrella4 = (ImageView) findViewById(R.id.estrella_4);
        estrella5 = (ImageView) findViewById(R.id.estrella_5);
        pesos = (ImageView) findViewById(R.id.signoPesos);
        espera = (ImageView) findViewById(R.id.espera);
        celular = (ImageView) findViewById(R.id.celular);
    }
}
