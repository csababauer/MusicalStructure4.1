package com.example.android.musicalstructure4;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Csaba on 07/05/2017.
 */

public class Song1 extends AppCompatActivity {

    public static MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song1);

        //start music
        mp = MediaPlayer.create(this, R.raw.fragrance);
        mp.start();


        //"back to playlist" button onClick listener
        TextView back = (TextView) findViewById(R.id.backToPlaylist);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BackToMain = new Intent(Song1.this, MusicLibrary.class);
                BackToMain.putExtra("songName", "1. fragrance / Colorstar");
                startActivity(BackToMain);
            }
        });

        //stop button onClick listener
        Button stopThis = (Button) findViewById(R.id.stopLib);
        stopThis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.stop();
                mp = MediaPlayer.create(Song1.this, R.raw.fragrance);

            }
        });

        //pause song  onClick listener
        Button pauseThis = (Button) findViewById(R.id.pauseLib);
        pauseThis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();

            }
        });


        //resume song onClick listener

        Button resumeThis = (Button) findViewById(R.id.playLib);
        resumeThis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

            }
        });



    }

    //stop song method from MusicLibrary activity
    public static void stopMusic(){
        mp.stop();
        //initialize mediaplayer with current song
        //mp = MediaPlayer.create(Song1.this, R.raw.fragrance);

    }
    //pause song method from MusicLibrary activity
    public static void pauseMusic (){
        mp.pause();
    }
    //start song method from MusicLibrary activity
    public static void playMusic (){
        mp.start();
    }
}

