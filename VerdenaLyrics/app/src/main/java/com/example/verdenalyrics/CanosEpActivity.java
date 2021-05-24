package com.example.verdenalyrics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class CanosEpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canos_ep);

        RecyclerView dataList = findViewById(R.id.dataList);
        List<String> titles = new ArrayList<>();
        List<String> testo = new ArrayList<>();

        titles.add("Caños");
        titles.add("Malaga");
        titles.add("L'ora è buia");
        titles.add("Párabellium");
        titles.add("His latest flame (Marie’s the name)");
        titles.add("Fluido");

        testo.add("@string/Canos");
        testo.add("@string/Malaga");
        testo.add("@string/OraBuia");
        testo.add("@string/Parabellium");
        testo.add("@string/HisLatestFlame");
        testo.add("@string/Fluido");

        AdapterSong adapter = new AdapterSong(this, titles, testo);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,1,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);
    }
}