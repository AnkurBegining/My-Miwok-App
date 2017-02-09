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

        word.add(new words("one","lutti",R.drawable.number_one));
        word.add(new words("two","otiiko",R.drawable.number_two));
        word.add(new words("three","tolookosu",R.drawable.number_three));
        word.add(new words("four","oyyisa",R.drawable.number_four));
        word.add(new words("five","massokka",R.drawable.number_five));
        word.add(new words("six","temmokka",R.drawable.number_six));
        word.add(new words("seven","kenekaku",R.drawable.number_seven));
        word.add(new words("eight","kawinta",R.drawable.number_eight));
        word.add(new words("nine","wo'e",R.drawable.number_nine));
        word.add(new words("ten","na'aacha",R.drawable.number_ten));





         WordAdapter adapter=
                new WordAdapter( this ,word);

        ListView listView=(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);




    }
}
