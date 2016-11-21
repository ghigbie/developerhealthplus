package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.geogehigbie.developerhealthplus.Exercise;
import com.geogehigbie.developerhealthplus.R;


public class UpperBack extends Fragment {

    public static Exercise chinTuck;
    public static Exercise shoulderShrug;
    public static Exercise doorwayStretch;
    public static Exercise neckStretchHold;
    public static Exercise armsBehindBack;
    public static Exercise[] exercisesArrayUpper = {chinTuck, shoulderShrug, doorwayStretch, neckStretchHold, armsBehindBack};

    private String chinTitle = "Chin Tucks";
    private String shoulderTitle = "Shoulder Shrug Holds Push Back";
    private String doorStrecthTitle = "Doorway Stretch";
    private String neckStretchTitle = "Neck Stretch Holds";
    private String armsBehindTitle = "Arms Behind the Back Hold";
    private String[] titleArray = {chinTitle, shoulderTitle, doorStrecthTitle, neckStretchTitle, armsBehindTitle};

    private String chinDescription = "Raise the back of your head as if you were sliding it up a wall.";
    private String shoulderDescription = "Raise your shoulders up toward your ears,then move them back, and then move them down.";
    private String doorStretchDescription = "Hold your arms in a doorway, stretch one of your arms at a time. Do this comfortably.";
    private String neckStretchDescription = "Sit on your left hand and then use your tilt your head by leaning your right ear to your right shoulder. Repeat for you right side";
    private String armsBehindDescription = "Clasp your hands behind your back and hold.";
    private String[] descriptionArray = {chinDescription, shoulderDescription, doorStretchDescription, neckStretchDescription, armsBehindDescription};

    private ImageView chinImage;
    private ImageView shoulderImage;
    private ImageView doorStrechImage;
    private ImageView neckStrechImage;
    private ImageView armsBehindImage;
    private ImageView[] imageArray = {chinImage, shoulderImage, doorStrechImage, neckStrechImage, armsBehindImage};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        createUpperBackExercises();
        return inflater.inflate(R.layout.fragment_upper_back, container, false);
    }


    public void createUpperBackExercises() {

        for (int a = 0; a < exercisesArrayUpper.length; a++) {
            imageArray[a] = new ImageView(getContext());
            imageArray[a].setImageResource(R.mipmap.ic_launcher);
            exercisesArrayUpper[a] = new Exercise(titleArray[a], descriptionArray[a], imageArray[a]);
        }
    }

    public Exercise getArmsBehindBack() {
        return armsBehindBack;
    }

    public String getArmsBehindDescription() {
        return armsBehindDescription;
    }

    public ImageView getArmsBehindImage() {
        return armsBehindImage;
    }

    public String getArmsBehindTitle() {
        return armsBehindTitle;
    }

    public String getChinDescription() {
        return chinDescription;
    }

    public ImageView getChinImage() {
        return chinImage;
    }

    public String getChinTitle() {
        return chinTitle;
    }

    public Exercise getChinTuck() {
        return chinTuck;
    }

    public String[] getDescriptionArray() {
        return descriptionArray;
    }

    public ImageView getDoorStrechImage() {
        return doorStrechImage;
    }

    public String getDoorStrecthTitle() {
        return doorStrecthTitle;
    }

    public String getDoorStretchDescription() {
        return doorStretchDescription;
    }

    public Exercise getDoorwayStretch() {
        return doorwayStretch;
    }

    public Exercise[] getExercisesArrayUpper() {
        return exercisesArrayUpper;
    }

    public ImageView[] getImageArray() {
        return imageArray;
    }

    public ImageView getNeckStrechImage() {
        return neckStrechImage;
    }

    public String getNeckStretchDescription() {
        return neckStretchDescription;
    }

    public Exercise getNeckStretchHold() {
        return neckStretchHold;
    }

    public String getNeckStretchTitle() {
        return neckStretchTitle;
    }

    public String getShoulderDescription() {
        return shoulderDescription;
    }

    public ImageView getShoulderImage() {
        return shoulderImage;
    }

    public Exercise getShoulderShrug() {
        return shoulderShrug;
    }

    public String getShoulderTitle() {
        return shoulderTitle;
    }

    public String[] getTitleArray() {
        return titleArray;
    }
}
