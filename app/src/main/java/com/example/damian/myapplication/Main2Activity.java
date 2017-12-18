package com.example.damian.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {
@BindView(R.id.recyclerView)
RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        ArrayList<Place> miejsca = new ArrayList<>();
        miejsca.add(new Place(12,"Bytom","slask"));
        miejsca.add(new Place(20,"Katowice","slask"));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(layoutManager);

        PlaceAdapter placeAdapter = new PlaceAdapter(miejsca);
        rv.setAdapter(placeAdapter);
    }
}
