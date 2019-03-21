package com.gvrk.tweetitsweet.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gvrk.tweetitsweet.Models.TweetResponse;
import com.gvrk.tweetitsweet.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class TweetRvAdapter extends RecyclerView.Adapter<TweetRvAdapter.ViewHolder> {

    private List<TweetResponse.Status> statusList;
    private Context mContext;

    public TweetRvAdapter(List<TweetResponse.Status> statusList, Context mContext) {
        this.statusList = statusList;
        this.mContext = mContext;
    }

    public void updateUIwithKey(String searchKey) {
        //if changes in the list happens
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.tweet_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Picasso.get().load(statusList.get(position).getUser().getProfileImageUrl()).into(holder.iv_user);
        if (statusList.get(position).getEntities().getUrls().size() > 0)
            Picasso.get().load(statusList.get(position).getEntities().getUrls().get(0).getExpandedUrl()).into(holder.iv_image);
        holder.tv_user_name.setText(statusList.get(position).getUser().getName());
        holder.tv_user_name_tag.setText(statusList.get(position).getUser().getScreenName());
        holder.tv_tweet.setText(statusList.get(position).getText());
        holder.tv_retweet.setText("" + statusList.get(position).getRetweetCount());
        holder.tv_likes.setText("" + statusList.get(position).getUser().getFavouritesCount());
    }

    @Override
    public int getItemCount() {
        return statusList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_user;
        TextView tv_user_name;
        TextView tv_user_name_tag;
        TextView tv_time_ago;
        TextView tv_tweet;
        ImageView iv_image;
        TextView tv_message;
        TextView tv_retweet;
        TextView tv_likes;
        TextView tv_share;

        ViewHolder(View itemView) {
            super(itemView);
            iv_user = itemView.findViewById(R.id.iv_user);
            tv_user_name = itemView.findViewById(R.id.tv_user_name);
            tv_user_name_tag = itemView.findViewById(R.id.tv_user_name_tag);
            tv_time_ago = itemView.findViewById(R.id.tv_time_ago);
            tv_tweet = itemView.findViewById(R.id.tv_tweet);
            iv_image = itemView.findViewById(R.id.iv_image);
            tv_message = itemView.findViewById(R.id.tv_message);
            tv_retweet = itemView.findViewById(R.id.tv_retweet);
            tv_likes = itemView.findViewById(R.id.tv_likes);
            tv_share = itemView.findViewById(R.id.tv_share);
            iv_user = itemView.findViewById(R.id.iv_user);
        }
    }
}
