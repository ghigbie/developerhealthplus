package layout;

import android.content.SharedPreferences;
import android.os.Bundle;
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

gitimport android.support.v4.app.Fragment;


public class TimeChooser extends Fragment {

    View view;

    ArrayList<String> timeArrayList;

    private final String pleaseChoose = "Please Select a Time";
    private final String time30String = "30 minutes";
    private final String time45String = "45 minutes";
    private final String time60String = "60 minutes";

    private int time30Int = 30;
    private int time45Int = 45;
    private int time60Int = 60;

    private int notificationTime;
    private int notificationTimeSetterInt;

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

        //this gets time from the spinner to set the notification
        String timeChoiceText = spinner1.getSelectedItem().toString();
        switch(timeChoiceText){
            case time30String:
                notificationTime = time30Int;
                break;
            case time45String:
                notificationTime = time45Int;
                break;
            case time60String:
                notificationTime = time60Int;
                break;
            case pleaseChoose:
                notificationTime = 0;
                break;
            default:
                notificationTime = 0;
                break;
        }

        //this sets the time in the sharedPreferences
        SharedPreferences notificationTimeSetter = getSharedPreferences("timeNotificationFile", 0);
        notificationTimeSetterInt = notificationTimeSetter.getInt("notificationTime", notificationTime);

        SharedPreferences.Editor editor = notificationTimeSetter.edit();
        editor.putInt("notificationTime", notificationTime);
        editor.commit();

    }







}
