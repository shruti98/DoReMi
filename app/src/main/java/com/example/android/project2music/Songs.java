package com.example.android.project2music;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ImageView settings=(ImageView) findViewById(R.id.iv_settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent setting=new Intent(Songs.this, Settings.class);
                startActivity(setting);
            }
        });

        ImageView back=(ImageView) findViewById(R.id.iv_back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack=new Intent(Songs.this,Home.class);
                startActivity(goBack);
            }
        });

        final ArrayList<SongNames> songs=new ArrayList<SongNames>();

        songs.add(new SongNames(getString(R.string.budapest),getString(R.string.george_ezra),R.raw.budapest));
        songs.add(new SongNames(getString(R.string.cake_by_ocean),getString(R.string.dnce),R.raw.cake));
        songs.add(new SongNames(getString(R.string.cheap_thrills),getString(R.string.sia),R.raw.cheap));
        songs.add(new SongNames(getString(R.string.to_the_moon),getString(R.string.frank_sinatra),R.raw.flyme));
        songs.add(new SongNames(getString(R.string.hound_dog),getString(R.string.elvis),R.raw.hound));
        songs.add(new SongNames(getString(R.string.say_i_love_you),getString(R.string.stevie_wonder),R.raw.calledtosay));
        songs.add(new SongNames(getString(R.string.light_it_up),getString(R.string.major_lazer),R.raw.lightit));
        songs.add(new SongNames(getString(R.string.lipstick_on_collar),getString(R.string.connie),R.raw.lipstick));
        songs.add(new SongNames(getString(R.string.loser),getString(R.string.big_bang),R.raw.loser));
        songs.add(new SongNames(getString(R.string.love_me_right),getString(R.string.exo),R.raw.loveme));
        songs.add(new SongNames(getString(R.string.lucky_lips),getString(R.string.cliff_richards),R.raw.lucky));
        songs.add(new SongNames(getString(R.string.mansae),getString(R.string.seventeen),R.raw.mansae));
        songs.add(new SongNames(getString(R.string.que_sera),getString(R.string.doris),R.raw.quesera));
        songs.add(new SongNames(getString(R.string.questions),getString(R.string.chris_brown),R.raw.ques));
        songs.add(new SongNames(getString(R.string.swalla),getString(R.string.jason_derulo),R.raw.swalla));
        songs.add(new SongNames(getString(R.string.eve),getString(R.string.exo), R.raw.eve));
        songs.add(new SongNames(getString(R.string.tt),getString(R.string.twice),R.raw.tt));
        songs.add(new SongNames(getString(R.string.trumpets),getString(R.string.sean_paul),R.raw.trumpets));

        SongNamesAdapter adapter=new SongNamesAdapter(this,songs);
        ListView listView=(ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                LinearLayout basic_functions=(LinearLayout) findViewById(R.id.ll_basics);
                basic_functions.setVisibility(View.VISIBLE);

                SongNames name=songs.get(i);
                mMediaPlayer=MediaPlayer.create(Songs.this,name.getAudioResourceId());
                mMediaPlayer.start();

            }
        });

    }

    public void play(View view)
    {
        mMediaPlayer.start();
    }

    public void pause(View view)
    {
        mMediaPlayer.pause();
    }

    public void stop(View view)
    {
        mMediaPlayer.pause();
        mMediaPlayer.seekTo(0);
    }
}
