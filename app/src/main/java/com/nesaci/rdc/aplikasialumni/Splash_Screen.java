package com.nesaci.rdc.aplikasialumni;

import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Splash_Screen extends AppCompatActivity {
    ProgressBar progressBar;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


//        Cek Koneksi
        if(!isNetworkAvailable()){

            new AlertDialog.Builder(this)
                    .setIcon(R.drawable.ic_action_error)
                    .setTitle("Tidak Ada Koneksi Internet")
                    .setMessage("Aplikasi Membutuhkan koneksi Internet")
                    .setPositiveButton("Tutup", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                           finish();
                        }
                    })
            .show();
        }
        else
        {
            setContentView(R.layout.activity_splash__screen);
            Toast.makeText(Splash_Screen.this,"SMK NEGERI 1 CIKEDUNG",Toast.LENGTH_LONG).show();
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);

            progressBar = findViewById(R.id.prograssbar_id);
            textView = findViewById(R.id.textview_id);

            progressBar.setMax(100);
            progressBar.setScaleY(3f);
            progressAnimation();

        }



    }
    public void progressAnimation(){
        ProgresBarAnimation anim = new ProgresBarAnimation(this,progressBar,textView,0f,100f);
        anim.setDuration(8000);
        progressBar.setAnimation(anim);
    }
    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo          = connectivityManager.getActiveNetworkInfo();
        return  networkInfo != null && networkInfo.isConnected();
    }


}
