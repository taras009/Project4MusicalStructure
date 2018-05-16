package com.example.comp_admin.project4musicalstructure;

/**
 * Created by Comp_ADmin on 5/15/2018.
 */

public class Song {
    /***name of the artist ***/
    private String mArtistName;

    /***name of the composition***/
    private String mSongName;

    public Song(String artistName, String songNamen){
        mArtistName = artistName;
        mSongName = songNamen;
    }

    public String getMArtistName() {
        return mArtistName;
    }

    public String getMSongName() {
        return mSongName;
    }
}
