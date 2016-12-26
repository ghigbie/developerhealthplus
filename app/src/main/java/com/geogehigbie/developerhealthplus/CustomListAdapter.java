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
 * Created by georgehigbie on 12/12/16.
 */

public class CustomListAdapter extends ArrayAdapter<String> {

    public CustomListAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout_for_use, values);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View customView = layoutInflater.inflate(R.layout.row_layout_for_use, parent, false);

        String item = getItem(position);

        TextView textView = (TextView) customView.findViewById(R.id.row_text_view);
        ImageView imageView = (ImageView) customView.findViewById(R.id.video_icon);

        textView.setText(item);
        imageView.setImageResource(R.drawable.video_icon_second);

        return customView;

    }

    //    @Override
//    // Get a View that displays the data at the specified position in the data set.
//    public View getView(int position, View convertView, ViewGroup parent) {
//
//		/*
//		 * Instantiates a layout XML file into its corresponding View objects.
//		 * It is never used directly. Instead, use getSystemService(String) to
//		 * retrieve a standard LayoutInflater instance that is already hooked up to
//		 * the current context and correctly configured for the device you are running on.
//		 */
//        LayoutInflater inflater = (LayoutInflater) context
//                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//		/*
//		 * Inflate a new view hierarchy from the specified xml resource.
//		 * Throws InflateException if there is an error.
//		 */
//        View rowView = inflater.inflate(R.layout.row_layout_for_use, parent, false);
//        TextView textView = (TextView) rowView.findViewById(R.id.row_text_view);
//        textView.setText(values[position]);
//
//
//        Drawable draw;
//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
//            draw = context.getResources().getDrawable(icons[position], null);
//        }
//        else{
//            draw = context.getResources().getDrawable(icons[position]);
//        }
//
//        Bitmap bitmap = ((BitmapDrawable) draw).getBitmap();
//        int h = bitmap.getHeight();
//        int w = bitmap.getWidth();
//        Drawable newDraw = new BitmapDrawable(context.getResources(),
//                Bitmap.createScaledBitmap(bitmap, 40 * w / h, 40, true));
//
//		/*
//		 * Sets the Drawables (if any) to appear to the left of, above, to the right of,
//		 *  and below the text. Use 0 if you do not want a Drawable there.
//		 * The Drawables' bounds will be set to their intrinsic bounds.
//		 */
//        textView.setCompoundDrawablesWithIntrinsicBounds(newDraw, null, null,
//                null);
//
//        return rowView;
//    }
//
//
}