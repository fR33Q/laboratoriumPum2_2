package com.example.damian.myapplication;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button_change_place)
    Button button_change_place;

    @BindView(R.id.button_change_activity)
    Button button_change_activity;

    @BindView(R.id.city)
    TextView cityTv;

    @BindView(R.id.insert_name)
    EditText insert_name_city;

    @BindView(R.id.pogoda_obraz)
    ImageView obraz;

    @OnClick(R.id.button_change_activity)
    void onClick1()
    {
        Intent intent = new Intent(this, Main2Activity.class );
        Bundle bundle = new Bundle();
        String enteredText = cityTv.getText().toString();
        bundle.putString("K", enteredText);
        intent.putExtras(bundle);
        startActivity(intent);

    }

    @OnClick(R.id.button_change_place)
    void onClick()
    {

        cityTv.setText(insert_name_city.getText().toString());

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Glide.with(getApplicationContext())
                .load("http://pogoda.polwysep.pl/g/3.png")
                .into(obraz);

        Intent getData = getIntent();
        Bundle bundle = getIntent().getExtras();


        if (bundle != null) {
            String place = bundle.getString("CityName");
            cityTv.setText(place);
        }
    }


}