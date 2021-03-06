package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lenovo on 07-02-2017.
 */

public class WordAdapter extends ArrayAdapter<words> {

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<words> androidFlavors ,int colorResourceId) {

        super(context, 0, androidFlavors);
        mColorResourceId=colorResourceId;
    }



    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        words currentWord = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        nameTextView.setText(currentWord.getmDefaultTranslation());


        TextView numberTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        numberTextView.setText(currentWord.getmMiwokTranslation());

        ImageView iconImageView = (ImageView) listItemView.findViewById(R.id.icon_image_view);
        if(currentWord.hasImage()){
            iconImageView.setImageResource(currentWord.getImageResourceId());
            iconImageView.setVisibility(View.VISIBLE);
        }
        else{
            iconImageView.setVisibility(View.GONE);
        }
        //Set the theme color for List item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //Find the color that resource color match to
        int color= ContextCompat.getColor(getContext(),mColorResourceId);
        //Set the backGround color to textContainer view
        textContainer.setBackgroundColor(color);



        return listItemView;
    }
}
