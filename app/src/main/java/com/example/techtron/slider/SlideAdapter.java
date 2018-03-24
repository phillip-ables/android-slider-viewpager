package com.example.techtron.slider;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

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
    };
    //list for descriptions
    public String[] list_descriptions = {
            "Everyone has a dream, and its okay even if your dream is to be a Whale in Space. Don't Judge but maybe bring oxygen",
            "You got to start somewhere. If you think it matters, no matter how small, and you matter; well then: mass one and mass two divided by r squared",
            "Just think few men have ever left this planet and now a car has left this planet!",
            "GO US: ELON MUSK. Also (lines of description) the last tweet i seen of his referenced the shoe gnomes that stole underwear therefor i would be remorsed not to mention WILLZYX"
    };
    //list of background colors
    public int[] list_backgroundColors = {
            Color.rgb(55,55,55),
            Color.rgb(239,85,85),
            Color.rgb(110,49,89),
            Color.rgb(1, 188, 212)
    };

    public SlideAdapter(Context context) {
        this.context = context;

    }

    @Override
    public int getCount() {
        return list_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService (context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide, container, false);
        LinearLayout layoutSlide = (LinearLayout) view.findViewById(R.id.slideLinearLayout);
        ImageView imageViewSlide = (ImageView) view.findViewById(R.id.imageViewSlide);
        TextView textViewTitle = (TextView) view.findViewById(R.id.textViewTitle);
        TextView textViewDescription = (TextView) view.findViewById(R.id.textViewDescription);

        layoutSlide.setBackgroundColor(list_backgroundColors[position]);
        imageViewSlide.setImageResource(list_images[position]);
        textViewTitle.setText(list_title[position]);
        textViewDescription.setText(list_descriptions[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
