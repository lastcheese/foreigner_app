package com.dt.navi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bus_btn, delivery_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bus_btn = findViewById(R.id.bus_btn);
        delivery_btn = findViewById(R.id.delivery_btn);

        bus_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BusMainActivity.class);
                startActivity(intent);
            }
        });

        delivery_btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DeliveryMainActivity.class);
                startActivity(intent);
            }
        });
    }
}
