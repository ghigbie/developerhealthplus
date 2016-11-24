package com.geogehigbie.developerhealthplus;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by georgehigbie on 11/24/16.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {


    public static Exercise gluteAbContractions;
    public static Exercise quadHoldStretch;
    public static Exercise poasStrech;
    public static Exercise calfStrech;
    public static Exercise posturalPractice;
    public static Exercise[] exercisesArrayLower = {gluteAbContractions, quadHoldStretch, poasStrech, calfStrech, posturalPractice};

    public static List<Exercise> exerciseArrayListLower = new ArrayList<Exercise>();

    private String gluteAbTitle = "Glute Ab Contraction";
    private String quadHoldTitle = "Quad Hold Stretch";
    private String psoasStretchTitle = "PsoasStretch";
    private String calfStretchTitle = "Calf Stretch Holds";
    private String posturalTitle = "Postural Practice (Awareness)";
    private String[] titleArray = {gluteAbTitle, quadHoldTitle, psoasStretchTitle, calfStretchTitle, posturalTitle};

    private String gluteAbDescription = "Squeeze your abs and your buttocks and hold for 20 seconds";
    private String quadHoldDescription = "Stand up, use a desk or wall to maintain your balance, grab your foot, and pull your foot toward your buttocks.";
    private String psoasStretchDescription = "Stand with a wide stance and stretch the front of your legs.";
    private String calfStretchDescription = "Stand close to a wall. Push the wall with both hands. ";
    private String posturalDescription = "Arms Behind the Back Hold";
    private String[] descriptionArray = {gluteAbDescription, quadHoldDescription, psoasStretchDescription, calfStretchDescription, posturalDescription};

    private ImageView gluteAbImage;
    private ImageView quadHoldImage;
    private ImageView psoasStretchImage;
    private ImageView calfStretchImage;
    private ImageView posturalImage;
    private ImageView[] imageArray = {gluteAbImage, quadHoldImage, psoasStretchImage, calfStretchImage, posturalImage};


    class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDescription;


        public ViewHolder(View itemView){
            super(itemView);

            itemImage = (ImageView) itemView.findViewById(R.id.card_image);
            itemTitle = (TextView) itemView.findViewById(R.id.card_title);
            itemDescription = (TextView) itemView.findViewById(R.id.card_description);

        }
    }
}
