package com.example.organictest2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
/* Aditya Kumar
    Uses class Order_Subscription and Order_OneTime, PagerAdapter
    The XML File for this is fragment_order.xml
    Mainly contains Generation of Tabs and ViewPager code

 */
import com.google.android.material.tabs.TabLayout;

public class OrderFragment extends Fragment implements Order_Subscription.onFragmentInteractionListener, Order_OneTime.onFragmentInteractionListener {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_order,container,false);
        TabLayout tabLayout = (TabLayout)rootView.findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Subscription"));
        tabLayout.addTab(tabLayout.newTab().setText("One Time"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager)rootView.findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter(getFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return rootView;

    }
}