package com.example.popescu.cluj_napoca;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by POPESCU on 9/4/2017.
 */

class CategoryAdapter extends FragmentPagerAdapter {

    private final Context mContext;

    CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AttractionsFragment();
            case 1:
                return new FestivalFragment();
            case 2:
                return new HotelsFragment();
            case 3:
                return new RestaurantsFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.attractions_tab_name);
            case 1:
                return mContext.getString(R.string.festivals_tab_name);
            case 2:
                return mContext.getString(R.string.hotel_tab_name);
            case 3:
                return mContext.getString(R.string.food_tab_name);
        }
        return null;
    }
}