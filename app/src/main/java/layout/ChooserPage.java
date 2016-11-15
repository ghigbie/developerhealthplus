package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.geogehigbie.developerhealthplus.R;


public class ChooserPage extends Fragment {


    View view;

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflates the layout for this fragment
        view = inflater.inflate(R.layout.fragment_chooser_page, container, false);

        setOnClickListenersOnButtons();

        return view;

    }

    public void setOnClickListenersOnButtons(){

        Button upperBackButton = (Button) view.findViewById(R.id.upper_back);
        Button lowerBackButton = (Button) view.findViewById(R.id.lower_back);
        Button bothBacksButton = (Button) view.findViewById(R.id.both);



        upperBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, new UpperBack());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        lowerBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, new LowerBack());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        bothBacksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, new BothUpperLower());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });





    }





}
