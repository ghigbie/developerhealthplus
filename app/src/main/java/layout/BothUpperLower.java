package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geogehigbie.developerhealthplus.Exercise;
import com.geogehigbie.developerhealthplus.R;

import java.util.ArrayList;
import java.util.List;

import static layout.LowerBack.exercisesArrayLower;
import static layout.UpperBack.exercisesArrayUpper;


public class BothUpperLower extends Fragment {

    public static Exercise[] exercisesArrayBoth = new Exercise[exercisesArrayUpper.length + exercisesArrayLower.length];
    public static List<Exercise> exercisesArrayListBoth = new ArrayList<Exercise>();

    public View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_both_upper_lower, container, false);



        createBothUpperLowerExercises();

        return view;
    }

    public void createBothUpperLowerExercises() {
        for (int a = 0; a < exercisesArrayUpper.length; a++){
            exercisesArrayBoth[a] = exercisesArrayUpper[a];
            exercisesArrayListBoth.add(exercisesArrayBoth[a]);
        }

        for (int b = (exercisesArrayUpper.length -1); b < exercisesArrayLower.length; b++){
            exercisesArrayBoth[b] = exercisesArrayBoth[b];
            exercisesArrayListBoth.add(exercisesArrayBoth[b]);
        }
    }




}
