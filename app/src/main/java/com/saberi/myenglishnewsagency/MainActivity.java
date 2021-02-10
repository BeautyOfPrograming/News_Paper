package com.saberi.myenglishnewsagency;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity{

    ViewPager myViewPager;
    TabLayout myTableLayout;
    PagerAdapter pagerAdapter;


    private RewardedAd rewardedAd;

    private RewardedInterstitialAd rewardedInterstitialAd;


    // AdMob Rewarded Video Ad Id
    private String AdId = "ca-app-pub-3940256099942544/5224354917";
// creating object of RewardedVideoAd

    private RewardedVideoAd AdMobrewardedVideoAd;


    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AdMobrewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);

        AdMobrewardedVideoAd.loadAd(AdId, new AdRequest.Builder().build());





//        AdView mAdView;
//        mAdView = findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdView.loadAd(adRequest);




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
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("blue")));


//



    }


}