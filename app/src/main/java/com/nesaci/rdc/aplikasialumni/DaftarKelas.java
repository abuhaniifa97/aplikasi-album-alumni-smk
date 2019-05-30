package com.nesaci.rdc.aplikasialumni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;


public class DaftarKelas extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_kelas);



    }
    @Override
    public void onBackPressed()
    {
        // code here to show dialog
        super.onBackPressed();  // optional depending on your needs
    }
    public void pindahrpl(View view){
        Intent intent = new Intent(DaftarKelas.this, kelasrpl.class);
        startActivity(intent);
    }
    public void pindahap1(View view){
        Intent intent = new Intent(DaftarKelas.this, kelasap1.class);
        startActivity(intent);
    }

    public void pindahap2(View view){
        Intent intent = new Intent(DaftarKelas.this, kelasap2.class);
        startActivity(intent);
    }
    public void pindahmm1(View view){
        Intent intent = new Intent(DaftarKelas.this, kelasmm1.class);
        startActivity(intent);
    }
    public void pindahmm2(View view){
        Intent intent = new Intent(DaftarKelas.this, kelasmm2.class);
        startActivity(intent);
    }
    public void pindahmmaxioo(View view){
        Intent intent = new Intent(DaftarKelas.this, kelasmmaxioo.class);
        startActivity(intent);
    }
    public void pindahtkr1(View view){
        Intent intent = new Intent(DaftarKelas.this, kelastkr1.class);
        startActivity(intent);
    }
    public void pindahtkr2(View view){
        Intent intent = new Intent(DaftarKelas.this, kelastkr2.class);
        startActivity(intent);
    }
    public void pindahtkr3(View view){
        Intent intent = new Intent(DaftarKelas.this, kelastkr3.class);
        startActivity(intent);
    }
}
