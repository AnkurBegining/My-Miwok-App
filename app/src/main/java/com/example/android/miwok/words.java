package com.example.android.miwok;

/**
 * Created by Lenovo on 07-02-2017.
 */

public class words {

    private String mDefaultTranslation;
    private  String mMiwokTranslation;
    private int mImageResourceId;

    public  words(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
    }

    public  words(String defaultTranslation, String miwokTranslation,int imageResourceId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId=imageResourceId;

    }

    public String getmDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation()
    {
        return  mMiwokTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }
}
