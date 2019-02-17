package com.raywenderlich.android.whysoserious;

public class Upload {
    private String mName;
    private String mImageUrl;
    public Upload(){

    }
    public Upload(String name, String imageURL){
        if(name.trim().equals("")){
            name = "No Name";
        }
        mName = name;
        mImageUrl = imageURL;
    }

    public String getmName(){
        return mName;
    }
    public void setmName(String name){
        mName = name;
    }
    public String getmImageUrl(){
        return mImageUrl;
    }
    public void setmImageUrl(String imageUrl){
        mImageUrl = imageUrl;
    }
}

