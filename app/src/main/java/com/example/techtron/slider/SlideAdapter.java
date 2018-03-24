package com.example.techtron.slider;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;

public class SlideAdapter extends PagerAdapter{
    Context context;
    LayoutInflater inflater;

    //list of images
    public int[] list_images = {
            R.drawable.spacewale,
            R.drawable.has_gravity,
            R.drawable.heavy,
            R.drawable.the_bat
    };
    //list of string titles
    public String[] list_title = {
            "WHAL-E",
            "HAS GRAVITY",
            "TO INFINITY",
            "& BEYOND"
    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
