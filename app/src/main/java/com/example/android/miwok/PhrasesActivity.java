package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;


    private MediaPlayer.OnCompletionListener mMediaResource = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            relaseMediaResource();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);



        final ArrayList<words> word=new ArrayList<words>();

        word.add(new words("where are you going?","minto wuksus",R.raw.phrase_where_are_you_going));
        word.add(new words("What is your name?","tinne oyaase' na", R.raw.phrase_what_is_your_name));
        word.add(new words("My name is...","oyaaset.....", R.raw.phrase_my_name_is));
        word.add(new words("How are you feeling?","michekses?", R.raw.phrase_how_are_you_feeling));
        word.add(new words("I'm feeling good.","kuchi achit", R.raw.phrase_im_feeling_good));
        word.add(new words("Are you coming?","eenes 'aa ", R.raw.phrase_are_you_coming));
        word.add(new words("Yes i am coming.","haa' eenem", R.raw.phrase_yes_im_coming));
        word.add(new words("I'm coming.","eenem", R.raw.phrase_im_coming));
        word.add(new words("Let's go.","yoowutis", R.raw.phrase_lets_go));
        word.add(new words("Come here.","enni' nem", R.raw.phrase_come_here));





        WordAdapter adapter=
                new WordAdapter( this ,word, R.color.category_phrases);

        ListView listView=(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                words w=word.get(position);
                relaseMediaResource();
                 mediaPlayer=MediaPlayer.create(PhrasesActivity.this,w.getmAudioResourceID());
                 mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(mMediaResource);

            }
        });
    }
    @Override
    protected void onStop() {
        super.onStop();
        relaseMediaResource();
    }
    private void relaseMediaResource(){
        if(mediaPlayer !=null){
            mediaPlayer.release();
            mediaPlayer =null;
        }
    }
}
