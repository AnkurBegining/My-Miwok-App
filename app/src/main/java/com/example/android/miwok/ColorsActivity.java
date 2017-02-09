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

        word.add(new words("red","wetetti",R.drawable.color_red));
        word.add(new words("mustard yellow","chiwiite",R.drawable.color_mustard_yellow));
        word.add(new words("dusty yellow","topiise",R.drawable.color_dusty_yellow));
        word.add(new words("green","chokokki",R.drawable.color_green));
        word.add(new words("brown","takkaki",R.drawable.color_brown));
        word.add(new words("gray","topoppi",R.drawable.color_gray));
        word.add(new words("black","kululli",R.drawable.color_black));
        word.add(new words("white","kelelli",R.drawable.color_white));

        WordAdapter adapter=
                new WordAdapter( this ,word);

        ListView listView=(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
