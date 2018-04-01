package com.volkangurbuz.adviceme.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.volkangurbuz.adviceme.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListAdvicersFragment extends Fragment {

    private static ListAdvicersFragment INSTANCE = null;


    public ListAdvicersFragment() {
        // Required empty public constructor
    }

    public static ListAdvicersFragment getINSTANCE() {
        if(INSTANCE == null)
        INSTANCE = new ListAdvicersFragment();

        return INSTANCE;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_advicers, container, false);
    }

}
