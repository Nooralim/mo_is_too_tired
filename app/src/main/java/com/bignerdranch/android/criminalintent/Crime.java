package com.bignerdranch.android.criminalintent;

import android.widget.ImageView;

import java.util.Date;
import java.util.UUID;


public class Crime {

    private UUID mId;
    private String mTitle;


    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    private ImageView image;

    public Crime() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }
}