package com.example.android.project2music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView back = (ImageView) findViewById(R.id.iv_back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack = new Intent(Home.this, MainActivity.class);
                startActivity(goBack);
            }
        });

        Button songs = (Button) findViewById(R.id.bv_songs);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent song = new Intent(Home.this, Songs.class);
                startActivity(song);
            }
        });

        Button artists = (Button) findViewById(R.id.bv_artists);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artist = new Intent(Home.this, Artists.class);
                startActivity(artist);
            }
        });

        Button albums = (Button) findViewById(R.id.bv_albums);

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent album = new Intent(Home.this, Albums.class);
                startActivity(album);
            }
        });

        Button playlists = (Button) findViewById(R.id.bv_playlists);
        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlist = new Intent(Home.this, Playlists.class);
                startActivity(playlist);
            }
        });

        Button buy_music = (Button) findViewById(R.id.bv_buy_music);
        buy_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buymusic = new Intent(Home.this, BuyMusic.class);
                startActivity(buymusic);
            }
        });

        ImageView settings = (ImageView) findViewById(R.id.iv_settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent setting = new Intent(Home.this, Settings.class);
                startActivity(setting);
            }
        });

    }
}
