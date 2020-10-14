package com.company.hubdeliver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Serviciocomidas extends AppCompatActivity {
    public CardView idComidaTipica;
    public CardView idComidaEjecutiva;
    public CardView idComidaRapida;
    public CardView idBebidas;
    public CardView idPasteleria;
    public Button btnComida1;
    public Button btnComida2;
    public Button btnComida3;
    public Button btnComida4;
    public Button btnComida5;
    public Button btnComida6;
    public Button btnComida7;
    public Button btnComida8;
    public Button btnComida9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serviciocomidas);
        //cardview vertical
        this.idComidaEjecutiva = findViewById(R.id.idcomidaEjecutiva3);
        this.idComidaTipica = findViewById(R.id.idComidaTipica2);
        this.idComidaRapida = findViewById(R.id.idComidaRapida1);
        this.idBebidas = findViewById(R.id.idBebidas5);
        this.idPasteleria = findViewById(R.id.idPasteleria4);

        //botones horizontales
        this.btnComida1 = findViewById(R.id.btnComida1);
        this.btnComida2 = findViewById(R.id.btnComida2);
        this.btnComida3 = findViewById(R.id.btnComida3);
        this.btnComida4 = findViewById(R.id.btnComida4);
        this.btnComida5 = findViewById(R.id.btnComida5);
        this.btnComida6 = findViewById(R.id.btnComida6);
        this.btnComida7 = findViewById(R.id.btnComida7);
        this.btnComida8 = findViewById(R.id.btnComida8);
        this.btnComida9 = findViewById(R.id.btnComida9);



        //borones horizontales
        this.btnComida1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Serviciocomidas.this ,"Selecciono 1",Toast.LENGTH_SHORT).show();

            }
        });

        this.btnComida2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Serviciocomidas.this ,"Selecciono 2",Toast.LENGTH_SHORT).show();

            }
        });
        this.btnComida3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Serviciocomidas.this ,"Selecciono 3",Toast.LENGTH_SHORT).show();

            }
        });

        this.btnComida4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Serviciocomidas.this ,"Selecciono 4",Toast.LENGTH_SHORT).show();

            }
        });

        this.btnComida5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Serviciocomidas.this ,"Selecciono 5",Toast.LENGTH_SHORT).show();

            }
        });

        this.btnComida6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Serviciocomidas.this ,"Selecciono 6",Toast.LENGTH_SHORT).show();

            }
        });

        this.btnComida7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Serviciocomidas.this ,"Selecciono 7",Toast.LENGTH_SHORT).show();

            }
        });

        this.btnComida8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Serviciocomidas.this ,"Selecciono 8",Toast.LENGTH_SHORT).show();

            }
        });

        this.btnComida9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Serviciocomidas.this,"Selecciono 8",Toast.LENGTH_SHORT).show();

            }
        });

        ///cardviw verticales
        this.idComidaRapida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Serviciocomidas.this , MenuRapido.class);
                startActivity(i);

            }
        });
        this.idComidaTipica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Serviciocomidas.this , MenuRapido.class);
                startActivity(i);


            }
        });

        this.idComidaEjecutiva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Serviciocomidas.this, MenuRapido.class);
                startActivity(i);


            }
        });
        this.idPasteleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Serviciocomidas.this , MenuRapido.class);
                startActivity(i);


            }
        });
        this.idBebidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Serviciocomidas.this , MenuRapido.class);
                startActivity(i);

            }
        });
    }
}