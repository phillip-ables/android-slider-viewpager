package com.example.techtron.slider;

import android.support.v4.view.PagerAdapter;
import android.view.View;

public class SlideAdapter extends PagerAdapter{

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
