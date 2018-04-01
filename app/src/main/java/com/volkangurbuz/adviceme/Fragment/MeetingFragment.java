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
public class MeetingFragment extends Fragment {

    private static MeetingFragment INSTANCE = null;

    public static MeetingFragment getINSTANCE() {
        if (INSTANCE == null){
            INSTANCE = new MeetingFragment();
        }
        return INSTANCE;
    }

    public MeetingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_meeting, container, false);
    }

}
