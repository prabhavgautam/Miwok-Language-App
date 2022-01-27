package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceID = No_Image_Provided;

    private static int No_Image_Provided = -1;

    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation , int audioResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID , int audioResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceId = audioResourceID;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceID(){ return mImageResourceID;}

    public boolean hasImage(){
        return mImageResourceID != No_Image_Provided;
    }

    public int getAudioResourceId(){
        return mAudioResourceId;
    }
}
