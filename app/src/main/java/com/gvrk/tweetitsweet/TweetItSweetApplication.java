package com.gvrk.tweetitsweet;

import android.app.Application;

public class TweetItSweetApplication extends Application {

    private static TweetItSweetApplication tweetItSweetApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        tweetItSweetApplication = this;
    }

    public static TweetItSweetApplication getApplication() {
        return tweetItSweetApplication;
    }

}
