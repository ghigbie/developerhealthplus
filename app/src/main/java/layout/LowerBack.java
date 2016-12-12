package layout;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.geogehigbie.developerhealthplus.CustomAdapter;
import com.geogehigbie.developerhealthplus.Exercise;
import com.geogehigbie.developerhealthplus.R;

import java.util.ArrayList;
import java.util.List;

public class LowerBack extends Fragment {

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

    private int [] imageIntsArray = {R.drawable.video_icon_second, R.drawable.video_icon_second, R.drawable.video_icon_second, R.drawable.video_icon_second};

    private View view;
    ListView listView;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view =  inflater.inflate(R.layout.fragment_lower_back, container, false);
        context = getActivity().getApplicationContext();

        // Inflate the layout for this fragment
        createLowerBackExercises();

        listView = (ListView) view.findViewById(R.id.list_view_lower);
        ArrayAdapter<Exercise> arrayAdapter = new ArrayAdapter<Exercise>(
                getActivity().getApplicationContext(), R.layout.row_layout_for_use);

        listView.setAdapter(new CustomAdapter(context, titleArray, imageIntsArray));

        return inflater.inflate(R.layout.fragment_lower_back, container, false);



    }

    public void createLowerBackExercises() {

        for (int a = 0; a < exercisesArrayLower.length; a++) {
            imageArray[a] = new ImageView(getContext());
            imageArray[a].setImageResource(R.mipmap.ic_launcher);
            exercisesArrayLower[a] = new Exercise(titleArray[a], descriptionArray[a], imageArray[a]);
            exerciseArrayListLower.add(exercisesArrayLower[a]);
        }

    }



}
