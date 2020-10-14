package com.company.hubdeliver.ui.perfil;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.company.hubdeliver.R;
import com.company.hubdeliver.ui.pedidos.PedidosViewModel;

public class PerfilFragment extends Fragment {
    private PerfilViewModel perfil;
    private Button btnEditarPerfil;
    private Button btnSalirPerfil;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        perfil =
                ViewModelProviders.of(this).get(PerfilViewModel.class);
        View root = inflater.inflate(R.layout.fragment_perfil, container, false);
        // final TextView textView = root.findViewById(R.id.text_home);

        //root nos permitira acceder a la vista
        this.btnEditarPerfil = root.findViewById(R.id.btnEditarPerfil);
        this.btnSalirPerfil = root.findViewById(R.id.btnSalirPerfil);


        this.btnSalirPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Precionastes salir",Toast.LENGTH_SHORT).show();
            }
        });

        this.btnEditarPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Precionastes editar",Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }
}
