package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        ArrayList<words> word=new ArrayList<words>();

        word.add(new words("where are you going?","minto wuksus"));
        word.add(new words("What is your name?","tinne oyaase' na"));
        word.add(new words("My name is...","oyaaset....."));
        word.add(new words("How are you feeling?","michekses?"));
        word.add(new words("I'm feeling good.","kuchi achit"));
        word.add(new words("Are you coming?","eenes 'aa "));
        word.add(new words("Yes i am coming.","haa' eenem"));
        word.add(new words("I'm coming.","eenem"));
        word.add(new words("Let's go.","yoowutis"));
        word.add(new words("Come here.","enni' nem"));





        WordAdapter adapter=
                new WordAdapter( this ,word);

        ListView listView=(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
