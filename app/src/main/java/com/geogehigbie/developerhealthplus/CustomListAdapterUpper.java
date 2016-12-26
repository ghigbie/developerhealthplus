package com.geogehigbie.developerhealthplus;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by georgehigbie on 12/26/16.
 */

class CustomListAdapterUpper extends ArrayAdapter<String> {



    public CustomListAdapterUpper(Context context, String[] titleArray) {
        super(context, R.layout.row_layout_for_use, titleArray);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View customView = layoutInflater.inflate(R.layout.row_layout_for_use, parent, false);

        String upperBackTitle= getItem(position);
        TextView textView = (TextView) customView.findViewById(R.id.row_text_view);
        ImageView imageView = (ImageView) customView.findViewById(R.id.video_icon);

        textView.setText(upperBackTitle);
        imageView.setImageResource(R.drawable.video_icon_second);

        return customView;
    }
}
