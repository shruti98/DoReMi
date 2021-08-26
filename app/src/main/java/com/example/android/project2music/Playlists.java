package com.example.android.project2music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Playlists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        ImageView back = (ImageView) findViewById(R.id.iv_back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Playlists.this, Home.class);
                startActivity(back);
            }
        });

        ImageView settings = (ImageView) findViewById(R.id.iv_settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settings = new Intent(Playlists.this, Settings.class);
                startActivity(settings);
            }
        });

        TextView classics = (TextView) findViewById(R.id.tv_classics);
        classics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView classic1 = (TextView) findViewById(R.id.tv_classic1);
                TextView classic2 = (TextView) findViewById(R.id.tv_classic2);
                TextView classic3 = (TextView) findViewById(R.id.tv_classic3);
                TextView classic4 = (TextView) findViewById(R.id.tv_classic4);
                TextView classic5 = (TextView) findViewById(R.id.tv_classic5);
                TextView classic6 = (TextView) findViewById(R.id.tv_classic6);
                if (classic1.getVisibility() == View.GONE)
                {
                    classic1.setVisibility(View.VISIBLE);
                    classic2.setVisibility(View.VISIBLE);
                    classic3.setVisibility(View.VISIBLE);
                    classic4.setVisibility(View.VISIBLE);
                    classic5.setVisibility(View.VISIBLE);
                    classic6.setVisibility(View.VISIBLE);
                }
                else {
                    classic1.setVisibility(View.GONE);
                    classic2.setVisibility(View.GONE);
                    classic3.setVisibility(View.GONE);
                    classic4.setVisibility(View.GONE);
                    classic5.setVisibility(View.GONE);
                    classic6.setVisibility(View.GONE);
                }
            }
        });

        TextView fave = (TextView) findViewById(R.id.tv_favourites);
        fave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView fave1 = (TextView) findViewById(R.id.tv_fave1);
                TextView fave2 = (TextView) findViewById(R.id.tv_fave2);
                TextView fave3 = (TextView) findViewById(R.id.tv_fave3);
                TextView fave4 = (TextView) findViewById(R.id.tv_fave4);
                TextView fave5 = (TextView) findViewById(R.id.tv_fave5);
                if (fave1.getVisibility() == View.GONE)
                {
                    fave1.setVisibility(View.VISIBLE);
                    fave2.setVisibility(View.VISIBLE);
                    fave3.setVisibility(View.VISIBLE);
                    fave4.setVisibility(View.VISIBLE);
                    fave5.setVisibility(View.VISIBLE);
                }
                else {
                    fave1.setVisibility(View.GONE);
                    fave2.setVisibility(View.GONE);
                    fave3.setVisibility(View.GONE);
                    fave4.setVisibility(View.GONE);
                    fave5.setVisibility(View.GONE);
                }
            }
        });

        TextView kpop = (TextView) findViewById(R.id.tv_kpop);
        kpop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView kpop1 = (TextView) findViewById(R.id.tv_kpop1);
                TextView kpop2 = (TextView) findViewById(R.id.tv_kpop2);
                TextView kpop3 = (TextView) findViewById(R.id.tv_kpop3);
                if (kpop1.getVisibility() == View.GONE) {
                    kpop1.setVisibility(View.VISIBLE);
                    kpop2.setVisibility(View.VISIBLE);
                    kpop3.setVisibility(View.VISIBLE);
                } else {
                    kpop1.setVisibility(View.GONE);
                    kpop2.setVisibility(View.GONE);
                    kpop3.setVisibility(View.GONE);
                }
            }
        });

    }
}
