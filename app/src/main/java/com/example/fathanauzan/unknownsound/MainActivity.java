package com.example.fathanauzan.unknownsound;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.fathanauzan.unknownsound.R;

public class MainActivity extends AppCompatActivity {
    private static final String isPlaying = "Media is Playing";
    MediaPlayer player;
    Button btn1, btn2, btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.tombolsatu);
        btn2 = (Button) findViewById(R.id.tomboldua);
        btn3 = (Button) findViewById(R.id.tomboltiga);
        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(1);
            }
        });
        btn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(2);
            }
        });
        btn3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                playSound(3);
            }
        });
    }

    public void onPause() {
        try {
            super.onPause();
            player.pause();
        } catch (Exception e) {
        }
    }

    private void playSound(int arg) {
        try {
            if (player.isPlaying());{
                player.stop();
                player.release();

            }
        }catch (Exception e){
        }
        if (arg == 1){
            player = MediaPlayer.create(this, R.raw.kunti1);
        }
        if (arg == 2){
            player = MediaPlayer.create(this, R.raw.kunti2);
        }
        if (arg == 3){
            player = MediaPlayer.create(this, R.raw.kunti3);
        }
        player.setLooping(false);
        player.start();
    }
}