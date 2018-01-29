package com.assignment.businessboomertask.productdetails.view;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.assignment.businessboomertask.R;
import com.assignment.businessboomertask.base.Constants;
import com.assignment.businessboomertask.productdetails.model.Image;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ashaker on 1/29/2018.
 */

public class ImagePagerAdapter extends PagerAdapter {
    private LayoutInflater layoutInflater;
    private Context context;
    private List<Image> urls;



    public ImagePagerAdapter(Context context , List<Image> urls ) {
        this.context = context;
        this.urls = urls;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = layoutInflater.inflate(R.layout.pager_item, container, false);
        ImageView imageView = view.findViewById(R.id.pager_item_image);
        Picasso.with(context).load(Constants.BASE_URL + Constants.IMAGE_PATH + urls.get(position).getPath()).into(imageView);
        container.addView(view);

        return view;
    }

    @Override
    public int getCount() {
        return urls.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view = (View) object;
        container.removeView(view);
    }
}