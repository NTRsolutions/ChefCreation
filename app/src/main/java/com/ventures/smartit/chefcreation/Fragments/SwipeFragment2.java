package com.ventures.smartit.chefcreation.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ventures.smartit.chefcreation.R;

public class SwipeFragment2 extends Fragment {

    int fragVal;

    public static SwipeFragment2 init(int val) {
        SwipeFragment2 swipeFragment2 = new SwipeFragment2();


        // Supply val input as an argument.
        Bundle args = new Bundle();
        args.putInt("val", val);
        swipeFragment2.setArguments(args);

        return swipeFragment2;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragVal = getArguments() != null ? getArguments().getInt("val") : 1;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.swipe_fragment_2, container, false);
        return view;

    }
}
