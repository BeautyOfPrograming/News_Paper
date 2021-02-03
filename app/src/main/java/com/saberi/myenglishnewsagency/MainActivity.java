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

public class MainActivity extends AppCompatActivity implements OnUserEarnedRewardListener {

    ViewPager myViewPager;
    TabLayout myTableLayout;
    PagerAdapter pagerAdapter;

    private RewardedAd rewardedAd;

    private RewardedInterstitialAd rewardedInterstitialAd;


    private final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // load and show add rewarded add

//        MobileAds.initialize(this, new OnInitializationCompleteListener() {
//            @Override
//            public void onInitializationComplete(InitializationStatus initializationStatus) {
//                Toast.makeText(getApplicationContext(), " sucesfull ", Toast.LENGTH_SHORT).show();
//            }
//        });


//
//        // initialize add
//        MobileAds.initialize(this, new OnInitializationCompleteListener() {
//            @Override
//            public void onInitializationComplete(InitializationStatus initializationStatus) {
//                loadAdInitialize();
//            }
//
//            private void loadAdInitialize() {
//
//                // Use the test ad unit ID to load an ad."
//                RewardedInterstitialAd.load(MainActivity.this, "ca-app-pub-39402560999425445354046379",
//                        new AdRequest.Builder().build(), new RewardedInterstitialAdLoadCallback() {
//                            @Override
//                            public void onAdLoaded(RewardedInterstitialAd ad) {
//                                rewardedInterstitialAd = ad;
//                                Log.e(TAG, "onAdLoaded");
//                            }
//
//                            @Override
//                            public void onAdFailedToLoad(LoadAdError loadAdError) {
//                                Log.e(TAG, "onAdFailedToLoad");
//                            }
//                        });
//
//
//                //show
//
//
//
//
//
//            }
//        });


        AdView mAdView;
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    /*

        AdRequest adRequest = new AdRequest.Builder().build();

        RewardedAd.load(this, "ca-app-pub-3940256099942544/5224354917",
                adRequest, new RewardedAdLoadCallback(){
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error.
                        Log.d(TAG, loadAdError.getMessage());
                        mRewardedAd = null;
                    }

                    @Override
                    public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
                        mRewardedAd = rewardedAd;
                        Log.d(TAG, "onAdFailedToLoad");
                    }
                });



        if (mRewardedAd != null) {
            Activity activityContext = MainActivity.this;
            mRewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
                @Override
                public void onUserEarnedReward(@NonNull com.google.android.gms.ads.rewarded.RewardItem rewardItem) {
                    // Handle the reward.
                    Log.d("TAG", "The user earned the reward.");
                    int rewardAmount = rewardItem.getAmount();
                    String rewardType = rewardItem.getType();
                }

            });
        } else {
            Log.d("TAG", "The rewarded ad wasn't ready yet.");
        }


        //
//        rewardedAd = new RewardedAd(getApplicationContext(),"
//        ca-app-pub-3940256099942544/5224354917");
//        RewardedAdLoadCallback adLoadCallback = new RewardedAdLoadCallback() {
//            @Override
//            public void onRewardedAdLoaded() {
//                // Ad successfully loaded.
//            }
//
//            @Override
//            public void onRewardedAdFailedToLoad(LoadAdError adError) {
//                // Ad failed to load.
//            }
//        };
//        rewardedAd.loadAd(new AdRequest.Builder().build(), adLoadCallback);
//
//
//        if (rewardedAd.isLoaded()) {
//            Activity activityContext = MainActivity.this;
//
//            RewardedAdCallback adCallback = new RewardedAdCallback() {
//                @Override
//                public void onRewardedAdOpened() {
//                    // Ad opened.
//                }
//
//                @Override
//                public void onRewardedAdClosed() {
//                    // Ad closed.
//                }
//
//                @Override
//                public void onUserEarnedReward(@NonNull RewardItem reward) {
//                    // User earned reward.
//                }
//
//                @Override
//                public void onRewardedAdFailedToShow(AdError adError) {
//                    // Ad failed to display.
//                }
//            };
//            rewardedAd.show(activityContext, adCallback);
//        } else {
//            Log.d("TAG", "The rewarded ad wasn't loaded yet.");
//        }
//

  */


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


//        adapter = new MyPageAdapter(getSupportFragmentManager());
//        viewPager.setAdapter(adapter);
        // to keep working together of tab layout and view pager
//        TabLayout.setupWithViewPager(viewPager);
//        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(TabLayout));

    }


    private void loadAD() {

        this.rewardedAd = new RewardedAd(this, "ca-app-pub-3940256099942544/5224354917");
        RewardedAdLoadCallback rewardedAdLoadCallback = new RewardedAdLoadCallback() {
            @Override
            public void onRewardedAdLoaded() {
                super.onRewardedAdLoaded();

                Log.d("load_success", "loads successful");
            }

            @Override
            public void onRewardedAdFailedToLoad(int i) {
                super.onRewardedAdFailedToLoad(i);
                Log.d("dose_not_success", "dose not laod  successful");

            }
        };

        this.rewardedAd.loadAd(new AdRequest.Builder().build(),
                rewardedAdLoadCallback);
    }

    private void showAdd() {

        if (rewardedAd.isLoaded()) {

            RewardedAdCallback rewardedAdCallback = new RewardedAdCallback() {
                @Override
                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {

                    Log.d("user rewarder", "rewarded");

                }

                @Override
                public void onRewardedAdOpened() {
                    super.onRewardedAdOpened();

                    Log.d("opens", "opened");

                }

                @Override
                public void onRewardedAdClosed() {
                    super.onRewardedAdClosed();

                    Log.d("closes", "closed");

                }
            };


            this.rewardedAd.show(this, rewardedAdCallback);
        } else {

            Log.d("dose_not_ loaded", "dose_not_ loaded");

        }

    }


    @Override
    public void onUserEarnedReward(@NonNull RewardItem rewardItem) {

        rewardedInterstitialAd.show(MainActivity.this,MainActivity.this);

                                Log.d("rewarded", "rewarded_add");
    }
}