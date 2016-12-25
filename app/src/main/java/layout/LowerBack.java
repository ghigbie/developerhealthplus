package layout;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

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

    private static String gluteAbTitle = "Glute Ab Contraction";
    private static String quadHoldTitle = "Quad Hold Stretch";
    private static String psoasStretchTitle = "PsoasStretch";
    private static String calfStretchTitle = "Calf Stretch Holds";
    private static String posturalTitle = "Postural Practice (Awareness)";
    public static String[] titleArray = {gluteAbTitle, quadHoldTitle, psoasStretchTitle, calfStretchTitle, posturalTitle};

    private String gluteAbDescription = "Squeeze your abs and your buttocks and hold for 20 seconds";
    private String quadHoldDescription = "Stand up, use a desk or wall to maintain your balance, grab your foot, and pull your foot toward your buttocks.";
    private String psoasStretchDescription = "Stand with a wide stance and stretch the front of your legs.";
    private String calfStretchDescription = "Stand close to a wall. Push the wall with both hands. ";
    private String posturalDescription = "Arms Behind the Back Hold";
    private String[] descriptionArray = {gluteAbDescription, quadHoldDescription, psoasStretchDescription, calfStretchDescription, posturalDescription};

    private String gluteAbImageURL = "abcd";
    private String quadHoldImageURL = "abcd";
    private String psoasStretchImageURL = "abcd";
    private String calfStretchImageURL = "abcd";
    private String posturalImageURL= "abcd";
    private String [] imageURLArray = {gluteAbImageURL, quadHoldImageURL, psoasStretchImageURL, calfStretchImageURL, posturalImageURL};

    private String gluteAbVideoURL = "abcd";
    private String quadHoldVideoURL = "abcd";
    private String psoasStretchVideoURL = "abcd";
    private String calfStretchVideoURL = "abcd";
    private String posturalVideoURL= "abcd";
    private String [] videoURLArray = {gluteAbImageURL, quadHoldImageURL, psoasStretchImageURL, calfStretchImageURL, posturalImageURL};

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



//        CardView card = new CardView(context);
//        card.setCardBackgroundColor(Color.parseColor("#E6E6E6"));
//        card.setMaxCardElevation((float) 0.0);
//        card.setRadius((float) 5.0);
//        card.setClickable(true);
        //card.setForeground(selectableItemBackground);

        // Inflate the layout for this fragment
        createLowerBackExercises();

        listView = (ListView) view.findViewById(R.id.list_view_lower);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                getActivity().getApplicationContext(), android.R.layout.simple_list_item_1, titleArray);

        listView.setAdapter(arrayAdapter);

        insertIntoDataBase();

        return view;



    }
    public void insertIntoDataBase(){
        String sqlCommand; //this String will be overwritten multiple times and represents all of the commands used for creating the table

        SQLiteDatabase sqliteDatabase = getActivity().getBaseContext().openOrCreateDatabase("exercises_all", Context.MODE_PRIVATE, null);

        sqlCommand = "INSERT INTO exercises_all (title, description, imageURL, videoURL) VALUES(";
        for(int a = 0; a < titleArray.length; a++){
            sqliteDatabase.execSQL(sqlCommand + titleArray[a] + descriptionArray[a] + imageURLArray[a]+ videoURLArray + ");");
        }

    }


    //creates the lower back exercises
    public void createLowerBackExercises() {

        for (int a = 0; a < exercisesArrayLower.length; a++) {
            imageArray[a] = new ImageView(getContext());
            imageArray[a].setImageResource(R.mipmap.ic_launcher);
            exercisesArrayLower[a] = new Exercise(titleArray[a], descriptionArray[a], imageArray[a], );
            exerciseArrayListLower.add(exercisesArrayLower[a]);
        }

    }

    public void createCardViews(){


    }

    public String[] getTitleArray() {
        return titleArray;
    }


}
