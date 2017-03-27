package com.example.damin.myapplication.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.damin.myapplication.Adapter.DataAdapter;
import com.example.damin.myapplication.AndroidVersion;
import com.example.damin.myapplication.R;

import java.util.ArrayList;

/**
 * Created by damin on 27/03/2017.
 */

public class Fragment2 extends Fragment {


    private final String android_version_names[] = {
            "Vodka",
            "Tequila",
            "Rhum",
            "Whisky",
            "Baileys",
            "Ricard",
            "Cognac",
            "Malibu",
            "Gin",
            "Vin rouge"
    };

    private final String android_image_urls[] = {

            "http://i2.cdscdn.com/pdt2/1/0/3/1/700x700/728103/rw/absolut-vodka-1-litre.jpg",
            "https://statics.monoprix.fr/course/g_2156658_tequila-35-vol-.jpg?t=20150826105417",
            "http://i2.cdscdn.com/pdt2/1/1/2/1/700x700/lam3255611133112/rw/bouteille-de-rhum-la-mauny-70cl-50.jpg",
            "http://www.whisky.fr/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/m/4/m412_4.jpg",
            "http://i2.cdscdn.com/pdt2/c/6/b/1/700x700/mhn2c6b/rw/baileys-original-70-cl.jpg",
            "https://www.auchandirect.fr/backend/media/products_images/0N_100715.jpg",
            "http://i2.cdscdn.com/pdt2/0/7/8/1/700x700/mar3219820000078/rw/cognac-martell-vsop-40ion.jpg",
            "http://www.ooshop.com/courses-en-ligne/Media/ProdImages/Produit/Images/8410024710328.gif",
            "http://i2.cdscdn.com/pdt2/9/1/0/1/700x700/lm5910/rw/gin-gibson-s-1l.jpg",
            "http://i2.cdscdn.com/pdt2/0/0/9/1/700x700/gui3536650601009/rw/bouteille-de-vin-gigondas-rou.jpg"
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.activity_alcool, container, false);



    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

       RecyclerView recyclerView = (RecyclerView)view.findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<AndroidVersion> androidVersions = prepareData();
        DataAdapter adapter = new DataAdapter(getActivity(),androidVersions);
        recyclerView.setAdapter(adapter);

       // initViews();


    }


    /*private void initViews(){

       recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<AndroidVersion> androidVersions = prepareData();
        DataAdapter adapter = new DataAdapter(getActivity(),androidVersions);
        recyclerView.setAdapter(adapter);

    }*/
    private ArrayList<AndroidVersion> prepareData(){

        ArrayList<AndroidVersion> android_version = new ArrayList<>();
        for(int i=0;i<android_version_names.length;i++){
            AndroidVersion androidVersion = new AndroidVersion();
            androidVersion.setAndroid_version_name(android_version_names[i]);
            androidVersion.setAndroid_image_url(android_image_urls[i]);
            android_version.add(androidVersion);
        }
        return android_version;
    }

}
