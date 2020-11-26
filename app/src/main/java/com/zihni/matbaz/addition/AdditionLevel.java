package com.zihni.matbaz.addition;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.zihni.matbaz.R;

public class AdditionLevel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_level);
        ImageButton btn_start_game = findViewById(R.id.btn_start_game);
        btn_start_game.setOnClickListener(new AdditionGameClick(this));
    }
}
