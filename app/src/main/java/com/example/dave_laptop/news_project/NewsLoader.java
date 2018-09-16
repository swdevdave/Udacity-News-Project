package com.example.dave_laptop.news_project;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

class NewsLoader extends AsyncTaskLoader<List<News>> {

    /** Tag for log messages */
    private static final String LOG_TAG = NewsLoader.class.getName();

    /** Query URL */
    private String mUrl;

    //private final static String API = "d53a4f2e-edce-405c-b888-0a3736929d1b";
    // URL of content
    //private static final String GUARDIAN_URL = "http://content.guardianapis.com/search?show-tags=contributor&api-key=" + API ;

    public NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
    if (mUrl == null){
        return null;
    }
        return QueryUtils.fetchNewsData(mUrl);
    }
}