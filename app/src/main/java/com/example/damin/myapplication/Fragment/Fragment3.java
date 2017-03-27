package com.example.damin.myapplication.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.damin.myapplication.R;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.LegendRenderer;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

/**
 * Created by damin on 27/03/2017.
 */

public class Fragment3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.activity_fragment3, container, false);


    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        GraphView graph = (GraphView)view.findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 0),
                new DataPoint(15, 0.10),
                new DataPoint(15.5, 0.15),
                new DataPoint(30, 0.20),
                new DataPoint(30.5, 0.25),
                new DataPoint(40,0.3),
                new DataPoint(60, 0.4),
                new DataPoint(70, 0.5),
                new DataPoint(80, 0.55),
                new DataPoint(95, 0.65),
                new DataPoint(110, 0.65),
                new DataPoint(115, 0.66),
                new DataPoint(120, 0.67),
                new DataPoint(125, 0.65),
                new DataPoint(130, 0.66),
                new DataPoint(135, 0.66),
                new DataPoint(150, 0.60),
                new DataPoint(155, 0.55),
                new DataPoint(160, 0.50),
                new DataPoint(170, 0.45),
                new DataPoint(175, 0.38),
                new DataPoint(190, 0.31),
                new DataPoint(200, 0.28),


        });
        LineGraphSeries<DataPoint> droiteLimite = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 0.5),
                new DataPoint(200, 0.5),



        });
        droiteLimite.setColor(Color.rgb(220,20,68));
        droiteLimite.setDrawBackground(true);
        droiteLimite.setBackgroundColor(Color.argb(50,97,244,249));
        droiteLimite.setThickness(6);
        series.setTitle(" Votre Taux d'alcoolémie");
        droiteLimite.setTitle("0.5 g/L");
        graph.getLegendRenderer().setVisible(true);
        graph.getLegendRenderer().setAlign(LegendRenderer.LegendAlign.TOP);

        series.setAnimated(true);
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMinY(0);
        graph.getViewport().setMaxY(1);

        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMinX(0);
        graph.getViewport().setMaxX(200);

        graph.getViewport().setScalable(true);
        graph.getViewport().setScalableY(true);

        graph.addSeries(series);
        graph.addSeries(droiteLimite);


    }
}
