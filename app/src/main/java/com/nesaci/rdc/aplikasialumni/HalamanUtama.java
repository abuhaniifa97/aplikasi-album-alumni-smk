package com.nesaci.rdc.aplikasialumni;

import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import com.google.android.gms.ads.reward.RewardedVideoAd;

import static android.widget.Toast.makeText;

public class HalamanUtama extends AppCompatActivity {
    final String TAG = this.getClass().getName();
    private RewardedVideoAd mRewardedVideoAd;
    private InterstitialAd mInterstitialAd;
    private long backPressedTime;
    private Toast BackToast;
    CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);
//

//        intersital
        MobileAds.initialize(this, "ca-app-pub-5571625346543718~4408650856");

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-5571625346543718/8853015091");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.colappsingtoolbar);
        collapsingToolbarLayout.setTitle("Album Nesaci 2019");
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.black));

    }
    public void pindahdatakelas(View view){
        if (mInterstitialAd.isLoaded()){
            mInterstitialAd.show();
        } else {
            Intent intent = new Intent(HalamanUtama.this, DaftarKelas.class);
            startActivity(intent);
        }
    }
    public  void pindahprofile(View view){
        Intent intent = new Intent(HalamanUtama.this, PROFILE_NESACI.class);
        startActivity(intent);
    }
    public void pindahtentangaplikasi(View view){
        if (mInterstitialAd.isLoaded()){
            mInterstitialAd.show();
        } else {
            Intent intent = new Intent(HalamanUtama.this, TentangAplikasi.class);
            startActivity(intent);
        }
    }
    boolean twice;
    @Override
    public void onBackPressed() {
        Log.d(TAG,"click");
        if (twice == true){
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
            System.exit(0);

        }
        Log.d(TAG,"twice :" + twice );

       Toast.makeText(HalamanUtama.this,"Klik kembali untuk menutup aplikasi",Toast.LENGTH_SHORT).show();
       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
                twice = false;
               Log.d(TAG,"twice :" + twice );
           }

       }, 3000);
       twice  = true;
    }
    public void pindahguru(View view){
        if (mInterstitialAd.isLoaded()){
            mInterstitialAd.show();
        } else {
            Intent intent = new Intent(HalamanUtama.this, DaftarGuru.class);
            startActivity(intent);
        }
    }

    public void pindahtu(View view){
        Intent intent = new Intent(HalamanUtama.this,TataUsaha.class);
        startActivity(intent);
    }
}
