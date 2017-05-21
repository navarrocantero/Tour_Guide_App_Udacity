package com.android.driftineo.tourguideapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.android.driftineo.tourguideapp.R;
import com.android.driftineo.tourguideapp.model.Time;
import com.android.driftineo.tourguideapp.model.TimeAdapter;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class NurburFragment extends Fragment {

    public static final String NAME = "Nurbur";

    public NurburFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nurbur, container, false);

        ArrayList<Time> times = new ArrayList<>();

        times.add(new Time(R.string.NextEV, "6:45.90"));
        times.add(new Time(R.string.Radical, "6:48.00"));

        ListView listView = (ListView) view.findViewById(R.id.nurbur_lv);
        TimeAdapter timeAdapter = new TimeAdapter(view.getContext(), times, R.color.nurburColor);
        listView.setAdapter(timeAdapter);

        return view;
    }

    public String getNAME() {

        return getResources().getString(R.string.Nurbur);
    }

}
