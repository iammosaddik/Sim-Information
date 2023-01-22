package com.mosaddik.siminformation;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class MainActivity extends AppCompatActivity {


    LinearLayout robiSim, airtelSim, teletalkSim, banglalinkSim, grameenSim, office;
    AdView mAdView;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mAdView = findViewById(R.id.adView);

        robiSim = findViewById(R.id.robiSim);
        airtelSim = findViewById(R.id.airtelSim);
        teletalkSim = findViewById(R.id.teletalkSim);
        banglalinkSim = findViewById(R.id.banglalinkSim);
        office = findViewById(R.id.office);
        grameenSim = findViewById(R.id.grameenSim);



        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        robiSim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, RobiSim.class);
                startActivity(myIntent);


            }
        });


        airtelSim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, AirtelSim.class);
                startActivity(myIntent);



            }
        });


        teletalkSim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, TeletalkSim.class);
                startActivity(myIntent);



            }
        });


        banglalinkSim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, BanglalinkSim.class);
                startActivity(myIntent);



            }
        });


        grameenSim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, GpSim.class);
                startActivity(myIntent);

            }
        });


        office.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, Office.class);
                startActivity(myIntent);



            }
        });

    }
}
