package com.example.organictest2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

class SubcriptionViewPager extends FragmentPagerAdapter
{
    private List<Fragment> fragments = new ArrayList<>();
    private List<String> titles = new ArrayList<>();


    SubcriptionViewPager(@NonNull FragmentManager fm, int behavior)
    {
        super(fm, behavior);
    }

    void addfragement(Fragment fragment, String title)
    {
        fragments.add(fragment);
        titles.add(title);
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }
}