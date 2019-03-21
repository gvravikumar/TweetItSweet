package com.gvrk.tweetitsweet.Network;

import com.gvrk.tweetitsweet.Models.AuthResponse;
import com.gvrk.tweetitsweet.Models.TweetResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api {
    @GET(ApiUrls.GET_TWEETS)
    Call<TweetResponse> getTweets(@Header("authorization") String token, @Query("q") String query);

    @FormUrlEncoded
    @POST(ApiUrls.AUTH_TOKEN)
    Call<AuthResponse> getBearerToken(@Header("authorization") String encodedParameters, @Field("grant_type") String parameter);
}
