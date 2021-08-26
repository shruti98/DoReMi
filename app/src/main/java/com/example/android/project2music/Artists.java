package com.example.android.project2music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class Artists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        ImageView settings=(ImageView) findViewById(R.id.iv_settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settings=new Intent(Artists.this,Settings.class);
                startActivity(settings);
            }
        });

        ImageView back=(ImageView) findViewById(R.id.iv_back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back=new Intent(Artists.this,Home.class);
                startActivity(back);
            }
        });

        ArrayList<Album_Artist_Names> artists=new ArrayList<Album_Artist_Names>();

        artists.add(new Album_Artist_Names((getString(R.string.connie)),R.drawable.connie));
        artists.add(new Album_Artist_Names((getString(R.string.doris)),R.drawable.doris_day));
        artists.add(new Album_Artist_Names((getString(R.string.elvis)),R.drawable.elvis_album));
        artists.add(new Album_Artist_Names((getString(R.string.exo)),R.drawable.exo));
        artists.add(new Album_Artist_Names((getString(R.string.george_ezra)),R.drawable.george_ezra));
        artists.add(new Album_Artist_Names((getString(R.string.jason_derulo)),R.drawable.jason));
        artists.add(new Album_Artist_Names((getString(R.string.seventeen)),R.drawable.seventeen));
        artists.add(new Album_Artist_Names((getString(R.string.sia)),R.drawable.sia));
        artists.add(new Album_Artist_Names((getString(R.string.stevie_wonder)),R.drawable.stevie));

        album_artist_adapter adapter=new album_artist_adapter(this,artists);

        ListView listView=(ListView) findViewById(R.id.list2);
        listView.setAdapter(adapter);

    }
}
