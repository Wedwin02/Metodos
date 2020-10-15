package com.company.hubdeliver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText txt_nombre;
    EditText txt_password;
    Button btn_iniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.txt_nombre = findViewById(R.id.txt_nombre);
        this.txt_password = findViewById(R.id.id_password);
        this.btn_iniciar = findViewById(R.id.btn_sesion);

        this.btn_iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validar()) {
                    Intent i = new Intent(LoginActivity.this,  Belleza.class);
                    startActivity(i);
                }
            }
            public boolean validar(){
                Boolean respuesta =  true;

                String n = txt_nombre.getText().toString();
                String a = txt_password.getText().toString();


                if(n.isEmpty()){
                    txt_nombre.setError("Campo requerido..");
                    respuesta = false;
                }
                if(a.isEmpty()){
                    txt_password.setError("Campo requerido..");
                    respuesta = false;
                }

                return respuesta;

            }
        });


    }

}