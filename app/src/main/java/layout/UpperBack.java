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

    private Exercise chinTuck;
    private Exercise shoulderShrug;
    private Exercise doorwayStretch;
    private Exercise neckStretchHold;
    private Exercise armsBehindBack;
    private Exercise[] exercisesArray = {chinTuck, shoulderShrug, doorwayStretch, neckStretchHold, armsBehindBack};

    private String chinTitle = "Chin Tucks";
    private String shoulderTitle = "Shoulder Shrug Holds Push Back";
    private String doorStrecthTitle = "Doorway Stretch";
    private String neckStretchTitle = "Neck Stretch Holds";
    private String armsBehindTitle = "Arms Behind the Back Hold";
    private String[] titleArray = {chinTitle, shoulderTitle, doorStrecthTitle, neckStretchTitle, armsBehindTitle};

    private String chinDescription = "Chin Tucks";
    private String shoulderDescription = "Shoulder Shrug Holds Push Back";
    private String doorStretchDescription = "Doorway Stretch";
    private String neckStretchDescription = "Neck Stretch Holds";
    private String armsBehindDescription = "Arms Behind the Back Hold";
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


    public void createUpperBackExercises(){

        for(int a = 0; a < exercisesArray.length; a++){
            exercisesArray[a] = new Exercise(titleArray[a], descriptionArray[a], imageArray[a]);
        }



//        Exercise chinTuck = new Exercise(chinTitle, chinDescription, chinImage);
//        Exercise shoulderShrug = new Exercise(shoulderTitle, );
//        Exercise doorwayStretch = new Exercise();
//        Exercise neckStretchHold = new Exercise();
//        Exercise armsBehindBack = new Exercise();

    }


}
