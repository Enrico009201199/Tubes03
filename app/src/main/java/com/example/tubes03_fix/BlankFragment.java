package com.example.tubes03_fix;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tubes03_fix.Mangalist;
import com.example.tubes03_fix.RecyclerAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerAdapter adapter;
    ArrayList<Mangalist> list=new ArrayList<>();
    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_blank, container, false);
        recyclerView=(RecyclerView)view.findViewById(R.id.recyclerView);
        adapter=new RecyclerAdapter();
        return view;
    }

}
