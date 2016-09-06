package com.example.personal.dharma;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class formulario_tarjeta_credito extends AppCompatActivity {

    TextView tituloPantalla;
    TextView numeroTarjeta;
    TextView mes;
    TextView anio;
    TextView cvv;

    private String numeroTarjetaIngresado = "";
    private String mesIngresado = "";
    private String anioIngresado = "";
    private String cvvIngresado = "";

    public void validarFormulario(View view) {
        //numeroTarjeta = (TextView) findViewById(R.id.numero_tarjeta);
        //mes = (TextView) findViewById(R.id.mes_tarjeta);
        //anio = (TextView) findViewById(R.id.anio_tarjeta);
        //cvv = (TextView) findViewById(R.id.cvv);

        numeroTarjetaIngresado = numeroTarjeta.getText().toString();
        mesIngresado = mes.getText().toString();
        anioIngresado = anio.getText().toString();
        cvvIngresado = cvv.getText().toString();



        if(numeroTarjetaIngresado.equals("")){
            Toast number = Toast.makeText(getApplicationContext(), "Digite el número de la tarjeta", Toast.LENGTH_LONG);
            number.show();
        }
        else if(numeroTarjetaIngresado.length() != 10){
            Toast number1 = Toast.makeText(getApplicationContext(), "Número de tarjeta incorrecto", Toast.LENGTH_LONG);
            number1.show();
        }
        else if(mesIngresado.equals("")){
            Toast mes = Toast.makeText(getApplicationContext(), "Digite el mes de vencimiento de la tarjeta", Toast.LENGTH_LONG);
            mes.show();
        }
        else if(Integer.valueOf(mesIngresado) < 1 || Integer.valueOf(mesIngresado) > 12){
            Toast mes1 = Toast.makeText(getApplicationContext(), "Mes de vencimiento de la tarjeta incorrecto", Toast.LENGTH_LONG);
            mes1.show();
        }
        else if(anioIngresado.equals("")){
            Toast anio = Toast.makeText(getApplicationContext(), "Digite el año de vencimiento de la tarjeta", Toast.LENGTH_LONG);
            anio.show();
        }
        else if(anioIngresado.length() != 2){
            Toast anio1 = Toast.makeText(getApplicationContext(), "Año de vencimiento de la tarjeta incorrecto", Toast.LENGTH_LONG);
            anio1.show();
        }
        else if(cvvIngresado.equals("")){
            Toast cvv1 = Toast.makeText(getApplicationContext(), "Digite el CVV de la tarjeta", Toast.LENGTH_LONG);
            cvv1.show();
        }
        else if(cvvIngresado.length() != 3){
            Toast cvv2 = Toast.makeText(getApplicationContext(), "CVV incorrecto", Toast.LENGTH_LONG);
            cvv2.show();
        }
        else{
            //Al tocar sobre el botón de Hacer Pago, se pasa a la actividad agradecimiento de la aplicación
            findViewById(R.id.boton_hacer_pago).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(formulario_tarjeta_credito.this, finalizar_pago_tarjeta_credito.class));
                }
            });
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_tarjeta_credito);

        //Establece el tipo de letra del título de la pantalla
        tituloPantalla = (TextView) findViewById(R.id.titulo);
        String font_path = "font/Humanst521_BT.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(), font_path);
        tituloPantalla.setTypeface(TF);

        //Establece el tipo de letra del campo numero tarjeta
        numeroTarjeta = (TextView) findViewById(R.id.numero_tarjeta);
        String font_path1 = "font/Keira_Normal.ttf";
        Typeface TF1 = Typeface.createFromAsset(getAssets(), font_path1);
        numeroTarjeta.setTypeface(TF1);

        //Establece el tipo de letra del campo mes
        mes = (TextView) findViewById(R.id.mes_tarjeta);
        String font_path2 = "font/Keira_Normal.ttf";
        Typeface TF2 = Typeface.createFromAsset(getAssets(), font_path2);
        mes.setTypeface(TF2);

        //Establece el tipo de letra del año
        anio = (TextView) findViewById(R.id.anio_tarjeta);
        String font_path3 = "font/Keira_Normal.ttf";
        Typeface TF3 = Typeface.createFromAsset(getAssets(), font_path3);
        anio.setTypeface(TF3);

        //Establece el tipo de letra del campo cvv
        cvv = (TextView) findViewById(R.id.cvv);
        String font_path4 = "font/Keira_Normal.ttf";
        Typeface TF4 = Typeface.createFromAsset(getAssets(), font_path4);
        cvv.setTypeface(TF4);

        //Al tocar sobre el botón de Ayuda, se pasa a la actividad Ayuda de la aplicación
        findViewById(R.id.boton_ayuda).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(formulario_tarjeta_credito.this, Ayuda.class));
            }
        });

        //Al tocar sobre el botón de Menú Principal, se pasa a la actividad menu_principal de la aplicación
        findViewById(R.id.menu_principal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(formulario_tarjeta_credito.this, MenuPrincipal.class));
            }
        });
    }


}
