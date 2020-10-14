package com.company.hubdeliver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Belleza extends AppCompatActivity {
    public CardView idBellezaShompoo;
    public CardView idBellezaCremas;
    public CardView idBellezaTintes;
    public CardView idBellezaMaquillaje;
    public CardView idBellezaPerfumes;
    public Button btnBelleza1;
    public Button btnBelleza2;
    public Button btnBelleza3;
    public Button btnBelleza4;
    public Button btnBelleza5;
    public Button btnBelleza6;
    public Button btnBelleza7;
    public Button btnBelleza8;
    public Button btnBelleza9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belleza);
        //cardview vertical
        this.idBellezaShompoo = findViewById(R.id.idBellezaShompoo);
        this.idBellezaCremas = findViewById(R.id.idBellezaCremas);
        this.idBellezaTintes = findViewById(R.id.idBellezaTintes);
        this.idBellezaMaquillaje = findViewById(R.id.idBellezaMaquillaje);
        this.idBellezaPerfumes = findViewById(R.id.idBellezaPerfumes);

        //botones horizontales
        this.btnBelleza1 = findViewById(R.id.btnBelleza1);
        this.btnBelleza2 = findViewById(R.id.btnBelleza2);
        this.btnBelleza3 = findViewById(R.id.btnBelleza3);
        this.btnBelleza4 = findViewById(R.id.btnBelleza4);
        this.btnBelleza5 = findViewById(R.id.btnBelleza5);
        this.btnBelleza6 = findViewById(R.id.btnBelleza6);
        this.btnBelleza7 = findViewById(R.id.btnBelleza7);
        this.btnBelleza8 = findViewById(R.id.btnBelleza8);
        this.btnBelleza9 = findViewById(R.id.btnBelleza9);



        //borones horizontales
        this.btnBelleza1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Belleza.this ,"Selecciono 1",Toast.LENGTH_SHORT).show();

            }
        });

        this.btnBelleza2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Belleza.this ,"Selecciono 2",Toast.LENGTH_SHORT).show();

            }
        });
        this.btnBelleza3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Belleza.this ,"Selecciono 3",Toast.LENGTH_SHORT).show();

            }
        });

        this.btnBelleza4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Belleza.this ,"Selecciono 4",Toast.LENGTH_SHORT).show();

            }
        });

        this.btnBelleza5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Belleza.this ,"Selecciono 5",Toast.LENGTH_SHORT).show();

            }
        });

        this.btnBelleza6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Belleza.this ,"Selecciono 6",Toast.LENGTH_SHORT).show();

            }
        });

        this.btnBelleza7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Belleza.this ,"Selecciono 7",Toast.LENGTH_SHORT).show();

            }
        });

        this.btnBelleza8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Belleza.this ,"Selecciono 8",Toast.LENGTH_SHORT).show();

            }
        });

        this.btnBelleza9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Belleza.this,"Selecciono 8",Toast.LENGTH_SHORT).show();

            }
        });

        ///cardviw verticales
        this.idBellezaShompoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Belleza.this , MenuBellleza.class);
                startActivity(i);

            }
        });
        this.idBellezaCremas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Belleza.this , MenuBellleza.class);
                startActivity(i);


            }
        });

        this.idBellezaMaquillaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Belleza.this, MenuBellleza.class);
                startActivity(i);


            }
        });
        this.idBellezaPerfumes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Belleza.this , MenuBellleza.class);
                startActivity(i);


            }
        });
        this.idBellezaTintes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Belleza.this , MenuBellleza.class);
                startActivity(i);

            }
        });

    }
}