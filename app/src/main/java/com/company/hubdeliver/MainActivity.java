package com.company.hubdeliver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    CardView btnComida;
    CardView btnbelleza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // estos botones son de testing y seran destruidos mas adelante
        btnComida = findViewById(R.id.btnComida);
        btnbelleza = findViewById(R.id.btnbelleza);


        //estos metodos son de testing y seran destruidos mas adelante
        btnComida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //aqui para abrir la activity que se necesite testear
                Intent frm = new Intent(MainActivity.this,Serviciocomidas.class);
                startActivity(frm);
            }
        });
        btnbelleza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //aqui para abrir la activity que se necesite testear
                Intent frm = new Intent(MainActivity.this,Belleza.class);
                startActivity(frm);
            }
        });



    }
}