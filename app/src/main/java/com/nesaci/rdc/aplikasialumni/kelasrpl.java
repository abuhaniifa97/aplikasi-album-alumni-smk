package com.nesaci.rdc.aplikasialumni;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import java.io.ByteArrayOutputStream;

public class kelasrpl extends AppCompatActivity {

    RecyclerView mRecyclerView;
    FirebaseDatabase mFirebaseDatabase;
    DatabaseReference mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelasrpl);

//        RecyclerView  ini komen nggan usah di hapus
       mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);

//        set layout as LinearLayout nggak usah di hapus
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

//        send Query to Firebase
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mRef = mFirebaseDatabase.getReference("rpl");




    }
    @Override
    public void onBackPressed()
    {
        // code here to show dialog
        super.onBackPressed();  // optional depending on your needs
    }

//    Search Data
    private void firebaseSearch(String searchText){
        Query firebaseSearchQuery = mRef.orderByChild("nama_lengkap").startAt(searchText).endAt(searchText + "\uf8ff");

        FirebaseRecyclerAdapter<Model,ViewHolder> firebaseRecyclerAdapter=
                new FirebaseRecyclerAdapter<Model, ViewHolder>(

                        Model.class,
                        R.layout.row,
                        ViewHolder.class,
                        firebaseSearchQuery
                ) {
                    @Override
                    protected void populateViewHolder(ViewHolder viewHolder, Model model, int position) {

//                        viewHolder.setDetails(getApplicationContext(),model.getNama_lengkap(),model.getalamat(),model.getFoto(),model.getjenis_kelamin(),model.getquetes());
                    }


                };
        //        set adapter to recyclerView nggak usah di hapus
                  mRecyclerView.setAdapter(firebaseRecyclerAdapter);


    }



    //    Load data into recyclerView onstart

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<Model, ViewHolder> firebaseRecyclerAdapter =
                new FirebaseRecyclerAdapter<Model, ViewHolder>(
                        Model.class,
                        R.layout.row,
                        ViewHolder.class,
                        mRef
                ) {
                    @Override
                    protected void populateViewHolder(ViewHolder viewHolder, Model model, int position) {

                        viewHolder.setDetails(getApplicationContext(),model.getNama_lengkap(),model.getalamat(),model.getFoto(),model.getjenis_kelamin(),model.getquetes(),model.getno_hp());
                    }

                };
//        set adapter to recyclerView nggak usah di hapus
         mRecyclerView.setAdapter(firebaseRecyclerAdapter);

    }




}
