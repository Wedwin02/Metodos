package com.company.hubdeliver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnComida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // estos botones son de testing y seran destruidos mas adelante
        btnComida = findViewById(R.id.btnComida);


        //estos metodos son de testing y seran destruidos mas adelante
        btnComida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //aqui para abrir la activity que se necesite testear
                Intent frm = new Intent(MainActivity.this,Principal_Drawer.class);
                startActivity(frm);
            }
        });



    }
}