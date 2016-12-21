package com.example.csaper6.collegeapp.Presenter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.csaper6.collegeapp.R;

/**
 * Created by csaper6 on 12/9/16.
 */
public class ProfileFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_guardian, container, false);


        EditText editFirstName = (EditText) rootView.findViewById(R.id.firstname);
        EditText editLastName = (EditText) rootView.findViewById(R.id.lastname);
        //do the birthday later




        return rootView;
    }
}
