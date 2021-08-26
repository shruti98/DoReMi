package com.example.android.project2music;


public class Album_Artist_Names {

    private String album_artist_name;
    private int image_id;

    public Album_Artist_Names(String name, int img)
    {
        album_artist_name=name;
        image_id=img;
    }

    public String getName()
    {return album_artist_name;}

    public int getPic()
    {
        return image_id;
    }
}
