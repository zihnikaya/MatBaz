package com.zihni.matbaz;

import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.zihni.matbaz.addition.AdditionLevel;

public class LevelClick implements View.OnClickListener {

    private MainActivity mainActivity;

    public LevelClick(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View view) {
        int[] location = new int[2];
        view.getLocationOnScreen(location);
        //Toast.makeText(mainActivity, "Xd axis is "+location[0] +"and Y axis is "+location[1], Toast.LENGTH_SHORT).show();
        Toast.makeText(mainActivity, view.getResources().getResourceName(view.getId()), Toast.LENGTH_SHORT).show();

        FrameLayout levelLayout = mainActivity.findViewById(R.id.levelLayout);
        ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) levelLayout.getLayoutParams();
        params.setMargins((location[0]/2)-50, location[1]+100, 0, 0);
        levelLayout.setLayoutParams(params);

        if(levelLayout.getVisibility() == View.VISIBLE) {
            levelLayout.setVisibility(View.GONE);
        } else {
            levelLayout.setVisibility(View.VISIBLE);
        }
    }
}
