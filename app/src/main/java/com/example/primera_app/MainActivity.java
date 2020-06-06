package com.example.primera_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next_registro(View view){
        Intent i = new Intent(this, registroClass.class);
        startActivity(i);
    }

    public void next_main(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void next_home(View view){
        Intent i = new Intent(this, homeClass.class);
        startActivity(i);
    }

    public void next_menu(View view){
        Intent i = new Intent(this, menu.class);
        startActivity(i);
    }
}
