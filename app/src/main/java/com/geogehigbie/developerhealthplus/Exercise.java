package com.geogehigbie.developerhealthplus;

import android.widget.ImageView;

/**
 * Created by georgehigbie on 11/13/16.
 */

public class Exercise {

    private String Title;
    private String Description;
    private ImageView ExerciseImage;

    public Exercise(String title, String description, ImageView exerciseImage){

        Title = title;
        Description = description;
        ExerciseImage = exerciseImage;


    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public ImageView getExerciseImage() {
        return ExerciseImage;
    }

    public void setExercsieImage(ImageView exerciseImage) {
        ExerciseImage = exerciseImage;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
