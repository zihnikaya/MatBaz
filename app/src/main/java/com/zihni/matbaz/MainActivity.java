package com.zihni.matbaz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.zihni.matbaz.addition.AdditionLevelClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.levelLayout).setVisibility(View.INVISIBLE);
        TextView tvToplama = findViewById(R.id.tvToplama);
        TextView tvCikarma = findViewById(R.id.tvCikarma);
        TextView tvCarpma = findViewById(R.id.tvCarpma);
        TextView tvBolme = findViewById(R.id.tvBolme);
        tvToplama.setOnClickListener(new LevelClick(this));
        tvCikarma.setOnClickListener(new LevelClick(this));
        tvCarpma.setOnClickListener(new LevelClick(this));
        tvBolme.setOnClickListener(new LevelClick(this));
    }
}