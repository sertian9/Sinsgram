package com.example.sinsgram.Adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sinsgram.Model.Picture;
import com.example.sinsgram.R;

import java.util.ArrayList;

public class PictureAdapterRecylerView extends RecyclerView.Adapter<PictureAdapterRecylerView.PictureViewHolder>{
    @NonNull

    private ArrayList<Picture> pictures;
    private int resource;
    private Activity activity;
    public PictureAdapterRecylerView(@NonNull ArrayList<Picture> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    public PictureViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(resource,viewGroup,false);
        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PictureViewHolder pictureViewHolder, int i) {
        Picture picture=pictures.get(i);
        pictureViewHolder.usernameCard.setText(picture.getUserName());
        pictureViewHolder.timeCard.setText(picture.getTime());
        pictureViewHolder.likeNumberCard.setText(picture.getLike_number());

    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder {
        private ImageView pictureCard;
        private TextView usernameCard;
        private TextView timeCard;
        private TextView likeNumberCard;
        public PictureViewHolder(@NonNull View itemView) {
            super(itemView);
           pictureCard = (ImageView) itemView.findViewById(R.id.pictureCard);
            usernameCard = (TextView) itemView.findViewById(R.id.username_card);
            timeCard= (TextView) itemView.findViewById(R.id.time_card);
            likeNumberCard = (TextView) itemView.findViewById(R.id.likeNumberCard);


        }
    }


}
