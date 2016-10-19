package com.example.android.miwok;

/**
 * Created by Workspace on 10/13/2016.
 */

public class Word {
    //This variable store the state of the Word as default transalation (eg.one)
    private String defaultTranslation;
    //This variables store the miwork translation of the word(eg.lutti)
    private String miwordTranslation;
    //This is used to store image (eg R.drawable.mypic)
    private int myImageID=NO_IMAGE_PROVIDED;
    //This is used to store audio(eg audio for pronuounciation)
    private int mySoundClip;

    //This is for storig the imageid default to null
    private static final int NO_IMAGE_PROVIDED=-1;

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwordTranslation() {
        return miwordTranslation;
    }

    public int getMyImageID() {
        return myImageID;
    }

    public int getMySoundClip() {
        return mySoundClip;
    }

    public Word(String defaultTranslation, String miwordTranslation, int imageID,int sound) {
        this.defaultTranslation = defaultTranslation;
        this.miwordTranslation = miwordTranslation;
        this.myImageID = imageID;
        this.mySoundClip=sound;
    }

    public Word(String defaultTranslation, String miwordTranslation,int sound) {

        this.defaultTranslation = defaultTranslation;
        this.miwordTranslation = miwordTranslation;
        this.mySoundClip=sound;

     /*   this.mySoundClip = mySoundClip;*/
    }

    /* This method help to find the state of image whether image is there or not*/

    public boolean hasImage(){
        return myImageID!=NO_IMAGE_PROVIDED;
    }


}
