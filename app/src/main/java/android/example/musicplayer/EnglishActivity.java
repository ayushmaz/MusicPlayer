package android.example.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EnglishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Songs> song = new ArrayList<>();

        song.add(new Songs("On My Way" , "On My Way" , "Alan Walker,Sabrina Carpenter"));
        song.add(new Songs("Señorita" , "Señorita" , "Camila Cabello, Shawn Mendes "));
        song.add(new Songs("If I Can't Have You" , "If I Can't Have You" , "Shawn Mendes"));
        song.add(new Songs("Old Town Road (Remix)" , "Old Town Road (Remix)" , "Lil Nas X featuring Billy Ray Cyrus "));
        song.add(new Songs("I Can't Get Enough" , "I Can't Get Enough" , "J. Balvin, Tainy, Benny Blanco, Selena Gomez"));
        song.add(new Songs("Believer" , "Evolve" , "Imagine Dragons"));

        SongAdapter adapter = new SongAdapter(this,song);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
