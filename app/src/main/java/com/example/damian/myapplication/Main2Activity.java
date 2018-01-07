package com.example.damian.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {
@BindView(R.id.recyclerView)
RecyclerView rv;
String citytxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        ArrayList<Place> miejsca = new ArrayList<>();
        miejsca.add(new Place(12,"Bytom","slask"));
        miejsca.add(new Place(20,"Katowice","slask"));
        miejsca.add(new Place(25,"Zabrze","slask"));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setLayoutManager(layoutManager);



        OnClickPlace listener = (view, position) -> {
            citytxt = miejsca.get(position).getPlaceName();
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("CityName", citytxt);
            intent.putExtras(bundle);
            startActivity(intent);

        };

        PlaceAdapter placeAdapter = new PlaceAdapter(miejsca, listener);
        rv.setAdapter(placeAdapter);
        }

    }

