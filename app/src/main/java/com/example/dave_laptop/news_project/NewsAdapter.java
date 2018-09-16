package com.example.dave_laptop.news_project;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

class NewsAdapter extends ArrayAdapter<News> {

    NewsAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (convertView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView titleTextView = listItemView.findViewById(R.id.title_text_view);
        assert currentNews != null;
        String title = currentNews.getmTitle();
        titleTextView.setText(title);

        TextView categoryTextView = listItemView.findViewById(R.id.category_text_view);
        String category = currentNews.getmCategory();
        categoryTextView.setText(category);

        TextView dateTextView = listItemView.findViewById(R.id.date_text_view);
        String date = currentNews.getmDate();
        dateTextView.setText(date);

        TextView authorTextView = listItemView.findViewById(R.id.author_text_view);
        String author = currentNews.getmAuthor();
        authorTextView.setText(author);

        return listItemView;
    }
}


