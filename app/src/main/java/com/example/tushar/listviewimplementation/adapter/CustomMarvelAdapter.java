package com.example.tushar.listviewimplementation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tushar.listviewimplementation.R;


public class CustomMarvelAdapter extends BaseAdapter {
    private String characterNames[];
    private int characterImages[];
    private LayoutInflater layoutInflater;

    public CustomMarvelAdapter(Context applicationContext, String[] countryList, int[] flags) {
        this.characterNames = countryList;
        this.characterImages = flags;
        layoutInflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return characterNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        CustomMarvelViewHolder customMarvelViewHolder = new CustomMarvelViewHolder();
        view = layoutInflater.inflate(R.layout.list_item, null);
        customMarvelViewHolder.country = (TextView) view.findViewById(R.id.textview_hero_name);
        customMarvelViewHolder.icon = (ImageView) view.findViewById(R.id.textview_hero_image);
        customMarvelViewHolder.country.setText(characterNames[i]);
        customMarvelViewHolder.icon.setImageResource(characterImages[i]);
        return view;
    }
}
