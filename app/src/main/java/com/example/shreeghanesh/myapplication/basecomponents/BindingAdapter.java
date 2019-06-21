package com.example.shreeghanesh.myapplication.basecomponents;

import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class BindingAdapter {

    @android.databinding.BindingAdapter("setImageIntoContainer")
    public static void setImage(ImageView imageView, String imageUrl) {
        Glide.with(imageView.getContext())
                .load(imageUrl)
                .into(imageView);
    }
}
