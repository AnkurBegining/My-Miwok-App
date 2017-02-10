package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private MediaPlayer.OnCompletionListener mMediaResource = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releseMediaResource();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        final ArrayList<words> word=new ArrayList<words>();

        word.add(new words("red","wetetti",R.drawable.color_red,R.raw.color_red));
        word.add(new words("mustard yellow","chiwiite",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));
        word.add(new words("dusty yellow","topiise",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        word.add(new words("green","chokokki",R.drawable.color_green,R.raw.color_green));
        word.add(new words("brown","takkaki",R.drawable.color_brown,R.raw.color_brown));
        word.add(new words("gray","topoppi",R.drawable.color_gray,R.raw.color_gray));
        word.add(new words("black","kululli",R.drawable.color_black,R.raw.color_black));
        word.add(new words("white","kelelli",R.drawable.color_white,R.raw.color_white));

        WordAdapter adapter=
                new WordAdapter( this ,word, R.color.category_colors);

        ListView listView=(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                words w=word.get(position);
                releseMediaResource();
                mediaPlayer=MediaPlayer.create(ColorsActivity.this,w.getmAudioResourceID());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(mMediaResource);

            }
        });
    }
    @Override
    protected void onStop() {
        super.onStop();
        releseMediaResource();
    }

    private void releseMediaResource(){
        if(mediaPlayer !=null){
            mediaPlayer.release();
            mediaPlayer=null;
        }
    }
}
