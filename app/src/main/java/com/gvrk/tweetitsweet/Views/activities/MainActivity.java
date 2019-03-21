package com.gvrk.tweetitsweet.Views.activities;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.gvrk.tweetitsweet.Adapters.TweetRvAdapter;
import com.gvrk.tweetitsweet.BaseActivity;
import com.gvrk.tweetitsweet.Models.AuthResponse;
import com.gvrk.tweetitsweet.Models.TweetResponse;
import com.gvrk.tweetitsweet.R;
import com.gvrk.tweetitsweet.ViewModels.TweetViewModel;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends BaseActivity {

    TweetViewModel tweetViewModel;
    TweetResponse tweetResponse;
    EditText et_search_tweet;
    TextView tv_sort;
    RecyclerView rv_tweets;
    TweetRvAdapter tweetRvAdapter;
    public String bearerToken;
    public String base64Encoded;

    final static String CONSUMER_KEY = "9n6AXUV5Kth5QVRhsJdu65tAi";
    final static String CONSUMER_SECRET = "AKuVexRkoVH5bP3AO16AJAW1XPucNbywJphGMBjr7e3lw8XRZS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_tweets = findViewById(R.id.rv_tweets);
        et_search_tweet = findViewById(R.id.et_search_tweet);
        tv_sort = findViewById(R.id.tv_sort);

        rv_tweets.setLayoutManager(new LinearLayoutManager(this));

        tweetViewModel = ViewModelProviders.of(this).get(TweetViewModel.class);

        try {
            // URL encode the consumer key and secret
            // Concatenate the encoded consumer key, a colon character, and the encoded consumer secret
            // Base64 encode the string
            base64Encoded = "Basic " + Base64.encodeToString((URLEncoder.encode(CONSUMER_KEY, "UTF-8")
                    + ":"
                    + URLEncoder.encode(CONSUMER_SECRET, "UTF-8")).getBytes(), Base64.NO_WRAP);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        showProgress();
        tweetViewModel.getBearerToken(base64Encoded).observe(MainActivity.this, new Observer<AuthResponse>() {
            @Override
            public void onChanged(@Nullable AuthResponse response) {
                bearerToken = response.getTokenType() + " " + response.getAccessToken();
                tweetViewModel.getTweetResponse(bearerToken, "twitter").observe(MainActivity.this, new Observer<TweetResponse>() {
                    @Override
                    public void onChanged(@Nullable TweetResponse Response) {
                        tweetResponse = Response;
                        tweetRvAdapter = new TweetRvAdapter(Response.getStatuses(), MainActivity.this);
                        rv_tweets.setAdapter(tweetRvAdapter);
                        dismissProgress();
                    }
                });

            }
        });

        tv_sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Collections.sort(tweetResponse.getStatuses(), new Comparator<TweetResponse.Status>() {
                    @Override
                    public int compare(TweetResponse.Status o1, TweetResponse.Status o2) {
                        return String.valueOf(o2.getRetweetCount()).compareTo(String.valueOf(o1.getRetweetCount()));
                    }
                });
                rv_tweets.setAdapter(new TweetRvAdapter(tweetResponse.getStatuses(), MainActivity.this));
            }
        });

        et_search_tweet.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().length() > 2) {
                    showProgress();
                    tweetViewModel.getTweetResponse(bearerToken, s.toString()).observe(MainActivity.this, new Observer<TweetResponse>() {
                        @Override
                        public void onChanged(@Nullable TweetResponse Response) {
                            tweetResponse = Response;
                            tweetRvAdapter = new TweetRvAdapter(Response.getStatuses(), MainActivity.this);
                            rv_tweets.setAdapter(tweetRvAdapter);
                            dismissProgress();
                        }
                    });
                }
            }
        });
    }
}

