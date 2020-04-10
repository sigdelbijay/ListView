package com.example.listviewexample;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class MyAdapter1 extends ArrayAdapter {

    public MyAdapter1(@NonNull Context context, String[] values) {
        super(context, R.layout.row_layout_2, values);
    }

    @Override public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater theInflator = LayoutInflater.from(getContext());

        View theView = theInflator.inflate(R.layout.row_layout_2, parent, false);
        String movie = (String) getItem(position);

        TextView theTextView = (TextView) theView.findViewById(R.id.TextView2);
        theTextView.setText(movie);

        ImageView theImage = (ImageView) theView.findViewById(R.id.imageView);
        theImage.setImageResource(R.drawable.dot);
        return theView;


    }


}
