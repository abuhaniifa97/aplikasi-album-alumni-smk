package com.nesaci.rdc.aplikasialumni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class TentangAplikasi extends AppCompatActivity {
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_aplikasi);

        ArrayList<DataModel> _listDataModel = listArray();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);

        /* Set Horizontal LinearLayout to RecyclerView */
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(mLayoutManager);


        /* Set MyCustomAdapter to RecyclerView */
        recyclerView.setAdapter(new MyCustomAdapter(_listDataModel));

    }
    @Override
    public void onBackPressed()
    {
        // code here to show dialog
        super.onBackPressed();  // optional depending on your needs
    }

    public ArrayList<DataModel> listArray() {

        ArrayList<DataModel> objList = new ArrayList<DataModel>();
        DataModel dm;

        dm = new DataModel();
        dm.setRestaurantName("Elan");
        dm.setDesc("XII TKR 1");
        dm.setImgSrc(R.drawable.timpendataelan);
        objList.add(dm);

        dm = new DataModel();
        dm.setRestaurantName("Ahmad Rouf Faizun");
        dm.setDesc("XII MM AXIOO");
        dm.setImgSrc(R.drawable.timendataizun);
        objList.add(dm);

        dm = new DataModel();
        dm.setRestaurantName("Abu Hanipa");
        dm.setDesc("XII RPL");
        dm.setImgSrc(R.drawable.timpendataabu);
        objList.add(dm);

        dm = new DataModel();
        dm.setRestaurantName("M.Sobirin");
        dm.setDesc("XII MM 2");
        dm.setImgSrc(R.drawable.timpendataasobirin);
        objList.add(dm);





        return objList;
    }

}
