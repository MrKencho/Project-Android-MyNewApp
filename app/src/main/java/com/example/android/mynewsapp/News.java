package com.example.android.mynewsapp;

/**
 * Created by BaBa_RanChO on 23-05-2017.
 */

public class News {
    private String mNewsHeading;
    private String mNewsSection;
    private String mNewsUrl;
    public News(String newsHeading,String newsSection,String newsUrl)
    {
        mNewsHeading = newsHeading;
        mNewsSection = newsSection;
        mNewsUrl = newsUrl;
    }
    public String getNewsUrl()
    {
        return mNewsUrl;
    }

    public String getNewsHeading() {
        return mNewsHeading;
    }

    public String getNewsSection() {
        return mNewsSection;
    }
}
