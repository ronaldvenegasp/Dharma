package com.example.personal.dharma;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Pagar extends AppCompatActivity {

    TextView tituloPantalla;

    Spinner lista;
    String[] numerosMesas = {"-Seleccione-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_pagar);

        lista =(Spinner)findViewById(R.id.lista_mesas);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(Pagar.this, android.R.layout.simple_spinner_item, numerosMesas);
        lista.setAdapter(adaptador);
        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        Toast mesa1 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa1.show();
                        break;
                    case 2:
                        Toast mesa2 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa2.show();
                        break;
                    case 3:
                        Toast mesa3 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa3.show();
                        break;
                    case 4:
                        Toast mesa4 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa4.show();
                        break;
                    case 5:
                        Toast mesa5 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa5.show();
                        break;
                    case 6:
                        Toast mesa6 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa6.show();
                        break;
                    case 7:
                        Toast mesa7 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa7.show();
                        break;
                    case 8:
                        Toast mesa8 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa8.show();
                        break;
                    case 9:
                        Toast mesa9 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa9.show();
                        break;
                    case 10:
                        Toast mesa10 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa10.show();
                        break;
                    case 11:
                        Toast mesa11 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa11.show();
                        break;
                    case 12:
                        Toast mesa12 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa12.show();
                        break;
                    case 13:
                        Toast mesa13 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa13.show();
                        break;
                    case 14:
                        Toast mesa14 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa14.show();
                        break;
                    case 15:
                        Toast mesa15 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa15.show();
                        break;
                    case 16:
                        Toast mesa16 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa16.show();
                        break;
                    case 17:
                        Toast mesa17 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa17.show();
                        break;
                    case 18:
                        Toast mesa18 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa18.show();
                        break;
                    case 19:
                        Toast mesa19 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa19.show();
                        break;
                    case 20:
                        Toast mesa20 = Toast.makeText(getApplicationContext(), "Mesa No. " + numerosMesas[i], Toast.LENGTH_LONG);
                        mesa20.show();
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

        //Al tocar sobre el botón de Ayuda, se pasa a la actividad Ayuda de la aplicación
        findViewById(R.id.boton_ayuda).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pagar.this, Ayuda.class));
            }
        });
    }
}
