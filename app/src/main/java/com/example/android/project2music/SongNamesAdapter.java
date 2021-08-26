package com.example.android.project2music;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongNamesAdapter extends ArrayAdapter<SongNames>
{
    public SongNamesAdapter(Context context, ArrayList<SongNames> songs)
    {super(context,0,songs);}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;  //convertView is the view that will be recycled
        if (listItemView == null) {              //if there are no recyclable views
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        SongNames currentSong = getItem(position);

        TextView songTextView = (TextView) listItemView.findViewById(R.id.tv_song_name);
        songTextView.setText(currentSong.getSongName());

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.tv_artist_name);
        artistTextView.setText(currentSong.getArtistName());

        return listItemView;
    }


}

