package com.company.hubdeliver.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.company.hubdeliver.MenuRapido;
import com.company.hubdeliver.R;


public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public CardView idComidaRapida;
    public CardView idComidaTipica;
    public CardView idComidaEjecutiva;
    public CardView idPasteleria;
    public CardView idBebidas;
    public Button btnuno;
    public Button btndos;
    public Button btntres;
    public Button btncuatro;
    public Button btncinco;
    public Button btnseis;
    public Button btnsiete;
    public Button btnocho;
    public Button btnnueve;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        //cardview vertical
        this.idComidaRapida = root.findViewById(R.id.idBelleza1);
        this.idComidaTipica = root.findViewById(R.id.idComidaTipica);
        this.idComidaEjecutiva = root.findViewById(R.id.idComidaEjecutiva);
        this.idPasteleria = root.findViewById(R.id.idPasteleria);
        this.idBebidas = root.findViewById(R.id.idBebidas);

        //botones horizontales
        this.btnuno = root.findViewById(R.id.btnuno);
        this.btndos = root.findViewById(R.id.btndos);
        this.btntres = root.findViewById(R.id.btntres);
        this.btncuatro = root.findViewById(R.id.btncuatro);
        this.btncinco = root.findViewById(R.id.btncinco);
        this.btnseis = root.findViewById(R.id.btnseis);
        this.btnsiete = root.findViewById(R.id.btnsiete);
        this.btnocho = root.findViewById(R.id.btnocho);
        this.btnnueve = root.findViewById(R.id.btnnueve);

        //borones horizontales
        this.btnuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Selecciono 1",Toast.LENGTH_SHORT).show();

            }
        });

        this.btndos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Selecciono 2",Toast.LENGTH_SHORT).show();

            }
        });
        this.btntres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Selecciono 3",Toast.LENGTH_SHORT).show();

            }
        });

        this.btncuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Selecciono 4",Toast.LENGTH_SHORT).show();

            }
        });

        this.btncinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Selecciono 5",Toast.LENGTH_SHORT).show();

            }
        });

        this.btnseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Selecciono 6",Toast.LENGTH_SHORT).show();

            }
        });

        this.btnsiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Selecciono 7",Toast.LENGTH_SHORT).show();

            }
        });

        this.btnocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Selecciono 8",Toast.LENGTH_SHORT).show();

            }
        });

        this.btnnueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Selecciono 8",Toast.LENGTH_SHORT).show();

            }
        });

        ///cardviw verticales
        this.idComidaRapida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), MenuRapido.class);
               startActivity(i);

            }
        });
        this.idComidaTipica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), MenuRapido.class);
                startActivity(i);


            }
        });

        this.idComidaEjecutiva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), MenuRapido.class);
                startActivity(i);


            }
        });
        this.idPasteleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), MenuRapido.class);
                startActivity(i);


            }
        });
        this.idBebidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), MenuRapido.class);
                startActivity(i);

            }
        });






        return root;
    }
}