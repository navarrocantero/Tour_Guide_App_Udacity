package com.android.driftineo.tourguideapp.model;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.driftineo.tourguideapp.R;

import java.util.ArrayList;

/**
 * Created by driftineo on 20/5/17.
 */

public class TimeAdapter extends ArrayAdapter<Time> {

    private int colorResource;


    public TimeAdapter(Context context, ArrayList<Time> times, int colorResourceId) {
        super(context, 0, times);
        this.colorResource = colorResourceId;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Time currentTime = this.getItem(position);
        View listItemView = convertView;

        if (listItemView == null) {
            if (currentTime.getImageResource() == -1) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list_without_image, parent, false);
            } else {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);
                ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);

                imageView.setImageResource(currentTime.getImageResource());
            }


        }


        TextView modelView = (TextView) listItemView.findViewById(R.id.modelView);
        TextView timeView = (TextView) listItemView.findViewById(R.id.timeView);


        modelView.setText(currentTime.getModel());
        timeView.setText(currentTime.getTime());


        View textContainer = listItemView.findViewById(R.id.textContainer);
        int color = ContextCompat.getColor(getContext(), colorResource);
        textContainer.setBackgroundColor(color);


        return listItemView;
    }
}
