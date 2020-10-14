package com.company.hubdeliver.ui.session;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.company.hubdeliver.LoginActivity;
import com.company.hubdeliver.R;
import com.company.hubdeliver.ui.home.HomeViewModel;

public class SessionFragment extends Fragment {
    private SessionViewModel session;
    private Button btnAceptarSession;

    EditText txt_nombre,txt_password,txt_telefono;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        session =
                ViewModelProviders.of(this).get(SessionViewModel.class);
        View root = inflater.inflate(R.layout.fragment_session, container, false);
        // final TextView textView = root.findViewById(R.id.text_home);


        this.btnAceptarSession = root.findViewById(R.id.btnAceptarSession);
        txt_nombre = root.findViewById(R.id.txtnombre);
        txt_password = root.findViewById(R.id.txtpass);
        txt_telefono = root.findViewById(R.id.txtnumero);

        this.btnAceptarSession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validar()){
                Intent i = new Intent(getContext(), LoginActivity.class);
                startActivity(i);
                }
            }
            public boolean validar(){
                Boolean retorno =  true;

                String n = txt_nombre.getText().toString();
                String a = txt_password.getText().toString();
                String t = txt_telefono.getText().toString();



                if(n.isEmpty()){
                    txt_nombre.setError("Campo requerido..");
                    retorno = false;
                }
                if(a.isEmpty()){
                    txt_password.setError("Campo requerido..");
                    retorno = false;
                }
                if(n.isEmpty()){
                    txt_telefono.setError("Campo requerido..");
                    retorno = false;
                }


                return retorno;

            }
        });


        return root;
    }
}
