package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    private  MediaPlayer mediaPlayer;
    private MediaPlayer.OnCompletionListener mMediaResource =new MediaPlayer.OnCompletionListener() {
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

        word.add(new words("father","epe",R.drawable.family_father,R.raw.family_father));
        word.add(new words("mother","eta",R.drawable.family_mother,R.raw.family_mother));
        word.add(new words("son","angsi",R.drawable.family_son,R.raw.family_son));
        word.add(new words("daughter","tune",R.drawable.family_daughter,R.raw.family_daughter));
        word.add(new words("older brother","taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
        word.add(new words("younger brother","chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        word.add(new words("older sister","tete",R.drawable.family_older_sister,R.raw.family_older_sister));
        word.add(new words("younger sister","kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        word.add(new words("grandmother","ama",R.drawable.family_grandmother,R.raw.family_grandmother));
        word.add(new words("grandfather","pappa",R.drawable.family_grandfather,R.raw.family_grandfather));





        WordAdapter adapter=
                new WordAdapter( this ,word, R.color.category_family);

        ListView listView=(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                words w=word.get(position);
                releseMediaResource();
                mediaPlayer=MediaPlayer.create(FamilyActivity.this,w.getmAudioResourceID());
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
            mediaPlayer =null;
        }
    }
}
