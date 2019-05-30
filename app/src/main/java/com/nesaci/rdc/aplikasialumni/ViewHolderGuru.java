package com.nesaci.rdc.aplikasialumni;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHolderGuru extends RecyclerView.ViewHolder{
    View mView;

    public ViewHolderGuru(@NonNull View itemView) {
        super(itemView);

        mView = itemView;
    }

//    set detail to recyclerview view row
    public void setDetails(Context ctx,String nama_lengkap,String foto,String status){
//        Views
        TextView mNama = mView.findViewById(R.id.rNama_lengkap);
        TextView mStatus = mView.findViewById(R.id.rStatus);
        CircleImageView mFoto = mView.findViewById(R.id.rfoto);

//        set data to views
        mNama.setText(nama_lengkap);
        mStatus.setText(status);
        Picasso.get().load(foto).into(mFoto);
    }
}
