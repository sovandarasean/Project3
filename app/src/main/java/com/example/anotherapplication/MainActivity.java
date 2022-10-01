package com.example.anotherapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView,recyclerView_Trending,recyclerView_WatchAgain;
    private int[] img = {
      R.drawable.neon,
      R.drawable.neon1,
      R.drawable.neon2,
      R.drawable.ruili,
      R.drawable.yihao
    };
    private SliderView sliderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> movieUrl = new ArrayList<>();
        movieUrl.add("https://img.vxdn.net/p-max/176/the-last-mercenary-1627222697.jpg");
        movieUrl.add("https://img.vxdn.net/p-max/176/f9-the-fast-saga-1627222688.jpg");
        movieUrl.add("https://img.vxdn.net/p-max/176/paper-dragons-1630851237.jpg");
        movieUrl.add("https://img.vxdn.net/p-max/176/between-waves-1630851216.jpg");
        movieUrl.add("https://img.vxdn.net/p-max/176/star-trek-lower-decks-season-2-1627222743.jpg");
        movieUrl.add("https://img.vxdn.net/p-max/176/moonshine-season-1-1630851213.jpg");
        movieUrl.add("https://img.vxdn.net/p-max/176/new-amsterdam-season-4-1630851232.jpg");
        movieUrl.add("https://img.vxdn.net/p-max/176/dune-1630851206.jpg");
        movieUrl.add("https://img.vxdn.net/p-max/176/i-love-us-1630851205.jpg");
        movieUrl.add("https://img.vxdn.net/p-max/176/blame-1630851223.jpg");
        movieUrl.add("https://img.vxdn.net/p-max/176/black-widow-1622988647.jpg");

        recyclerView = findViewById(R.id.RecView);
        recyclerView_Trending = findViewById(R.id.RecView_Trending);
        recyclerView_WatchAgain = findViewById(R.id.RecView_watchAgain);
        cardViewAdapter adapter = new cardViewAdapter(this);
        sliderViewAdapter adapter1 = new sliderViewAdapter(this);
        sliderView = findViewById(R.id.sliderView);
        adapter1.setCoverUrl(img);
        adapter.setImgUrl(movieUrl);

        recyclerView.setAdapter(adapter);
        recyclerView_Trending.setAdapter(adapter);
        recyclerView_WatchAgain.setAdapter(adapter);

        sliderView.setSliderAdapter(adapter1);
        sliderView.startAutoCycle();
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView_Trending.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView_WatchAgain.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }
}