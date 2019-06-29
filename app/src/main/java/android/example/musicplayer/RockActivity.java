package android.example.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Songs> song = new ArrayList<>();

        song.add(new Songs("Made With Hate" , "Made With Hate" , "Prophets of Rage "));
        song.add(new Songs("Generational Divide" , "Generational Divide" , "Blink-182"));
        song.add(new Songs("HEY CHILD" , " ORION" , "X Ambassadors "));
        song.add(new Songs("Fireman & Dancer" , " Club Majesty" , "Royal Republic"));
        song.add(new Songs("Blue Skies" , " Africa Speaks" , "Santana featuring Buika, Laura Mvula "));
        SongAdapter adapter = new SongAdapter(this,song);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}