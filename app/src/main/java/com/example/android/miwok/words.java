package com.example.android.miwok;

/**
 * Created by Lenovo on 07-02-2017.
 */

public class words {

    private String mDefaultTranslation;
    private  String mMiwokTranslation;

    public  words(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
    }

    public String getmDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation()
    {
        return  mMiwokTranslation;
    }
}
