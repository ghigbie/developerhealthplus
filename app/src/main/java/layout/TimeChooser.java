package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.geogehigbie.developerhealthplus.R;

import java.util.ArrayList;


public class TimeChooser extends Fragment {

    View view;

    ArrayList<String> timeArrayList;

    private String time30String = "30 minutes";
    private String time45String = "45 minutes";
    private String time60String = "60 minutes";




    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_time_chooser, container, false);

        setSpinnerContent();

        return view;
    }

    public void setSpinnerContent(){

        //initializes the array list and adds times to it
        timeArrayList = new ArrayList<String>();
        timeArrayList.add(time30String);
        timeArrayList.add(time45String);
        timeArrayList.add(time60String);

        //declares the spinner and uses the adapter to add items to it.
        Spinner spinner1 = (Spinner) view.findViewById(R.id.spinner_time);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item, timeArrayList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter); //setting the adapter is causing crashing
    }




}
