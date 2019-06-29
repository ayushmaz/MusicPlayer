package android.example.musicplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SongAdapter extends ArrayAdapter<Songs> {

    public SongAdapter(@NonNull Context context, ArrayList<Songs> listSong) {
        super(context, 0 , listSong);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Songs currentWord = getItem(position);

        TextView songName = (TextView) listItemView.findViewById(R.id.song_name);
        songName.setText(currentWord.getSongName());

        TextView albumName = (TextView) listItemView.findViewById(R.id.album_name);
        albumName.setText(currentWord.getAlbumName());

        TextView singersName = (TextView)  listItemView.findViewById(R.id.singer_name);
        singersName.setText(currentWord.getSingers());

        return listItemView;


    }
}
