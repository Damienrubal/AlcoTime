package com.example.damin.myapplication.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.damin.myapplication.R;

/**
 * Created by damin on 27/03/2017.
 */

public class Fragment1 extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.activity_fragment1, container, false);


    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        FloatingActionButton conseil = (FloatingActionButton) view.findViewById(R.id.conseil);
        conseil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "T'as beaucoup trop bu.Pour ce soir, oublie même le vélo.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        FloatingActionButton favori = (FloatingActionButton) view.findViewById(R.id.favori);
        favori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Tes consommations favorites", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        FloatingActionButton uber = (FloatingActionButton) view.findViewById(R.id.uber);
        uber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Appeler un Uber ? ", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }




}
