package com.example.georgianautoshow;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private  static int SPLASH_SCREEN=3000;
    private ProgressDialog loadingbar;

    Animation toAnim;
    ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        loadingbar = new ProgressDialog(this);

        //animtion
        toAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        im = findViewById(R.id.logo);
        im.setAnimation(toAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, AboutUs.class);
                Pair[] paris = new Pair[1];
                paris[0] = new Pair<View, String>(im, "logo");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, paris);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent, options.toBundle());
                finish();
            }
        }, SPLASH_SCREEN);
    }
}