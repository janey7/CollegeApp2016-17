package com.example.csaper6.collegeapp.Presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.csaper6.collegeapp.Model.Guardians;
import com.example.csaper6.collegeapp.R;

/**
 * Created by csaper6 on 12/9/16.
 */
public class GuardianFragment extends Fragment {
    @Nullable//warning you that one of the parameters could be null.
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //call the superclass and to the stuff
        super.onCreateView(inflater, container, savedInstanceState);
        //create a rootView to inflate your fragment's layout
        View rootView = inflater.inflate(R.layout.fragment_guardian, container, false);


        //wire our widgets
        EditText editFirstName = (EditText) rootView.findViewById(R.id.firstname);
        EditText editLastName = (EditText) rootView.findViewById(R.id.lastname);
        EditText editOccupation = (EditText) rootView.findViewById(R.id.occupation);

        //get information from the model layer
        Guardians g = new Guardians("Memeers", "Spoopy", "bedbug", 40);


        //put the information in the view layer
        //set the text for your editTexts with the info you get from the object you made
        editFirstName.setText(g.getFirstName());
        editLastName.setText(g.getLastName());
        editOccupation.setText(g.getOccupation());

        return rootView;
    }
}
