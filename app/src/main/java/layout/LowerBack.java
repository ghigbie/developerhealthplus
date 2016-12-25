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

import com.geogehigbie.developerhealthplus.Exercise;
import com.geogehigbie.developerhealthplus.MainActivity;
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

    private static String gluteAbDescription = "Squeeze your abs and your buttocks and hold for 20 seconds";
    private static String quadHoldDescription = "Stand up, use a desk or wall to maintain your balance, grab your foot, and pull your foot toward your buttocks.";
    private static String psoasStretchDescription = "Stand with a wide stance and stretch the front of your legs.";
    private static String calfStretchDescription = "Stand close to a wall. Push the wall with both hands. ";
    private static String posturalDescription = "Arms Behind the Back Hold";
    private static String[] descriptionArray = {gluteAbDescription, quadHoldDescription, psoasStretchDescription, calfStretchDescription, posturalDescription};

    private static String gluteAbImageURL = "abcd";
    private static String quadHoldImageURL = "abcd";
    private static String psoasStretchImageURL = "abcd";
    private static String calfStretchImageURL = "abcd";
    private static String posturalImageURL= "abcd";
    private static String [] imageURLArray = {gluteAbImageURL, quadHoldImageURL, psoasStretchImageURL, calfStretchImageURL, posturalImageURL};

    private static String gluteAbVideoURL = "abcd";
    private static String quadHoldVideoURL = "abcd";
    private static String psoasStretchVideoURL = "abcd";
    private static String calfStretchVideoURL = "abcd";
    private static String posturalVideoURL= "abcd";
    private static String [] videoURLArray = {gluteAbImageURL, quadHoldImageURL, psoasStretchImageURL, calfStretchImageURL, posturalImageURL};

    private static String type = "lower";

    private static ImageView gluteAbImage;
    private static ImageView quadHoldImage;
    private static ImageView psoasStretchImage;
    private static ImageView calfStretchImage;
    private static ImageView posturalImage;
    private static ImageView[] imageArray = {gluteAbImage, quadHoldImage, psoasStretchImage, calfStretchImage, posturalImage};

    private static int [] imageIntsArray = {R.drawable.video_icon_second, R.drawable.video_icon_second, R.drawable.video_icon_second, R.drawable.video_icon_second};

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
    public static void insertIntoDataBase(){
        String sqlCommand; //this String will be overwritten multiple times and represents all of the commands used for creating the table

       // SQLiteDatabase sqLiteDatabase = MainActivity.sqLiteDatabase;

       // MainActivity.sqLiteDatabase //= getActvity().getBaseContext().openOrCreateDatabase("exercises_all", Context.MODE_PRIVATE, null);

        sqlCommand = "INSERT INTO exercises_all (title, description, imageURL, videoURL) VALUES(";
        for(int a = 0; a < titleArray.length; a++){
            MainActivity.sqLiteDatabase.execSQL(sqlCommand + titleArray[a] + descriptionArray[a] +
                    imageURLArray[a]+ videoURLArray[a] + type +");");
        }

    }


    //creates the lower back exercises
    public void createLowerBackExercises() {

        for (int a = 0; a < exercisesArrayLower.length; a++) {
            imageArray[a] = new ImageView(getContext());
            imageArray[a].setImageResource(R.mipmap.ic_launcher);
           // exercisesArrayLower[a] = new Exercise(titleArray[a], descriptionArray[a], imageArray[a], );
            exerciseArrayListLower.add(exercisesArrayLower[a]);
        }

    }

    public void createCardViews(){


    }

    public String[] getTitleArray() {
        return titleArray;
    }


}
