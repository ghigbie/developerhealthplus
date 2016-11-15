package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.geogehigbie.developerhealthplus.R;

import java.util.ArrayList;


public class TimeChooser extends Fragment {

    View view;

    ArrayList<String> timeArrayList;

    private String pleaseChoose = "Please Select a Time";
    private String time30String = "30 minutes";
    private String time45String = "45 minutes";
    private String time60String = "60 minutes";

    private int time30Int = 30;
    private int time45Int = 45;
    private int time60Int = 60;

    private String[] timeArray = {pleaseChoose, time30String, time45String, time60String};

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_time_chooser, container, false);

        setSpinnerContent();

        //finds setTimeButton and adds onClick listener
        Button timeSetButton = (Button) view.findViewById(R.id.time_selected_button);
        timeSetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, new ChooserPage());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        return view;

    }

    public void setSpinnerContent(){

        //initializes the array list and adds times to it
        timeArrayList = new ArrayList<String>();
        for(int a = 0; a < timeArray.length; a++){
            timeArrayList.add(timeArray[a]);
        }

        //declares the spinner and uses the adapter to add items to it.
        Spinner spinner1 = (Spinner) view.findViewById(R.id.spinner_time);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), R.layout.spinner_item, timeArrayList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
    }






}
