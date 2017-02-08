package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<words> word=new ArrayList<words>();

        word.add(new words("father","epe"));
        word.add(new words("mother","eta"));
        word.add(new words("son","angsi"));
        word.add(new words("daughter","tune"));
        word.add(new words("older brother","taachi"));
        word.add(new words("younger brother","chalitti"));
        word.add(new words("older sister","tete"));
        word.add(new words("younger sister","kolliti"));
        word.add(new words("grandmother","ama"));
        word.add(new words("grandfather","pappa"));





        WordAdapter adapter=
                new WordAdapter( this ,word);

        ListView listView=(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
