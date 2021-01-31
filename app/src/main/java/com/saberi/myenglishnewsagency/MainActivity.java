package com.saberi.myenglishnewsagency;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Toast;


import com.google.android.gms.ads.MobileAds;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ViewPager myViewPager;
    TabLayout myTableLayout;
    PagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        MobileAds.initialize(getApplicationContext());
        myViewPager = findViewById(R.id.viewpager);
        myTableLayout = findViewById(R.id.tablelayout);




//
        pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        myViewPager.setAdapter(pagerAdapter);

//        myTableLayout.setTabsFromPagerAdapter(pagerAdapter);





        // to keep working together of tab layout and view pager
//
        myTableLayout.setupWithViewPager(myViewPager, true);

        myViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(myTableLayout));


        ActionBar bar = getSupportActionBar();
        bar.setTitle("News list");
        bar.setBackgroundDrawable(new     ColorDrawable(Color.parseColor("blue")));


//


//        adapter = new MyPageAdapter(getSupportFragmentManager());
//        viewPager.setAdapter(adapter);
        // to keep working together of tab layout and view pager
//        TabLayout.setupWithViewPager(viewPager);
//        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(TabLayout));

    }






}