package com.geogehigbie.developerhealthplus;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import layout.ChooserPage;
import layout.TimeChooser;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    private String time30String = "30 minutes";
    private String time45String = "45 minutes";
    private String time60String = "60 minutes";

    private int time30Int = 30;
    private int time45Int = 45;
    private int time60Int = 60;

    List<String> timeArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        centerActionBar();
        setSpinnerContent();
    }

    public void centerActionBar(){

        ActionBar actionBar = getActionBar();

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM); //this is a soft error
        getSupportActionBar().setCustomView(R.layout.actionbar);

    }

    public void onClickImprove(View view){

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, new TimeChooser());
        fragmentTransaction.commit();

    }

    public void setSpinnerContent(){

        //initializes the array list and adds times to it
        timeArrayList = new ArrayList<String>();
        timeArrayList.add(time30String);
        timeArrayList.add(time45String);
        timeArrayList.add(time60String);

        //declares the spinner and uses the adapter to add itmes to it.
        Spinner spinner = (Spinner) findViewById(R.id.spinner_time);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, timeArrayList);
        spinner.setAdapter(adapter);
    }

    public void onClickTimeSelectionSet(){

        fragmentTransaction.replace(R.id.fragment_container, new ChooserPage());
        fragmentTransaction.commit();

    }

}
