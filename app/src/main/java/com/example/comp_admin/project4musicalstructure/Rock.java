package com.example.comp_admin.project4musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class Rock extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Imagine Dragons", "Thunder"));
        songs.add(new Song("Imagine Dragons", "Believer"));
        songs.add(new Song("Portugal. The Man", "Feel It Still"));
        songs.add(new Song("Foster The People", "Sit Next To Me"));
        songs.add(new Song("Bad Wolves", "Zombie"));
        songs.add(new Song("Gorillaz Featuring George Benson", "Humility"));
        songs.add(new Song("Weezer", "Africa"));
        songs.add(new Song("Panic! At The Disco", "Say Amen"));
        songs.add(new Song("John Mayer", "New Light"));
        songs.add(new Song("lovelytheband", "Broken"));
        SongAdapter adapter = new SongAdapter(this, songs, R.drawable.rock_background);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
