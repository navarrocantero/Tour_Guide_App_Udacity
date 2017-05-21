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
public class GrandTourFragment extends Fragment {

    public static final String NAME = "Grand Tour";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_grandtour, container, false);

        ArrayList<Time> times = new ArrayList<>();

        times.add(new Time(R.string.Mclaren_650, "1:17.90", R.drawable.mclaren));
        times.add(new Time(R.string.Audi_R8, "1:19.20", R.drawable.audir8));
        times.add(new Time(R.string.Porsche_911, "1:20.40", R.drawable.porsche));

        ListView listView = (ListView) view.findViewById(R.id.grandTour_lv);
        TimeAdapter timeAdapter = new TimeAdapter(view.getContext(), times, R.color.grandTourColor);
        listView.setAdapter(timeAdapter);

        return view;
    }


}
