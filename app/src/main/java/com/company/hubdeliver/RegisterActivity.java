package com.company.hubdeliver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText txt_nombre;
    EditText txt_password;
    EditText txt_telefono;
    Button btn_aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        this.txt_nombre = findViewById(R.id.txt_name_register);
        this.txt_password = findViewById(R.id.id_password_register);
        this.txt_telefono = findViewById(R.id.id_telefono);
        this.btn_aceptar = findViewById(R.id.btn_agree);

        this.btn_aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if (validar()) {
                    Intent i = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(i);
      //
               }
            }
                public boolean validar(){
                    Boolean respuesta =  true;

                    String n = txt_nombre.getText().toString();
                    String a = txt_password.getText().toString();
                    String t = txt_telefono.getText().toString();



                    if(n.isEmpty()){
                        txt_nombre.setError("Campo requerido..");
                        respuesta = false;
                    }
                    if(a.isEmpty()){
                        txt_password.setError("Campo requerido..");
                        respuesta = false;
                    }
                    if(n.isEmpty()){
                        txt_telefono.setError("Campo requerido..");
                        respuesta = false;
                    }


                    return respuesta;

                }
        });
    }

}