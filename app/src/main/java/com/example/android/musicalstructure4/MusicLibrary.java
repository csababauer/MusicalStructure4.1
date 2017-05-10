package com.example.android.musicalstructure4;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.musicalstructure4.MainActivity;
import com.example.android.musicalstructure4.R;
import com.example.android.musicalstructure4.Song1;
import com.example.android.musicalstructure4.Song2;
import com.example.android.musicalstructure4.Song3;

import static android.R.attr.name;

/**
 * Created by Csaba on 03/05/2017.
 */

public class MusicLibrary extends AppCompatActivity {

    public MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_library);


        //back to main button onClick listener
        TextView back = (TextView) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BackToMain = new Intent(MusicLibrary.this, MainActivity.class);
                BackToMain.putExtra("Song", name);
                startActivity(BackToMain);
            }
        });

        //go to song one
        ImageView song1 = (ImageView) findViewById(R.id.playOne);
        song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoSong1 = new Intent(MusicLibrary.this, Song1.class);
                startActivity(GoSong1);
                //display the name of the first song
                TextView Current = (TextView) findViewById(R.id.currentSong);
                Current.setText(R.string.song1);

            }
        });

        //go to song two
        ImageView song2 = (ImageView) findViewById(R.id.playTwo);
        song2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoSong2 = new Intent(MusicLibrary.this, Song2.class);
                startActivity(GoSong2);
                //display the name of the first song
                TextView Current = (TextView) findViewById(R.id.currentSong);
                Current.setText(R.string.song2);

            }
        });

        //go to song three
        ImageView song3 = (ImageView) findViewById(R.id.playThree);
        song3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GoSong3 = new Intent(MusicLibrary.this, Song3.class);
                startActivity(GoSong3);
                //display the name of the first song
                TextView Current = (TextView) findViewById(R.id.currentSong);
                Current.setText(R.string.song3);
            }
        });


        //retrieve song name
        final String name = getIntent().getStringExtra("songName");
        final TextView Current = (TextView) findViewById(R.id.currentSong);
        Current.setText(name);


        //pass "stop" method to Song1/Song2/Song3 activity
        Button stopThis = (Button) findViewById(R.id.stopLib);
        stopThis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (name) {
                    case "1. fragrance / Colorstar":
                        Song1 pass = new Song1();
                        pass.stopMusic();
                        break;
                    case "2. endeux / ZAGAR":
                        //Song2 Activity:
                        Song2 pass2 = new Song2();
                        pass2.stopMusic2();
                        break;
                    case "3. rollerskate / Colorstar":
                        Song3 pass3 = new Song3();
                        pass3.stopMusic3();
                        break;

                }
            }
        });


        //pass "pause" method to Song1/Song2/Song3 activity
        Button pauseThis = (Button) findViewById(R.id.pauseLib);
        pauseThis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (name) {
                    case "1. fragrance / Colorstar":
                        Song1 passPause = new Song1();
                        passPause.pauseMusic();
                        break;
                    case "2. endeux / ZAGAR":
                        Song2 passPause2 = new Song2();
                        passPause2.pauseMusic2();
                        break;
                    case "3. rollerskate / Colorstar":
                        Song3 passPause3 = new Song3();
                        passPause3.pauseMusic3();
                        break;

                }
            }
        });

        //pass "play" method to Song1 activity
        Button playThis = (Button) findViewById(R.id.playLib);
        playThis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (name) {
                    case "1. fragrance / Colorstar":
                        Song1 passPlay = new Song1();
                        passPlay.playMusic();
                        break;
                    case "2. endeux / ZAGAR":
                        Song2 passPlay2 = new Song2();
                        passPlay2.playMusic2();
                        break;
                    case "3. rollerskate / Colorstar":
                        Song3 passPlay3 = new Song3();
                        passPlay3.playMusic3();
                        break;

                }
            }
        });

    }
}











