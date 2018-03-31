package com.gym.jin.gymapplication;

import android.view.View;

/**
 * Created by Jin on 3/28/2018.
 */

public class MenuItem {
    private String gymActivity;
    private int imageId;
    private View.OnClickListener onClickListener;

    public MenuItem() {}
    public MenuItem(String gymAcivity, int imageId, View.OnClickListener onClickListener) {
        this.gymActivity = gymAcivity;
        this.imageId  = imageId;
        this.onClickListener = onClickListener;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        imageId = imageId;
    }

    public String getGymActivity() {
        return gymActivity;
    }

    public void setGymActivity(String gymActivity) {
        this.gymActivity = gymActivity;
    }



    public View.OnClickListener getOnClickListener() {
        return onClickListener;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
}
