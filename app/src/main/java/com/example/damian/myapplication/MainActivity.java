package com.example.damian.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_change_place = (Button) findViewById(R.id.button_change_place);
        Button button_change_activity = (Button) findViewById(R.id.button_change_activity);
        button_change_place.setOnClickListener(mListener);
        button_change_activity.setOnClickListener(mListener);
        bundle = new Bundle();
    }

    public View.OnClickListener mListener = (v) ->
    {

        switch (v.getId())
        {
            case R.id.button_change_place:
            {
                TextView city = findViewById(R.id.city);
                EditText insert_name = findViewById(R.id.insert_name);
                city.setText(insert_name.getText().toString());

                String newCity = insert_name.getText().toString();
                bundle.putString("cities", newCity);

                city.setText(newCity);
                break;
            }
            case R.id.button_change_activity:
            {
                Intent intent = new Intent(this, Main2Activity.class );
                startActivity(intent);

                break;
            }
        }


    };

}