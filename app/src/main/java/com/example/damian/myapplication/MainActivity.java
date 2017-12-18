package com.example.damian.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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

    @OnClick(R.id.button_change_place)
            void onClick()
    {

        cityTv.setText(insert_name_city.getText().toString());

    }

    @OnClick(R.id.button_change_activity)
            void onClick1()
    {
        Intent intent = new Intent(this, Main2Activity.class );
        startActivity(intent);

    }

Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        bundle = new Bundle();
    }


}