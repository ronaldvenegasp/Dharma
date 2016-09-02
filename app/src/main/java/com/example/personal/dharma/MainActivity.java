package com.example.personal.dharma;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    // Duración en milisegundos que se mostrará el splash
    private final int DURACION_SPLASH = 3000; // 3 segundos

      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);


          new Handler().postDelayed(new Runnable(){
              public void run(){
                  // Cuando pasen los 3 segundos, pasamos a la actividad principal de la aplicación
                  Intent intent = new Intent(MainActivity.this, inicio.class);
                  startActivity(intent);
                  finish();
              };
          }, DURACION_SPLASH);
      }
}
