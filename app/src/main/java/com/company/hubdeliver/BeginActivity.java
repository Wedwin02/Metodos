package com.company.hubdeliver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BeginActivity extends AppCompatActivity {

    Button btn_register;
    Button btn_register_later;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);

        this.btn_register = findViewById(R.id.btn_registro);
        this.btn_register_later = findViewById(R.id.btn_later);

        this.btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BeginActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });
        this.btn_register_later.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BeginActivity.this, Principal_Drawer.class);
                startActivity(i);
            }
        });
    }
}