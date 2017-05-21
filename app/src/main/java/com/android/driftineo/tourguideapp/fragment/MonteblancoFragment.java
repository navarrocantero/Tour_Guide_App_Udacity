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
public class MonteblancoFragment extends Fragment {

    public MonteblancoFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_monteblanco, container, false);

        ArrayList<Time> times = new ArrayList<>();

        times.add(new Time(R.string.Audi_TT, "0:51.37", R.drawable.audir8));
        times.add(new Time(R.string.Renault_megane, "0:54.08", R.drawable.megane));
        times.add(new Time(R.string.BMW_M3, "0:56.20", R.drawable.bmw));
        times.add(new Time(R.string.Alfa_Brera, "0:56.80", R.drawable.alfa));

        ListView listView = (ListView) view.findViewById(R.id.monteblanco_lv);
        TimeAdapter timeAdapter = new TimeAdapter(view.getContext(), times, R.color.monteblancoColor);
        listView.setAdapter(timeAdapter);

        return view;
    }

}
