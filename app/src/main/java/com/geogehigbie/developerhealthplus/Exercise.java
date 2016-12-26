package com.geogehigbie.developerhealthplus;

import android.widget.ImageView;

/**
 * Created by georgehigbie on 11/13/16.
 */

public class Exercise {

    private String Title;
    private String Type;
    private String Description;
    private String ImageURL;
    private String VideoURL;
    private ImageView ExerciseImage;

    public Exercise(String title, String type, String description, String imageURL, String videoURL){ //ImageView exerciseImage){

        this.Title = title;
        this.Type = type;
        this.Description = description;
        this.ImageURL = imageURL;
        this.VideoURL = videoURL;
        this.Type = type;
       // ExerciseImage = exerciseImage;

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

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }

    public String getVideoURL() {
        return VideoURL;
    }

    public void setVideoURL(String videoURL) {
        VideoURL = videoURL;
    }
}
