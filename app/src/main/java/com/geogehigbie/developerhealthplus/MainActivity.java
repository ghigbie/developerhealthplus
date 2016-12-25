package com.geogehigbie.developerhealthplus;

import android.app.ActionBar;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import layout.LowerBack;
import layout.TimeChooser;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    public static SQLiteDatabase sqLiteDatabase;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        centerActionBar(); //this method has a soft error

        setOnClickMethod(); //sets the button's onClick Listener

        //createExercises();

        createDatabase();
    }


    public void centerActionBar(){

        ActionBar actionBar = getActionBar();

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM); //this is a soft error
        getSupportActionBar().setCustomView(R.layout.actionbar);

    }


    public void setOnClickMethod(){

        Button buttonImprove = (Button) findViewById(R.id.improve);
        buttonImprove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.fragment_container, new TimeChooser());
                fragmentTransaction.addToBackStack(null); //david done fixed this
                fragmentTransaction.commit();
            }
        });

    }

    public void createExercises(){
        String gluteAbTitle = "Glute Ab Contraction";
        String quadHoldTitle = "Quad Hold Stretch";
        String psoasStretchTitle = "PsoasStretch";
        String calfStretchTitle = "Calf Stretch Holds";
        String posturalTitle = "Postural Practice (Awareness)";
        String[] titleArray = {gluteAbTitle, quadHoldTitle, psoasStretchTitle, calfStretchTitle, posturalTitle};

        String gluteAbDescription = "Squeeze your abs and your buttocks and hold for 20 seconds";
        String quadHoldDescription = "Stand up, use a desk or wall to maintain your balance, grab your foot, and pull your foot toward your buttocks.";
        String psoasStretchDescription = "Stand with a wide stance and stretch the front of your legs.";
        String calfStretchDescription = "Stand close to a wall. Push the wall with both hands. ";
        String posturalDescription = "Arms Behind the Back Hold";
        String[] descriptionArray = {gluteAbDescription, quadHoldDescription, psoasStretchDescription, calfStretchDescription, posturalDescription};

        String gluteAbImageURL = "abcd";
        String quadHoldImageURL = "abcd";
        String psoasStretchImageURL = "abcd";
        String calfStretchImageURL = "abcd";
        String posturalImageURL= "abcd";
        String [] imageURLArray = {gluteAbImageURL, quadHoldImageURL, psoasStretchImageURL, calfStretchImageURL, posturalImageURL};

        String gluteAbVideoURL = "abcd";
        String quadHoldVideoURL = "abcd";
        String psoasStretchVideoURL = "abcd";
        String calfStretchVideoURL = "abcd";
        String posturalVideoURL= "abcd";
        String [] videoURLArray = {gluteAbImageURL, quadHoldImageURL, psoasStretchImageURL, calfStretchImageURL, posturalImageURL};

        int [] imageIntsArray = {R.drawable.video_icon_second, R.drawable.video_icon_second, R.drawable.video_icon_second, R.drawable.video_icon_second};

    }


    public void createDatabase(){
        String sqlCommand; //this String will be overwritten multiple times and represents all of the commands used for creating the table

        sqLiteDatabase = getBaseContext().openOrCreateDatabase("sqlite-db", MODE_PRIVATE, null);
        sqlCommand = "DROP TABLE IF EXISTS exercises_all";
        sqLiteDatabase.execSQL(sqlCommand);

        sqlCommand = "CREATE TABLE IF NOT EXISTS exercises_all(id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, type TEXT, " +
                "description TEXT, image_link TEXT, video_link TEXT)";
        sqLiteDatabase.execSQL(sqlCommand);

       // sqlCommand = "INSERT INTO TABLE exercises all(1";

    }




}
