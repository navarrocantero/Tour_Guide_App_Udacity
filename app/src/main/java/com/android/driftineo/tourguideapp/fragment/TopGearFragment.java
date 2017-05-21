package com.android.driftineo.tourguideapp.fragment;


import android.support.v4.app.Fragment;
import android.os.Bundle;
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
public class TopGearFragment extends Fragment {
    public static final String NAME = "Top Gear";

    public TopGearFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_topgear, container, false);

        ArrayList<Time> times = new ArrayList<>();

        times.add(new Time(R.string.Mclaren_67t, "01:13.7"));
        times.add(new Time(R.string.Pagani_Huayra, "01:13.8"));
        times.add(new Time(R.string.Bac_Mono, "01:14.3"));

        ListView listView = (ListView) view.findViewById(R.id.topgear_lv);
        TimeAdapter timeAdapter = new TimeAdapter(view.getContext(), times, R.color.topGearColor);
        listView.setAdapter(timeAdapter);

        return view;
    }
    public String getNAME() {

        return getResources().getString(R.string.Top_Gear);
    }

}
