package com.gvrk.tweetitsweet.ViewModels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.google.gson.JsonObject;
import com.gvrk.tweetitsweet.Models.AuthResponse;
import com.gvrk.tweetitsweet.Models.TweetResponse;
import com.gvrk.tweetitsweet.Repositories.TweetRepository;

import org.json.JSONObject;

public class TweetViewModel extends ViewModel {
    private TweetRepository tweetRepository;

    public LiveData<AuthResponse> getBearerToken(String encodedParameters) {
        return tweetRepository.getBearerToken(encodedParameters);
    }

    public LiveData<TweetResponse> getTweetResponse(String token, String key) {
        return tweetRepository.getTweets(token, key);
    }

    public TweetViewModel() {
        tweetRepository = new TweetRepository();
    }
}
