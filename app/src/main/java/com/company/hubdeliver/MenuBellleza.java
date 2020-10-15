package com.company.hubdeliver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuBellleza extends AppCompatActivity {
     Button btnComprando1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_bellleza);

        this.btnComprando1 = findViewById(R.id.btnComprando1);

        this.btnComprando1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuBellleza.this,comprado.class);
                startActivity(i);

            }
        });
    }
}