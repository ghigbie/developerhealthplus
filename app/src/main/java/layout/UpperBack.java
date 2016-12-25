package layout;

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


public class UpperBack extends Fragment {

    public static Exercise chinTuck;
    public static Exercise shoulderShrug;
    public static Exercise doorwayStretch;
    public static Exercise neckStretchHold;
    public static Exercise armsBehindBack;
    public static Exercise[] exercisesArrayUpper = {chinTuck, shoulderShrug, doorwayStretch, neckStretchHold, armsBehindBack};

    public static List<Exercise> exerciseArrayListUpper = new ArrayList<Exercise>();

    private static String chinTitle = "Chin Tucks";
    private static String shoulderTitle = "Shoulder Shrug Holds Push Back";
    private static String doorStrecthTitle = "Doorway Stretch";
    private static String neckStretchTitle = "Neck Stretch Holds";
    private static String armsBehindTitle = "Arms Behind the Back Hold";
    private static String[] titleArray = {chinTitle, shoulderTitle, doorStrecthTitle, neckStretchTitle, armsBehindTitle};

    private static String chinDescription = "Raise the back of your head as if you were sliding it up a wall.";
    private static String shoulderDescription = "Raise your shoulders up toward your ears,then move them back, and then move them down.";
    private static String doorStretchDescription = "Hold your arms in a doorway, stretch one of your arms at a time. Do this comfortably.";
    private static String neckStretchDescription = "Sit on your left hand and then use your tilt your head by leaning your right ear to your right shoulder. Repeat for you right side";
    private static String armsBehindDescription = "Clasp your hands behind your back and hold.";
    private static String[] descriptionArray = {chinDescription, shoulderDescription, doorStretchDescription, neckStretchDescription, armsBehindDescription};

    private static String chinImageURL = "abcd";
    private static String shoulderImageURL = "abcd";
    private static String doorStrecthImageURL = "abcd";
    private static String neckStretchImageURL = "abcd";
    private static String armsBehindImageURL = "abcd";
    private static String[] imageURLArray = {chinImageURL, shoulderImageURL, doorStrecthImageURL, neckStretchImageURL, armsBehindImageURL};

    private static String chinVideoURL = "abcd";
    private static String shoulderVideoURL = "abcd";
    private static String doorStrecthVideoURL = "abcd";
    private static String neckStretchVideoURL = "abcd";
    private static String armsBehindVideoURL = "abcd";
    private static String[] videoURLArray = {chinVideoURL, shoulderVideoURL, doorStrecthVideoURL, neckStretchVideoURL, armsBehindVideoURL};

    private static ImageView chinImage;
    private static ImageView shoulderImage;
    private static ImageView doorStrechImage;
    private static ImageView neckStrechImage;
    private static ImageView armsBehindImage;
    private static ImageView[] imageArray = {chinImage, shoulderImage, doorStrechImage, neckStrechImage, armsBehindImage};

    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        createUpperBackExercises();
        view = inflater.inflate(R.layout.fragment_upper_back, container, false);

        ListView listView = (ListView) view.findViewById(R.id.list_view_upper);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                getActivity().getApplicationContext(), android.R.layout.simple_list_item_1, titleArray);

        listView.setAdapter(arrayAdapter);

        insertIntoDataBase();

        return view;
    }


    public static void insertIntoDataBase(){
        String sqlCommand; //this String will be overwritten multiple times and represents all of the commands used for creating the table

       // SQLiteDatabase sqliteDatabase = getActivity().getBaseContext().openOrCreateDatabase("exercises_all", Context.MODE_PRIVATE, null);

        sqlCommand = "INSERT INTO exercises_all (title, description, imageURL, videoURL) VALUES(";
        for(int a = 0; a < titleArray.length; a++){
            MainActivity.sqLiteDatabase.execSQL(sqlCommand + titleArray[a] + descriptionArray[a] + imageURLArray[a]+ videoURLArray + ");");
        }

    }


    public void createUpperBackExercises() {

        for (int a = 0; a < exercisesArrayUpper.length; a++) {
            imageArray[a] = new ImageView(getContext());
            imageArray[a].setImageResource(R.mipmap.ic_launcher);
            //exercisesArrayUpper[a] = new Exercise(titleArray[a], descriptionArray[a], imageArray[a]);
            exerciseArrayListUpper.add(exercisesArrayUpper[a]);
        }
    }

    public String[] getTitleArray() {
        return titleArray;
    }
}

