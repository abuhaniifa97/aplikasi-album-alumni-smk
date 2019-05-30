package com.nesaci.rdc.aplikasialumni;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailSiswa extends AppCompatActivity {
    TextView mNamaTv, mDetailTv,mJenisKelaminTv ,mNoHpTv,mQuetesTv;
    ImageView mImageTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_siswa);

//        initialize views

        mNamaTv = findViewById(R.id.rTitleTvdetail);
        mDetailTv = findViewById(R.id.rDescriptionTvdetail);
        mJenisKelaminTv = findViewById(R.id.rJenisKelamanindetail);
        mNoHpTv = findViewById(R.id.rNoHpdetail);
        mQuetesTv = findViewById(R.id.rQuetesdetail);
        mImageTv = findViewById(R.id.rImageViewdetail);

//        get data from intent
//        Database
        byte[] bytes = getIntent().getByteArrayExtra("foto");
        String title = getIntent().getStringExtra("nama_lengkap");
        String desc = getIntent().getStringExtra("alamat");
        String jeniskelamin = getIntent().getStringExtra("jenis_kelamin");
        String nohp = getIntent().getStringExtra("no_hp");
        String quetes = getIntent().getStringExtra("quetes");
        Bitmap bmp = BitmapFactory.decodeByteArray(bytes,0,bytes.length);

//        set data views
        mNamaTv.setText(title);
        mDetailTv.setText(desc);
        mJenisKelaminTv.setText(jeniskelamin);
        mNoHpTv.setText(nohp);
        mQuetesTv.setText(quetes);
        mImageTv.setImageBitmap(bmp);
    }
//    Handle onBackPrasses

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
