package android.example.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout edm = (RelativeLayout) findViewById(R.id.edm_view);
        RelativeLayout rock = (RelativeLayout) findViewById(R.id.rock_view);
        RelativeLayout english = (RelativeLayout) findViewById(R.id.english_view);
        RelativeLayout acoustic = (RelativeLayout) findViewById(R.id.acoustic_view);

        edm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent edmActivity = new Intent(MainActivity.this , EdmActivity.class);
                startActivity(edmActivity);
            }
        });

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rockActivity = new Intent(MainActivity.this , RockActivity.class);
                startActivity(rockActivity);
            }
        });

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent englishActivity = new Intent(MainActivity.this , EnglishActivity.class);
                startActivity(englishActivity);
            }
        });

        acoustic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acousticActivity = new Intent(MainActivity.this , AcousticActivity.class);
                startActivity(acousticActivity);
            }
        });
    }
}
