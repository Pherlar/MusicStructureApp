package com.example.chrisl.musicstructureapp;

public class Soundclip{
    //Default translation for the word /
    private String mSoundclipName;
    private String mSoundclipArtist;
    private String mSoundclipInfo;
    private int photoId;

    //Create new soundclip object
    public Soundclip (String soundclipName, String soundclipArtist, String soundclipInfo)
    {
        mSoundclipName = soundclipName;
        mSoundclipArtist = soundclipArtist;
        mSoundclipInfo = soundclipInfo;
    }

    public String getSoundclipName(){
        return mSoundclipName;
    }

    public String getSoundclipArtist(){
        return mSoundclipArtist;
    }

    public String getSoundclipInfo(){
        return mSoundclipInfo;
    }

}
