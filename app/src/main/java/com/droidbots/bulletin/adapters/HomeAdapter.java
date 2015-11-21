package com.droidbots.bulletin.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.droidbots.bulletin.fragments.NoticeFragment;
import com.droidbots.bulletin.fragments.EventFragment;


public class HomeAdapter extends FragmentPagerAdapter {

    private static final String[] TITLES = new String[] {
            "EVENTS",
            "NOTICES",
            "CHAT"
    };

    public HomeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return EventFragment.newInstance(position); // blue

            default:
                return NoticeFragment.newInstance(position); // green
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES[position];
    }
}