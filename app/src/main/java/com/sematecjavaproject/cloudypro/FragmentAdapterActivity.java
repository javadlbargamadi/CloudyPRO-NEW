package com.sematecjavaproject.cloudypro;

import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapterActivity extends FragmentPagerAdapter {

    TodayFragment todayFragment;
    NextSevenDaysFragment nextSevenDaysFragment;
    TodayFragment todayFragment_default;

    public FragmentAdapterActivity(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                todayFragment = new TodayFragment();
                return todayFragment;
            case 1:
                nextSevenDaysFragment = new NextSevenDaysFragment();
                return nextSevenDaysFragment;
            default:
                todayFragment_default = new TodayFragment();
                return todayFragment_default;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "Today";
            case 1:
                return "Next 7 Days";
            default:
                return "Unknown Fragment";
        }
    }
}