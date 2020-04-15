package com.example.organictest2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class Far_pending_requests extends Fragment
{
    RecyclerView pendingReqRecyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragement_pending_requests, container,false);

        /*
        pendingReqRecyclerView = view.findViewById(R.id.pending_req_recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        pendingReqRecyclerView.setLayoutManager(layoutManager);

        String json;
        InputStream is = null;
        try {
            is = Objects.requireNonNull(getActivity()).getAssets().open("data.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, StandardCharsets.UTF_8);
            Toast.makeText(getActivity(), ""+json, Toast.LENGTH_SHORT).show();
        }
        catch (IOException e)
        {
            Toast.makeText(getActivity(), ""+e, Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }

        */



        return view;
    }
}
