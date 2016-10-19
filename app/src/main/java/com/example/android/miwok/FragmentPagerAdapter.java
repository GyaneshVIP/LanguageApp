package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by Workspace on 10/19/2016.
 */

public class FragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {
    private String tabTitles[] = new String[] { "Color", "Family", "Number","Phrases" };
    final int PAGE_COUNT = 4;
    private Context context;

    public FragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    public FragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
     if(position==0){
       return  new ColorFragment();
     }
        else if(position==1){
        return new FamilyFragment();
     }
        else if(position==2){
       return   new NumberFragment();
     }
      return   new PhrasesFragment();
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }


}
