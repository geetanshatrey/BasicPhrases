package com.spikedshark.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int tapped;
    MediaPlayer media;
    public void playAudio(View view)
    {
        Button button=(Button) view;
        tapped=Integer.parseInt(button.getTag().toString());
        TextView word= findViewById(R.id.french);
        switch (tapped)
        {
            case 1: media=MediaPlayer.create(this,R.raw.hello);
                    word.setText("Bonjour !");
                    word.setVisibility(view.VISIBLE);
                    break;
            case 2: media=MediaPlayer.create(this,R.raw.welcome);
                    word.setText("Bienvenue !");
                    word.setVisibility(view.VISIBLE);
                    break;
            case 3: media=MediaPlayer.create(this,R.raw.howareyou);
                    word.setText("Ça va ?");
                    word.setVisibility(view.VISIBLE);
                    break;
            case 4: media=MediaPlayer.create(this,R.raw.goodevening);
                    word.setText("Bonsoir !");
                    word.setVisibility(view.VISIBLE);
                    break;
            case 5: media=MediaPlayer.create(this,R.raw.please);
                    word.setText("S'il vous plaît !");
                    word.setVisibility(view.VISIBLE);
                    break;
            case 6: media=MediaPlayer.create(this,R.raw.mynameis);
                    word.setText("Je m'appelle ...");
                    word.setVisibility(view.VISIBLE);
                    break;
            case 7: media=MediaPlayer.create(this,R.raw.ilivein);
                    word.setText("J'habite à ...");
                    word.setVisibility(view.VISIBLE);
                    break;
            case 8: media=MediaPlayer.create(this,R.raw.doyouspeakenglish);
                    word.setText("Tu parles anglais ?");
                    word.setVisibility(view.VISIBLE);
                    break;
            default:
                    break;
        }
        media.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
