package com.zihni.matbaz.addition;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.zihni.matbaz.MainActivity;

public class AdditionLevelClick implements View.OnClickListener {

    private MainActivity mainActivity;

    public AdditionLevelClick(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this.mainActivity, AdditionLevel.class);
        this.mainActivity.startActivity(intent);
    }
}
