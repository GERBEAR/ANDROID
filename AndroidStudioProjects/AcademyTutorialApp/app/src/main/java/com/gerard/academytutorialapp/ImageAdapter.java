package com.gerard.academytutorialapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Gerard on 26/08/2016.
 */
public class ImageAdapter extends BaseAdapter {

    private Context mContext;
    private int mImageHeight = 350;
    private int mImageWidth = 350;

    private static Integer[] mThumbnails = {
            R.drawable.batman_icon,
            R.drawable.joker_icon,
            R.drawable.superman_icon,
            R.drawable.wonderwoman_icon,
            R.drawable.deathstroke_icon,
            R.drawable.deadpool_icon,
            R.drawable.spiderman_icon,
            R.drawable.venom_icon,
    };

    public ImageAdapter(Context context){
        mContext = context;
    }

    @Override
    public int getCount() {
        return mThumbnails.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if(convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(mImageHeight, mImageWidth));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        }else{
            imageView = (ImageView) convertView;
        }
        Bitmap bitmap = ImageUtils.decodeSampleBitmapFromResource(mContext.getResources(), mThumbnails[position], mImageWidth, mImageHeight);
        imageView.setImageBitmap(bitmap);

        return imageView;

    }
}
