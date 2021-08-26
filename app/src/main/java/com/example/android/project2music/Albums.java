package com.example.android.project2music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        ImageView settings=(ImageView) findViewById(R.id.iv_settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent setting=new Intent(Albums.this, Settings.class);
                startActivity(setting);
            }
        });

        ImageView back=(ImageView) findViewById(R.id.iv_back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack=new Intent(Albums.this,Home.class);
                startActivity(goBack);
            }
        });

        ArrayList<Album_Artist_Names> albums=new ArrayList<Album_Artist_Names>();

        albums.add(new Album_Artist_Names("CLIFF\nCliff Richards",R.drawable.cliff_album));
        albums.add(new Album_Artist_Names("I HAVE DREAMED\nDoris Day",R.drawable.doris_album));
        albums.add(new Album_Artist_Names("KISS THE SKY\nJason Derulo",R.drawable.jason_album));
        albums.add(new Album_Artist_Names("NOTHING BUT THE BEST\nFrank Sinatra",R.drawable.frank_album));
        albums.add(new Album_Artist_Names("ONE MORE TIME\nTWICE",R.drawable.twice_album));
        albums.add(new Album_Artist_Names("SIA\nSia",R.drawable.sia_album));
        albums.add(new Album_Artist_Names("THE WAR\nEXO",R.drawable.exo_album));
        albums.add(new Album_Artist_Names("THE BEST OF ELVIS\nElvis Presley",R.drawable.elvis_album));
        albums.add(new Album_Artist_Names("WANTED ON VOYAGE\nGeorge Ezra",R.drawable.george_album));

        album_artist_adapter adapter=new album_artist_adapter(this,albums);

        ListView listView=(ListView) findViewById(R.id.list2);
        listView.setAdapter(adapter);

    }
}
