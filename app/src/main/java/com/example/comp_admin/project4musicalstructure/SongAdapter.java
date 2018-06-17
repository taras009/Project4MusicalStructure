package com.example.comp_admin.project4musicalstructure;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Comp_ADmin on 5/15/2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    private int mResourceId;

    public SongAdapter(@NonNull Context context, @NonNull List<Song> objects, int resourceId) {
        super(context, 0, objects);
       mResourceId = resourceId;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_layout, parent, false);
        }
        Song currentSong = getItem(position);
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        artistTextView.setText(currentSong.getMArtistName());
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        songTextView.setText(currentSong.getMSongName());

        /// ***set different colors for different activities
        View textContainer = listItemView.findViewById(R.id.text_container); // TO BE FIXED
        Drawable color = ContextCompat.getDrawable(getContext(), mResourceId );
        textContainer.setBackground(color);

        return listItemView;
    }
}
