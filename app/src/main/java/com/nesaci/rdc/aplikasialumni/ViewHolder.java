package com.nesaci.rdc.aplikasialumni;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ViewHolder extends RecyclerView.ViewHolder {
    View mView;

    public ViewHolder(View itemView){
        super(itemView);

        mView =itemView;


    }
//    Set detail to recycleview row
    public void setDetails(Context ctx,String nama_lengkap,String alamat,String foto,String jenis_kelamin,String quetes,String no_hp){
//        Views
        TextView mTitleTv = mView.findViewById(R.id.rTitleTv);
        TextView mDetailTv = mView.findViewById(R.id.rDescriptionTv);
        TextView mJenisKelaminTv = mView.findViewById(R.id.rJenisKelaminTv);
        TextView mQuetesTv = mView.findViewById(R.id.rQuetesTv);
        TextView mNoHpTv = mView.findViewById(R.id.rNohpnTvnTv);
        ImageView mImageTv = mView.findViewById(R.id.rImageView);

//        set data to views
        mTitleTv.setText(nama_lengkap);
        mDetailTv.setText(alamat);
        mJenisKelaminTv.setText(jenis_kelamin);
        mNoHpTv.setText(no_hp);
       mQuetesTv.setText(quetes);

        Picasso.get().load(foto).into(mImageTv);
    }


//    interface to send callbacks




}
