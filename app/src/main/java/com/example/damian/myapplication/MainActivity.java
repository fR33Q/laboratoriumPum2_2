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
                .load("data:image/png;base64,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")
                .into(obraz);

        Intent getData = getIntent();
        Bundle bundle = getIntent().getExtras();


        if (bundle != null) {
            String place = bundle.getString("CityName");
            cityTv.setText(place);
        }
    }


}