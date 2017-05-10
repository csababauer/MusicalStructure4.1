package com.example.android.musicalstructure4;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Csaba on 09/05/2017.
 */

public class Song3 extends AppCompatActivity {

    public static MediaPlayer mp3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song3);

        //start music
        mp3 = MediaPlayer.create(this, R.raw.rollerskate);
        mp3.start();

        //"back to playlist" button onClick listener
        TextView back = (TextView) findViewById(R.id.backToPlaylist);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BackToMain = new Intent(Song3.this, MusicLibrary.class);
                BackToMain.putExtra("songName", "3. rollerskate / Colorstar");
                startActivity(BackToMain);
            }
        });

        //stop button onClick listener
        Button stopThis = (Button) findViewById(R.id.stop3B);
        stopThis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp3.stop();
                mp3 = MediaPlayer.create(Song3.this, R.raw.rollerskate);

            }
        });


        //pause song  onClick listener
        Button pauseThis = (Button) findViewById(R.id.pause3B);
        pauseThis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.pause();

            }
        });


        //resume song onClick listener
        Button resumeThis = (Button) findViewById(R.id.play3B);
        resumeThis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();

            }
        });

    }


    //stop song method from MusicLibrary activity
    public static void stopMusic3(){
        mp3.stop();
        //mp = MediaPlayer.create(Song3.this, R.raw.fragrance);


    }
    //pause song method from MusicLibrary activity
    public static void pauseMusic3 (){
        mp3.pause();
    }
    //start song method from MusicLibrary activity
    public static void playMusic3 (){
        mp3.start();
    }

}