package com.example.anotherapplication;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class cardViewAdapter extends RecyclerView.Adapter<cardViewAdapter.OnViewHolder> {

    private ArrayList<String> imgUrl;
    private Context context;

    public cardViewAdapter(Context context) { this.context = context;
    imgUrl = new ArrayList<>();}

    public void setImgUrl(ArrayList<String> imgUrl) {
        this.imgUrl = imgUrl;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public OnViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_cardview,parent,false);
        return new OnViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OnViewHolder holder, int position) {
        Glide.with(context)
                .asBitmap()
                .load(imgUrl.get(position))
                .into(holder.imgCover);
    }

    @Override
    public int getItemCount() {
        return imgUrl.size();
    }

    public class OnViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgCover;

        public OnViewHolder(@NonNull View itemView) {
            super(itemView);
            imgCover = itemView.findViewById(R.id.img_cover);
        }
    }
}
