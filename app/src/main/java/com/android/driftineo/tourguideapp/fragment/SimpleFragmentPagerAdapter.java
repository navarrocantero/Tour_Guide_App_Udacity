package com.android.driftineo.tourguideapp.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.android.driftineo.tourguideapp.R;

/**
 * Created by driftineo on 20/5/17.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    private String tabs[];


    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new Fragment();

        switch (position) {
            case 0:
                fragment = Fragment.instantiate(context, MonteblancoFragment.class.getName());
                break;
            case 1:
                fragment = Fragment.instantiate(context, GrandTourFragment.class.getName());
                break;
            case 2:
                fragment = Fragment.instantiate(context, TopGearFragment.class.getName());
                break;
            case 3:
                fragment = Fragment.instantiate(context, NurburFragment.class.getName());
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getResources().getString(R.string.Top_Gear);
            case 1:
                return context.getResources().getString(R.string.Monteblanco);
            case 2:
                return context.getResources().getString(R.string.Grandtour);
            case 3:
                return context.getResources().getString(R.string.Nurbur);

        }
        return tabs[position];
    }
}
