package com.company.hubdeliver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class comprado extends AppCompatActivity {

     Button btnAceptarCpmpras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprado);


        btnAceptarCpmpras = findViewById(R.id.btnAceptarCompras);


        this.btnAceptarCpmpras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(comprado.this,"Compra Realizada",Toast.LENGTH_SHORT).show();
                finish();

            }
        });
    }
}