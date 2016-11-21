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

    public static Exercise gluteAbContractions;
    public static Exercise quadHoldStretch;
    public static Exercise poasStrech;
    public static Exercise calfStrech;
    public static Exercise posturalPractice;
    public static Exercise[] exercisesArrayLower = {gluteAbContractions, quadHoldStretch, poasStrech, calfStrech, posturalPractice};

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


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        createUpperBackExercises();
        return inflater.inflate(R.layout.fragment_lower_back, container, false);


    }

    public void createUpperBackExercises() {

        for (int a = 0; a < exercisesArrayLower.length; a++) {
            imageArray[a] = new ImageView(getContext());
            imageArray[a].setImageResource(R.mipmap.ic_launcher);
            exercisesArrayLower[a] = new Exercise(titleArray[a], descriptionArray[a], imageArray[a]);
        }

    }



}
