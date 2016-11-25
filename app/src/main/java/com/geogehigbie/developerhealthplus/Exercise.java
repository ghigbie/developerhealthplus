package com.geogehigbie.developerhealthplus;

import android.widget.ImageView;

/**
 * Created by georgehigbie on 11/13/16.
 */

public class Exercise {

    private String Title;
    private String Description;
    private ImageView ExercsieImage;

    public Exercise(String title, String description, ImageView exercsieImage){

        Title = title;
        Description = description;
        ExercsieImage = exercsieImage;

    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public ImageView getExercsieImage() {
        return ExercsieImage;
    }

    public void setExercsieImage(ImageView exercsieImage) {
        ExercsieImage = exercsieImage;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
