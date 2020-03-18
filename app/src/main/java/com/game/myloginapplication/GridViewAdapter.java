package com.game.myloginapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class GridViewAdapter extends ArrayAdapter {
    ArrayList<Item> birdList = new ArrayList<>();

    public GridViewAdapter(@NonNull Context context, int resource,ArrayList<Item> object) {
        super(context, resource, object);
        birdList = object;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.grid_view_items, null);
        TextView textView = v.findViewById(R.id.textView);
        ImageView imageView = v.findViewById(R.id.imageView);
        textView.setText(birdList.get(position).getbirdName());
        imageView.setImageResource(birdList.get(position).getbirdImage());
        return v;
    }
}
