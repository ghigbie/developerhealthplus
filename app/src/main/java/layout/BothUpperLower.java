package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geogehigbie.developerhealthplus.Exercise;
import com.geogehigbie.developerhealthplus.R;

import static layout.LowerBack.exercisesArrayLower;
import static layout.UpperBack.exercisesArrayUpper;


public class BothUpperLower extends Fragment {

    public Exercise[] exercisesArrayBoth = new Exercise[exercisesArrayUpper.length + exercisesArrayLower.length];

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        createBothUpperLowerExercises();

        return inflater.inflate(R.layout.fragment_both_upper_lower, container, false);
    }

    public void createBothUpperLowerExercises() {
        for (int a = 0; a < exercisesArrayUpper.length; a++){
            exercisesArrayBoth[a] = exercisesArrayUpper[a];
        }

        for (int b = (exercisesArrayUpper.length -1); b < exercisesArrayLower.length; b++){
            exercisesArrayBoth[b] = exercisesArrayBoth[b];
        }
    }




}
