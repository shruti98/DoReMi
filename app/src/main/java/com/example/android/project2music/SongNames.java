package com.example.android.project2music;

public class SongNames {

    private String SongName, ArtistName;
    private int AudioResourceId;

    SongNames(String songname,String artistname, int audioResourceId)
    {
        SongName=songname;
        ArtistName=artistname;
        AudioResourceId=audioResourceId;

    }

    public String getSongName()
    {return SongName;}

    public String getArtistName()
    {return  ArtistName;}

    public int getAudioResourceId() {
        return AudioResourceId;
    }
}
