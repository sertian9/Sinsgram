package com.example.sinsgram.Views.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinsgram.Adapter.PictureAdapterRecylerView;
import com.example.sinsgram.Model.Picture;
import com.example.sinsgram.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        showToolbar("Home",false,view);
        RecyclerView picturesRecycler=view.findViewById(R.id.pictureRecycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        picturesRecycler.setLayoutManager(linearLayoutManager);
        PictureAdapterRecylerView pictureAdapterRecylerView = new PictureAdapterRecylerView(buidPictures(),R.layout.cardview_picture,getActivity());
        picturesRecycler.setAdapter(pictureAdapterRecylerView);
        return view;

    }
    public ArrayList<Picture> buidPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("https://i.pinimg.com/originals/70/4f/97/704f975d2887518368c39157c3991b7b.jpg","King","4 días","3 Me gusta"));
        pictures.add(new Picture("https://pngimage.net/wp-content/uploads/2018/05/diane-nanatsu-no-taizai-png-5.png","Diana","1 días","4 Me gusta"));
        pictures.add(new Picture("http://images6.fanpop.com/image/photos/38400000/Ban-nanatsu-no-taizai-38454547-400-400.png","Ban","7 días","10 Me gusta"));
        return pictures;

    }

    public void showToolbar(String tittle, boolean upButton, View view){
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);



    }

}
