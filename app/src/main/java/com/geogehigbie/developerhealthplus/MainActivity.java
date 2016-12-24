package com.geogehigbie.developerhealthplus;

import android.app.ActionBar;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import layout.LowerBack;
import layout.TimeChooser;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        centerActionBar(); //this method has a soft error

        setOnClickMethod(); //sets the button's onClick Listener
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

    }


    public void createDatabase(){
        String sqlCommand; //this String will be overwritten mutiple times and represents all of the commands used for creating the table

        SQLiteDatabase sqLiteDatabase = getBaseContext().openOrCreateDatabase("exercises_all", MODE_PRIVATE, null);
        sqlCommand = "DROP TABLE IF EXISTS exercises_all";
        sqLiteDatabase.execSQL(sqlCommand);

        sqlCommand = "CREATE TABLE IF NOT EXISTS exercises_all(id INTEGER PRIMARY KEY, name TEXT, type TEXT, " +
                "instructions TEXT, video_link TEXT, image_link TEXT)";
        sqLiteDatabase.execSQL(sqlCommand);

        sqlCommand = "INSERT INTO TABLE exercises all(1," + LowerBack.lo

    }




}
