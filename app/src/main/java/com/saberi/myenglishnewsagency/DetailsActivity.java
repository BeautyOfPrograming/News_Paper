package com.saberi.myenglishnewsagency;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class DetailsActivity extends AppCompatActivity {

    TextView displayNewsContext;
    String url, pressName;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


//        displayNewsContext = findViewById(R.id.displayNewsContext);

        webView = findViewById(R.id.webView);
        Intent intent = getIntent();
        url = intent.getStringExtra("url");
        pressName = intent.getStringExtra("pressname");
        ActionBar bar = getSupportActionBar();
        bar.setTitle(pressName);
        webView.loadUrl(url);


    }


}