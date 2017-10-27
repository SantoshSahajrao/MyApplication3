package com.example.ravi.myapplication;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by ravi on 27/10/17.
 */

public class MyPager extends FragmentStatePagerAdapter {
    public MyPager(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new MyfirstDemo();
            case 1:
                return new MySecondDemo();
            case 2:
                return new MyThridDemo();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "fra1";
            case 1:
                return "fra2";
            case 2:
                return "fra3";
        }

        return null;
    }
}