package com.example.newsapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
 int tabcount;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount= behavior;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new Homefragement();
            case 1:
                return new Sportfragement();
            case 2:
                return new Healthfragement();
            case 3:
                return new Sciencefragement();
            case 4:
                return new entertainmentfragement();
            case 5:
                return new techfragement();
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
