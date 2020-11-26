package com.zihni.matbaz.addition;

import android.content.Intent;
import android.view.View;

public class AdditionGameClick implements View.OnClickListener {
    private AdditionLevel additionLevel;

    public AdditionGameClick(AdditionLevel additionLevel) {
        this.additionLevel = additionLevel;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this.additionLevel, AdditionGame.class);
        this.additionLevel.startActivity(intent);
    }
}
