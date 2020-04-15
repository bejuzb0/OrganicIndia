package com.example.organictest2;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class SubscriptionFragment extends Fragment {

    private Button addNew;


    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_subscription,container,false);

        addNew = view.findViewById(R.id.addNewSubscription);
        addNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Add new subscription", Toast.LENGTH_SHORT).show();
            }
        });


        ViewPager viewPager = view.findViewById(R.id.viewPager_subscription);
        TabLayout tabLayout = view.findViewById(R.id.tabLayout);

        tabLayout.setupWithViewPager(viewPager);

        Far_manage_existing manage_existing = new Far_manage_existing();
        Far_pending_requests pending_requests = new Far_pending_requests();

        SubcriptionViewPager viewPagerAdapter = new SubcriptionViewPager(getChildFragmentManager(),0);
        viewPagerAdapter.addfragement(pending_requests,"Pending Requests");
        viewPagerAdapter.addfragement(manage_existing,"Manage Existing");
        viewPager.setAdapter(viewPagerAdapter);




        return view;
        
    }
}
