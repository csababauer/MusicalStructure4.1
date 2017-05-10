package com.example.android.musicalstructure4;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Csaba on 08/05/2017.
 */

public class Song2 extends AppCompatActivity {

    public static MediaPlayer mp2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song2);

        //start music
        mp2 = MediaPlayer.create(this, R.raw.endeux);
        mp2.start();

        //"back to playlist" button onClick listener
        TextView back = (TextView) findViewById(R.id.backToPlaylist);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BackToMain = new Intent(Song2.this, MusicLibrary.class);
                BackToMain.putExtra("songName", "2. endeux / ZAGAR");
                startActivity(BackToMain);
            }
        });

        //stop button onClick listener
        Button stopThis = (Button) findViewById(R.id.stop2B);
        stopThis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp2.stop();
                mp2 = MediaPlayer.create(Song2.this, R.raw.endeux);

            }
        });


        //pause song  onClick listener
        Button pauseThis = (Button) findViewById(R.id.pause2B);
        pauseThis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.pause();

            }
        });


        //resume song onClick listener
        Button resumeThis = (Button) findViewById(R.id.play2B);
        resumeThis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();

            }
        });
    }

    //stop song method from MusicLibrary activity
    public static void stopMusic2() {
        mp2.stop();
        //mp = MediaPlayer.create(Song2.this, R.raw.fragrance);

    }

    //pause song method from MusicLibrary activity
    public static void pauseMusic2() {
        mp2.pause();
    }

    //start song method from MusicLibrary activity
    public static void playMusic2() {
        mp2.start();
    }
}
