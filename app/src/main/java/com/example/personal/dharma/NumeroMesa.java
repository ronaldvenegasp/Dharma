package com.example.personal.dharma;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NumeroMesa extends AppCompatActivity {

    TextView tituloPantalla;

    //Variables
    private EditText numeroDeMesa;
    private String numeroDeMesaIngresado;
    private int numeroDeMesaEntero;

    public void setTableNumber(View view) {
        numeroDeMesa = (EditText) findViewById(R.id.numeroMesa);
        numeroDeMesaIngresado = numeroDeMesa.getText().toString();
        Log.i("Número de mesa: ", numeroDeMesaIngresado);

        numeroDeMesaEntero = Integer.parseInt(numeroDeMesaIngresado);

        //Se declara el Intent y se instancia con el contexto y la clase a la que nos queremos dirigir
        Intent intent_numero_mesa = new Intent(NumeroMesa.this, MenuPrincipal.class);

        if(numeroDeMesaIngresado.equals("")) {
            Toast.makeText(getApplicationContext(), "¡Debes ingresar un número de mesa!", Toast.LENGTH_LONG).show();
        }
        if(numeroDeMesaEntero < 1){
            Toast.makeText(getApplicationContext(), "¡Número de mesa incorrecto!", Toast.LENGTH_LONG).show();
        }
        if(numeroDeMesaEntero > 20){
            Toast.makeText(getApplicationContext(), "¡Número de mesa incorrecto!", Toast.LENGTH_LONG).show();
            numeroDeMesa.setText("");
        }
        else{
            //Al tocar sobre el botón de Siguiente, se pasa a la actividad Menú Principal de la aplicación
            findViewById(R.id.mesa_boton_siguiente).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(NumeroMesa.this, MenuPrincipal.class));
                }
            });

            //Enviar el número de la mesa a la siguiente actividad
            intent_numero_mesa.putExtra("mesa", numeroDeMesaIngresado);
            startActivity(intent_numero_mesa);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_numero_mesa);

        //Establece el tipo de letra del título de la pantalla
        tituloPantalla = (TextView) findViewById(R.id.titulo);
        String font_path = "font/Humanst521_BT.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(), font_path);
        tituloPantalla.setTypeface(TF);

        //Al tocar sobre el botón de Ayuda, se pasa a la actividad Ayuda de la aplicación
        findViewById(R.id.boton_ayuda).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NumeroMesa.this, Ayuda.class));
            }
        });
    }

}
