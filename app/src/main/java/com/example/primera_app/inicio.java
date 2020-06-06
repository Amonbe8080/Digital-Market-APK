package com.example.primera_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        ImageView imageView = (ImageView) findViewById(R.id.loadingGif);
        Glide.with(this).load(R.drawable.loading).into(imageView);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent i = new Intent(inicio.this, MainActivity.class);
                startActivity(i);
            }
        }, 3000);


    }
}
