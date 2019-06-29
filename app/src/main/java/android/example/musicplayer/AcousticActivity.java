package android.example.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AcousticActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Songs> song = new ArrayList<>();

        song.add(new Songs("Eastside (Acoustic)" , "Eastside (Acoustic)" , "Halsey, Benny Blanco, Khalid "));
        song.add(new Songs("Happy Now (Acoustic)" , "Happy Now (Acoustic)" , "Arkadi, Zedd, Elley Duhe"));
        song.add(new Songs("Circles Acoustic" , "Circles Acoustic" , "Ananya Birla"));
        song.add(new Songs("The Way I Am (Acoustic)" , "The Way I Am (Acoustic)" , "Charlie Puth"));
        song.add(new Songs("Perfect (Acoustic)" , "Perfect (Acoustic)" , "Ed Sheeran "));

        SongAdapter adapter = new SongAdapter(this,song);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
