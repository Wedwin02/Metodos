package com.company.hubdeliver.ui.localizacion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.company.hubdeliver.R;
import com.company.hubdeliver.ui.home.HomeViewModel;

public class LocalizacionFragment extends Fragment {
    private LocalizacionViewModel localizacion;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        localizacion =
                ViewModelProviders.of(this).get(LocalizacionViewModel.class);
        View root = inflater.inflate(R.layout.fragment_localizacion, container, false);
        // final TextView textView = root.findViewById(R.id.text_home);
        localizacion.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText(s);
            }
        });
        return root;
    }
}
