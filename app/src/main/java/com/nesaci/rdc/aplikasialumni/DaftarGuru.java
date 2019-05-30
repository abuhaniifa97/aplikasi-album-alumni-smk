package com.nesaci.rdc.aplikasialumni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DaftarGuru extends AppCompatActivity {

    RecyclerView mRecyclerView;
    FirebaseDatabase mFirebaseDatabase;
    DatabaseReference mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_guru);



//        RecyclerView
        mRecyclerView = findViewById(R.id.rRecyclerviewguru);
        mRecyclerView.setHasFixedSize(true);

//        set layout as LinerLayout
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

//        send query to firebase
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mRef = mFirebaseDatabase.getReference("guru");
    }

    @Override
    public void onBackPressed()
    {
        // code here to show dialog
        super.onBackPressed();  // optional depending on your needs
    }

//    load data into recyclerview onStart

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<Model,ViewHolderGuru> firebaseRecyclerAdapter=
                new FirebaseRecyclerAdapter<Model, ViewHolderGuru>(
                        Model.class,
                        R.layout.rowguru,
                        ViewHolderGuru.class,
                        mRef
                ) {
                    @Override
                    protected void populateViewHolder(ViewHolderGuru viewHolder, Model model, int position) {
                            viewHolder.setDetails(getApplicationContext(),model.getNama_lengkap(),model.getFoto(),model.getStatus());

                    }
                };
//        set adapater to recyclerview
        mRecyclerView.setAdapter(firebaseRecyclerAdapter);
    }
}
