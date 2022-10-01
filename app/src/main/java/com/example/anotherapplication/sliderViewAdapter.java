package com.example.anotherapplication;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.service.controls.Control;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.android.material.slider.Slider;
import com.smarteist.autoimageslider.SliderView;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;

public class sliderViewAdapter extends SliderViewAdapter<sliderViewAdapter.OnViewHolder> {

    private int[] coverUrl;
    private Context context;
    public sliderViewAdapter(Context context) {this.context = context;
    }

    public void setCoverUrl(int[] coverUrl) {
        this.coverUrl = coverUrl;
        notifyDataSetChanged();
    }

    @Override
    public OnViewHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_image,parent,false);
        return new OnViewHolder(view);
    }

    @Override
    public void onBindViewHolder(OnViewHolder viewHolder, int position) {
        viewHolder.imgSlider.setImageResource(coverUrl[position]);
    }

    @Override
    public int getCount() {
        return coverUrl.length;
    }

    public class OnViewHolder extends SliderViewAdapter.ViewHolder{
        private ImageView imgSlider;
        public OnViewHolder(View itemView) {
            super(itemView);
            imgSlider = itemView.findViewById(R.id.slider_img);
        }
    }
}
