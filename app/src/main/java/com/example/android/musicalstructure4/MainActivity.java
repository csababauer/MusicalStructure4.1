package com.example.android.musicalstructure4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView library = (TextView) findViewById(R.id.musicLibrary);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openMusic = new Intent(MainActivity.this, MusicLibrary.class);
                startActivity(openMusic);
            }
        });

        //retrieve song name
        final String name = getIntent().getStringExtra("songName");


        //pass "stop" method to Song1/Song2/Song3 activity
        Button stopThis = (Button) findViewById(R.id.stop);
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


    }
}
