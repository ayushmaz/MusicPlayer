package android.example.musicplayer;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EdmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Songs> song = new ArrayList<>();

        song.add(new Songs("Let Me Love You" , "Encore" , "Dj Snake,Justin Bieber"));
        song.add(new Songs("Faded" , "Faded" , "Alan Walker"));
        song.add(new Songs("Closer" , "Closer" , "Hasley,The Chainsmokers"));
        song.add(new Songs("Taki Taki" , "Taki Taki" , "Dj Snake,Ozuna,Selena Gomez"));
        song.add(new Songs("Don\'t Let Me Down" , "Don\'t Let Me Down" , "Daya,The Chainsmokers"));
        song.add(new Songs("Alone" , "Alone" , "Alan Walker"));

        SongAdapter adapter = new SongAdapter(this,song);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);



    }
}
