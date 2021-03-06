package com.example.gisela.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class HolaMundo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola_mundo);

        //Obtenemos una referencia a los controles de la interfaz
        final Button producto = (Button)findViewById(R.id.verProducto);
//Implementamos el evento “click” del botón
        producto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =  new Intent(HolaMundo.this, DetalleProducto.class);
                startActivity(intent);
            }
        });
    }

}
