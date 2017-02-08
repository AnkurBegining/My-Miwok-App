package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<words> word=new ArrayList<words>();

        word.add(new words("red","wetetti"));
        word.add(new words("mustard yellow","chiwiite"));
        word.add(new words("dusty yellow","topiise"));
        word.add(new words("green","chokokki"));
        word.add(new words("brown","takkaki"));
        word.add(new words("gray","topoppi"));
        word.add(new words("black","kululli"));
        word.add(new words("white","kelelli"));

        WordAdapter adapter=
                new WordAdapter( this ,word);

        ListView listView=(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
