package com.example.android.miwok;

/**
 * Created by Lenovo on 07-02-2017.
 */

public class words {

    private String mDefaultTranslation;
    private  String mMiwokTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceID;

    public  words(String defaultTranslation, String miwokTranslation, int audioResourceID){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mAudioResourceID=audioResourceID;
    }

    public  words(String defaultTranslation, String miwokTranslation,int imageResourceId, int audioResourceID){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId=imageResourceId;
        mAudioResourceID=audioResourceID;

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

    public int getmAudioResourceID() {
        return mAudioResourceID;
    }

    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }
}
