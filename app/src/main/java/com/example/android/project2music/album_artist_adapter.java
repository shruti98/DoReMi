package com.example.android.project2music;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class album_artist_adapter extends ArrayAdapter<Album_Artist_Names> {

    public album_artist_adapter(Context context, ArrayList<Album_Artist_Names> names)
    {super(context,0,names);}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView=convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_2, parent, false);
        }

        Album_Artist_Names name = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.tv_name);
        nameTextView.setText(name.getName());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.iv_img);
        iconView.setImageResource(name.getPic());

        return listItemView;
    }

}