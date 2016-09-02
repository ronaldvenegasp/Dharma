package com.example.personal.dharma;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class NumeroMesa extends AppCompatActivity {

    TextView tituloPantalla;
    TextView digitarNumero;
    TextView escanearNumero;

    //Variables
    //private EditText numeroDeMesa;
    private String numeroDeMesaIngresado = "-----";
    //private int numeroDeMesaEntero;

    Spinner lista;
    String[] numerosMesas = {"-----", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",};

    public void setTableNumber(View view) {

         //numeroDeMesa = (EditText) findViewById(R.id.numeroMesa);
         //numeroDeMesaIngresado = numeroDeMesa.getText().toString();
         Log.i("Número de mesa: ", numeroDeMesaIngresado);

        //numeroDeMesaEntero = Integer.parseInt(numeroDeMesaIngresado);

        //Se declara el Intent y se instancia con el contexto y la clase a la que nos queremos dirigir
        Intent intent_numero_mesa = new Intent(NumeroMesa.this, MenuPrincipal.class);

        if(numeroDeMesaIngresado.equals("-----")) {
            Toast.makeText(getApplicationContext(), "¡Debe seleccionar un número de mesa!", Toast.LENGTH_LONG).show();
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

        lista =(Spinner)findViewById(R.id.lista_mesas);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(NumeroMesa.this, android.R.layout.simple_spinner_item, numerosMesas);
        lista.setAdapter(adaptador);
        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        Toast mesa1 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa1.show();
                        numeroDeMesaIngresado = numerosMesas[i];
                        break;
                    case 2:
                        Toast mesa2 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa2.show();
                        numeroDeMesaIngresado = numerosMesas[i];
                        break;
                    case 3:
                        Toast mesa3 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa3.show();
                        numeroDeMesaIngresado = numerosMesas[i];
                        break;
                    case 4:
                        Toast mesa4 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa4.show();
                        numeroDeMesaIngresado = numerosMesas[i];
                        break;
                    case 5:
                        Toast mesa5 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa5.show();
                        numeroDeMesaIngresado = numerosMesas[i];
                        break;
                    case 6:
                        Toast mesa6 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa6.show();
                        numeroDeMesaIngresado = numerosMesas[i];
                        break;
                    case 7:
                        Toast mesa7 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa7.show();
                        numeroDeMesaIngresado = numerosMesas[i];
                        break;
                    case 8:
                        Toast mesa8 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa8.show();
                        numeroDeMesaIngresado = numerosMesas[i];
                        break;
                    case 9:
                        Toast mesa9 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa9.show();
                        numeroDeMesaIngresado = numerosMesas[i];
                        break;
                    case 10:
                        Toast mesa10 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa10.show();
                        numeroDeMesaIngresado = numerosMesas[i];
                        break;
                    case 11:
                        Toast mesa11 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa11.show();
                        numeroDeMesaIngresado = numerosMesas[i];
                        break;
                    case 12:
                        Toast mesa12 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa12.show();
                        numeroDeMesaIngresado = numerosMesas[i];
                        break;
                    case 13:
                        Toast mesa13 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa13.show();
                        numeroDeMesaIngresado = numerosMesas[i];
                        break;
                    case 14:
                        Toast mesa14 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa14.show();
                        numeroDeMesaIngresado = numerosMesas[i];
                        break;
                    case 15:
                        Toast mesa15 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa15.show();
                        numeroDeMesaIngresado = numerosMesas[i];
                        break;
                    case 16:
                        Toast mesa16 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa16.show();
                        numeroDeMesaIngresado = numerosMesas[i];
                        break;
                    case 17:
                        Toast mesa17 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa17.show();
                        numeroDeMesaIngresado = numerosMesas[i];
                        break;
                    case 18:
                        Toast mesa18 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa18.show();
                        numeroDeMesaIngresado = numerosMesas[i];
                        break;
                    case 19:
                        Toast mesa19 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa19.show();
                        numeroDeMesaIngresado = numerosMesas[i];
                        break;
                    case 20:
                        Toast mesa20 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa20.show();
                        numeroDeMesaIngresado = numerosMesas[i];
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //Establece el tipo de letra del título de la pantalla
        tituloPantalla = (TextView) findViewById(R.id.titulo);
        String font_path = "font/Humanst521_BT.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(), font_path);
        tituloPantalla.setTypeface(TF);

        //Establece el tipo de letra del campo digitar número de mesa
        digitarNumero = (TextView) findViewById(R.id.digitar_numero);
        String font_path1 = "font/Keira_Normal.ttf";
        Typeface TF1 = Typeface.createFromAsset(getAssets(), font_path1);
        digitarNumero.setTypeface(TF1);

        //Establece el tipo de letra del campo escanear número de mesa
        escanearNumero = (TextView) findViewById(R.id.escanear_numero);
        String font_path2 = "font/Keira_Normal.ttf";
        Typeface TF2 = Typeface.createFromAsset(getAssets(), font_path2);
        escanearNumero.setTypeface(TF2);

        //Al tocar sobre el botón de Ayuda, se pasa a la actividad Ayuda de la aplicación
        findViewById(R.id.boton_ayuda).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NumeroMesa.this, Ayuda.class));
            }
        });
    }

}
