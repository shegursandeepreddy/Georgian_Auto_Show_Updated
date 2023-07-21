package com.example.georgianautoshow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class Home extends AppCompatActivity {
    private ImageView events, planner, exhibiter, floor, representative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);

        events=findViewById(R.id.events);
        planner=findViewById(R.id.planner);
        exhibiter=findViewById(R.id.exhibiters);
        representative=findViewById(R.id.repreasent);
        floor=findViewById(R.id.floor);
        representative=findViewById(R.id.repreasent);

        events.setOnClickListener(view -> {
            Intent intent=new Intent(Home.this,Category.class);

            startActivity(intent);
        });
        planner.setOnClickListener(view -> {
            Intent intent=new Intent(Home.this,Planner.class);

            startActivity(intent);
        });
        exhibiter.setOnClickListener(view -> {
            Intent intent=new Intent(Home.this,Exhibitor.class);
            startActivity(intent);
        });
        floor.setOnClickListener(view -> {
            Intent intent=new Intent(Home.this,Floor.class);

            startActivity(intent);
        });
        representative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home.this,Profile.class);

                startActivity(intent);
            }
        });


    }
}