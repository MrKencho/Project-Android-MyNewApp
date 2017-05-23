package com.example.android.mynewsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by BaBa_RanChO on 23-05-2017.
 */

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(NewsActivity context, ArrayList<News> news)
    {
        super(context,0,news);
    }
    @Override
    public View getView(int positon, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_list,parent,false);
        }
        News currentNews = getItem(positon);
        TextView newsHeading = (TextView)listItemView.findViewById(R.id.newsHeading);
        newsHeading.setText(currentNews.getNewsHeading());
        TextView newsSection = (TextView) listItemView.findViewById(R.id.newsSection);
        newsSection.setText(currentNews.getNewsSection());
        return listItemView;
    }
}
