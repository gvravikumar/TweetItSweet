package com.gvrk.tweetitsweet.Repositories;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.gvrk.tweetitsweet.Models.AuthResponse;
import com.gvrk.tweetitsweet.Models.TweetResponse;
import com.gvrk.tweetitsweet.Network.Api;
import com.gvrk.tweetitsweet.Network.ApiClient;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TweetRepository {
    private Api api;

    public TweetRepository() {
        api = ApiClient.getClient().create(Api.class);
    }

    private TweetResponse tweetResponse = new TweetResponse();


    public LiveData<TweetResponse> getTweets(String token, String key) {
        final MutableLiveData<TweetResponse> data = new MutableLiveData<>();

        Call<TweetResponse> call = api.getTweets(token, key);
        call.enqueue(new Callback<TweetResponse>() {
            @Override
            public void onResponse(@NonNull Call<TweetResponse> call, @NonNull Response<TweetResponse> response) {
                if (response.isSuccessful()) {
                    assert response.body() != null;
                    tweetResponse = response.body();
                    data.setValue(tweetResponse);
                } else {
                    JsonObject errorObject = null;
                    try {
                        errorObject = new JsonParser().parse(response.errorBody().string()).getAsJsonObject();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    String errormessage = String.valueOf(errorObject.getAsJsonArray("errors").get(0).getAsJsonObject().get("message"));
                    tweetResponse.setError(errormessage);
                    data.setValue(tweetResponse);
                }
            }

            @Override
            public void onFailure(@NonNull Call<TweetResponse> call, @NonNull Throwable t) {
                TweetResponse tweetResponse = new TweetResponse();
                data.setValue(tweetResponse);
            }
        });

        return data;
    }

    public LiveData<AuthResponse> getBearerToken(String encodedParameters) {
        final MutableLiveData<AuthResponse> data = new MutableLiveData<>();
        final AuthResponse authResponse = new AuthResponse();
        Call<AuthResponse> call = api.getBearerToken(encodedParameters, "client_credentials");
        call.enqueue(new Callback<AuthResponse>() {
            @Override
            public void onResponse(@NonNull Call<AuthResponse> call, @NonNull Response<AuthResponse> response) {
                if (response.isSuccessful()) {
                    authResponse.setTokenType(response.body().getTokenType());
                    authResponse.setAccessToken(response.body().getAccessToken());
                    authResponse.setError(null);
                    data.setValue(authResponse);
                } else {
                    JsonObject errorObject = null;
                    try {
                        errorObject = new JsonParser().parse(response.errorBody().string()).getAsJsonObject();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    authResponse.setError(errorObject.get("message").getAsString());
                    data.setValue(authResponse);
                }
            }

            @Override
            public void onFailure(@NonNull Call<AuthResponse> call, @NonNull Throwable t) {
                authResponse.setError(t.getMessage());
                data.setValue(authResponse);
            }
        });

        return data;
    }
}
