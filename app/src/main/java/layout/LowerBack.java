package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.geogehigbie.developerhealthplus.Exercise;
import com.geogehigbie.developerhealthplus.R;

public class LowerBack extends Fragment {

    private Exercise gluteAbContractions;
    private Exercise quadHoldStretch;
    private Exercise poasStrech;
    private Exercise calfStrech;
    private Exercise posturalPractice
    private Exercise[] exercisesArray = {gluteAbContractions, quadHoldStretch, poasStrech, calfStrech, posturalPractice;

    private String gluteAbTitle = "Glute Ab Contraction";
    private String quadHoldTitle = "Quad Hold Stretch";
    private String psoasStretchTitle = "PsoasStretch";
    private String calfStretchTitle = "Calf Stretch Holds";
    private String posturalTitle = "Postural Practice (Awareness)";
    private String[] titleArray = {gluteAbTitle, quadHoldTitle, psoasStretchTitle, calfStretchTitle, posturalTitle};

    private String gluteAbDescription = "Chin Tucks";
    private String quadHoldDescription = "Shoulder Shrug Holds Push Back";
    private String psoasStretchDescription = "Doorway Stretch";
    private String calfStretchDescription = "Neck Stretch Holds";
    private String posturalDescription = "Arms Behind the Back Hold";
    private String[] descriptionArray = {gluteAbDescription, quadHoldDescription, psoasStretchDescription, calfStretchDescription, posturalDescription};

    private ImageView gluteAbImage;
    private ImageView quadHoldImage;
    private ImageView psoasStretchImage;
    private ImageView calfStretchImage;
    private ImageView posturalImage;
    private ImageView[] imageArray = {gluteAbImage, quadHoldImage, psoasStretchImage, calfStretchImage, posturalImage};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        createUpperBackExercises();
        return inflater.inflate(R.layout.fragment_lower_back, container, false);


    }

    public void createUpperBackExercises(){

        for(int a = 0; a < exercisesArray.length; a++){
            exercisesArray[a] = new Exercise(titleArray[a], descriptionArray[a], imageArray[a]);
        }



}
