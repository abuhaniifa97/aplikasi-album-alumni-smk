package com.nesaci.rdc.aplikasialumni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Contoh extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh);

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

    public ArrayList<DataModel> listArray() {

        ArrayList<DataModel> objList = new ArrayList<DataModel>();
        DataModel dm;

        dm = new DataModel();
        dm.setRestaurantName("India Restaurant");
        dm.setDesc("Pav Baji, Chinese, South Indian, Fast Food");
        dm.setImgSrc(R.drawable.logoap);
        objList.add(dm);

        dm = new DataModel();
        dm.setRestaurantName("Cream 'n' Crust");
        dm.setDesc("Pastry, Desserts, Ice Cream, Cakes, Foods");
        dm.setImgSrc(R.drawable.logo);
        objList.add(dm);

        dm = new DataModel();
        dm.setRestaurantName("Food on Truck");
        dm.setDesc("Sandwich, Fast Food, Beverages, Ice Cream");
        dm.setImgSrc(R.drawable.logotkr);
        objList.add(dm);

        dm = new DataModel();
        dm.setRestaurantName("Dairy Don");
        dm.setDesc("Thickshake, Beverages, Desserts, Ice Cream, Snacks");
        dm.setImgSrc(R.drawable.logo);
        objList.add(dm);

        dm = new DataModel();
        dm.setRestaurantName("Noodle Nest");
        dm.setDesc("Noodles, Chinese, Thai, Asian");
        dm.setImgSrc(R.drawable.logorpl);
        objList.add(dm);

        dm = new DataModel();
        dm.setRestaurantName("Pizza Squad");
        dm.setDesc("Pizza, Italian");
        dm.setImgSrc(R.drawable.logomm);
        objList.add(dm);

        dm = new DataModel();
        dm.setRestaurantName("Burger Box");
        dm.setDesc("Fast Food");
        dm.setImgSrc(R.drawable.logoap);
        objList.add(dm);

        dm = new DataModel();
        dm.setRestaurantName("Italian Food");
        dm.setDesc("Fast Food, Italian");
        dm.setImgSrc(R.drawable.logo);
        objList.add(dm);

        return objList;
    }
}
