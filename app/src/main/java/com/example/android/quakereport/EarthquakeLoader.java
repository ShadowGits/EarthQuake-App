package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    private String urls;
    public EarthquakeLoader(Context context, String url) {
        super(context);
        urls=url;
        // TODO: Finish implementing this  constructor
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        // TODO: Implement this method
        if (urls.length() < 1 || urls == null) {
            return null;
        }

        List<Earthquake> result = QueryUtils.fetchEarthquakeData(urls);
        return result;
    }
}