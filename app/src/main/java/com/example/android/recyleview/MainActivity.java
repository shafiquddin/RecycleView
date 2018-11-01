package com.example.android.recyleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView proglist=(RecyclerView)findViewById(R.id.progList);
        proglist.setLayoutManager(new LinearLayoutManager(this));
        String[] lang={"Hyderabad","Aurangabad","nizamabad","Ahemadabad","Daulatabad","khultabad","Abbasabad","Akbarabad","Aliabad","Faizabad","hajjiabad","hussainabad","Jahanabdad","Khorramabad","kawsarabad","Razabad","shahabad","sahibabad","Mosheerabad","Mominabad","sikanderabad","Allahabad","jalalabad"};
        proglist.setAdapter(new programingAdapter(lang));

    }
}
