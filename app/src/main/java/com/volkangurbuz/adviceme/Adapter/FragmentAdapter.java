package com.volkangurbuz.adviceme.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.volkangurbuz.adviceme.Fragment.ArticlesFragment;
import com.volkangurbuz.adviceme.Fragment.ListAdvicersFragment;
import com.volkangurbuz.adviceme.Fragment.MeetingFragment;

/**
 * Created by VolkanGurbuz on 3/2/2018.
 */

public class FragmentAdapter extends FragmentPagerAdapter {
    private Context context;

    public FragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;

    }



    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:return MeetingFragment.getINSTANCE();
            case 1: return ListAdvicersFragment.getINSTANCE();
            case 2: return ArticlesFragment.getINSTANCE();

            default:
                return null;

        }
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "Meetings";
            case 1:
                return "Advicers";

            case 2:
               return "Articles";

        }
        return "";
    }

    @Override
    public int getCount() {
        return 3;
    }
}
