package com.example.comp_admin.project4musicalstructure;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Comp_ADmin on 5/15/2018.
 */

public class Pop extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Post Malone Featuring Ty Dolla $ign", "Psycho"));
        songs.add(new Song("Zedd, Maren Morris & Grey", "The Middle"));
        songs.add(new Song("Bazzi", "Mine"));
        songs.add(new Song("Camila Cabello", "Never Be The Same"));
        songs.add(new Song("Maroon 5", "Wait"));
        songs.add(new Song("Ariana Grande", "No Tears Left To Cry"));
        songs.add(new Song("Marshmello & Anne-Marie", "Friends"));
        songs.add(new Song("Imagine Dragons", "Whatever It Takes"));
        songs.add(new Song("Shawn Mendes", "In My Blood"));
        songs.add(new Song("Taylor Swift", "Delicate"));
        SongAdapter adapter = new SongAdapter(this, songs, R.drawable.electronic_background);
        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Pop.this, "Music playing...", Toast.LENGTH_SHORT).show();



            }
        });
    }
}
