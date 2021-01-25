package com.saberi.myenglishnewsagency;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(@NonNull FragmentManager fm ) {
        super(fm);
        Log.e("getItem","The_Fragment_That_is_created  ");

    }

    @NonNull
    @Override
    public Fragment getItem(int i) {

         Log.e("getItem","The_Fragment_That_is_created  "+i);
        MainLayoutFragment frag = new MainLayoutFragment(i);
        return frag;

    }

    @Override
    public int getCount() {
        return 10;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
//        return super.getPageTitle(position);
        if (position == 0)
            return "US";
        else if (position == 1)
            return "US health News";  //ary-news
        else if (position == 2)
            return "ABC News";  //bbc-news
        else if (position == 3)
            return "BBC Sport"; //bbc-sport
        else if (position == 4)
            return "USA Today";    //cnbc
        else if (position == 5)
            return "CNN";    //cnn
        else if (position == 6)
            return "Fox News";  //fox-news
        else if (position == 7)
            return "Google News"; //google-news
        else if (position == 8)
            return "The Verge";
        else if (position == 9)
            return "News24";    //news24
        else
            return "hello";


    }
}
