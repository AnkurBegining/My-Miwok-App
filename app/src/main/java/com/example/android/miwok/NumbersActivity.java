package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<words> word=new ArrayList<words>();

        word.add(new words("one","lutti"));
        word.add(new words("two","otiiko"));
        word.add(new words("three","tolookosu"));
        word.add(new words("four","oyyisa"));
        word.add(new words("five","massokka"));
        word.add(new words("six","temmokka"));
        word.add(new words("seven","kenekaku"));
        word.add(new words("eight","kawinta"));
        word.add(new words("nine","wo'e"));
        word.add(new words("ten","na'aacha"));





         WordAdapter adapter=
                new WordAdapter( this ,word);

        ListView listView=(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);




    }
}
