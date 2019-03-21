package com.gvrk.tweetitsweet.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class TweetResponse implements Serializable {


    @SerializedName("statuses")
    @Expose
    private List<Status> statuses = null;
    @SerializedName("search_metadata")
    @Expose
    private SearchMetadata searchMetadata;
    @SerializedName("error")
    @Expose
    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    public SearchMetadata getSearchMetadata() {
        return searchMetadata;
    }

    public void setSearchMetadata(SearchMetadata searchMetadata) {
        this.searchMetadata = searchMetadata;
    }


    public class Description {

        @SerializedName("urls")
        @Expose
        private List<Object> urls = null;

        public List<Object> getUrls() {
            return urls;
        }

        public void setUrls(List<Object> urls) {
            this.urls = urls;
        }

    }

    public class Entities {

        @SerializedName("hashtags")
        @Expose
        private List<Hashtag> hashtags = null;
        @SerializedName("symbols")
        @Expose
        private List<Object> symbols = null;
        @SerializedName("user_mentions")
        @Expose
        private List<Object> userMentions = null;
        @SerializedName("urls")
        @Expose
        private List<Url> urls = null;

        public List<Hashtag> getHashtags() {
            return hashtags;
        }

        public void setHashtags(List<Hashtag> hashtags) {
            this.hashtags = hashtags;
        }

        public List<Object> getSymbols() {
            return symbols;
        }

        public void setSymbols(List<Object> symbols) {
            this.symbols = symbols;
        }

        public List<Object> getUserMentions() {
            return userMentions;
        }

        public void setUserMentions(List<Object> userMentions) {
            this.userMentions = userMentions;
        }

        public List<Url> getUrls() {
            return urls;
        }

        public void setUrls(List<Url> urls) {
            this.urls = urls;
        }

    }

    public class Hashtag {

        @SerializedName("text")
        @Expose
        private String text;
        @SerializedName("indices")
        @Expose
        private List<Long> indices = null;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public List<Long> getIndices() {
            return indices;
        }

        public void setIndices(List<Long> indices) {
            this.indices = indices;
        }

    }

    public class Metadata {

        @SerializedName("result_type")
        @Expose
        private String resultType;
        @SerializedName("iso_language_code")
        @Expose
        private String isoLanguageCode;

        public String getResultType() {
            return resultType;
        }

        public void setResultType(String resultType) {
            this.resultType = resultType;
        }

        public String getIsoLanguageCode() {
            return isoLanguageCode;
        }

        public void setIsoLanguageCode(String isoLanguageCode) {
            this.isoLanguageCode = isoLanguageCode;
        }

    }

    public class SearchMetadata {

        @SerializedName("completed_in")
        @Expose
        private Float completedIn;
        @SerializedName("max_id")
        @Expose
        private Long maxId;
        @SerializedName("max_id_str")
        @Expose
        private String maxIdStr;
        @SerializedName("next_results")
        @Expose
        private String nextResults;
        @SerializedName("query")
        @Expose
        private String query;
        @SerializedName("refresh_url")
        @Expose
        private String refresh_url;
        @SerializedName("count")
        @Expose
        private Long count;
        @SerializedName("since_id")
        @Expose
        private Long sinceId;
        @SerializedName("since_id_str")
        @Expose
        private String sinceIdStr;

        public String getRefresh_url() {
            return refresh_url;
        }

        public void setRefresh_url(String refresh_url) {
            this.refresh_url = refresh_url;
        }

        public Float getCompletedIn() {
            return completedIn;
        }

        public void setCompletedIn(Float completedIn) {
            this.completedIn = completedIn;
        }

        public Long getMaxId() {
            return maxId;
        }

        public void setMaxId(Long maxId) {
            this.maxId = maxId;
        }

        public String getMaxIdStr() {
            return maxIdStr;
        }

        public void setMaxIdStr(String maxIdStr) {
            this.maxIdStr = maxIdStr;
        }

        public String getNextResults() {
            return nextResults;
        }

        public void setNextResults(String nextResults) {
            this.nextResults = nextResults;
        }

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }

        public Long getCount() {
            return count;
        }

        public void setCount(Long count) {
            this.count = count;
        }

        public Long getSinceId() {
            return sinceId;
        }

        public void setSinceId(Long sinceId) {
            this.sinceId = sinceId;
        }

        public String getSinceIdStr() {
            return sinceIdStr;
        }

        public void setSinceIdStr(String sinceIdStr) {
            this.sinceIdStr = sinceIdStr;
        }

    }

    public class Status {

        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("id")
        @Expose
        private Long id;
        @SerializedName("id_str")
        @Expose
        private String idStr;
        @SerializedName("text")
        @Expose
        private String text;
        @SerializedName("truncated")
        @Expose
        private Boolean truncated;
        @SerializedName("entities")
        @Expose
        private Entities entities;
        @SerializedName("metadata")
        @Expose
        private Metadata metadata;
        @SerializedName("source")
        @Expose
        private String source;
        @SerializedName("in_reply_to_status_id")
        @Expose
        private Object inReplyToStatusId;
        @SerializedName("in_reply_to_status_id_str")
        @Expose
        private Object inReplyToStatusIdStr;
        @SerializedName("in_reply_to_user_id")
        @Expose
        private Object inReplyToUserId;
        @SerializedName("in_reply_to_user_id_str")
        @Expose
        private Object inReplyToUserIdStr;
        @SerializedName("in_reply_to_screen_name")
        @Expose
        private Object inReplyToScreenName;
        @SerializedName("user")
        @Expose
        private User user;
        @SerializedName("geo")
        @Expose
        private Object geo;
        @SerializedName("coordinates")
        @Expose
        private Object coordinates;
        @SerializedName("place")
        @Expose
        private Object place;
        @SerializedName("contributors")
        @Expose
        private Object contributors;
        @SerializedName("is_quote_status")
        @Expose
        private Boolean isQuoteStatus;
        @SerializedName("retweet_count")
        @Expose
        private Long retweetCount;
        @SerializedName("favorite_count")
        @Expose
        private Long favoriteCount;
        @SerializedName("favorited")
        @Expose
        private Boolean favorited;
        @SerializedName("retweeted")
        @Expose
        private Boolean retweeted;
        @SerializedName("possibly_sensitive")
        @Expose
        private Boolean possiblySensitive;
        @SerializedName("lang")
        @Expose
        private String lang;

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getIdStr() {
            return idStr;
        }

        public void setIdStr(String idStr) {
            this.idStr = idStr;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public Boolean getTruncated() {
            return truncated;
        }

        public void setTruncated(Boolean truncated) {
            this.truncated = truncated;
        }

        public Entities getEntities() {
            return entities;
        }

        public void setEntities(Entities entities) {
            this.entities = entities;
        }

        public Metadata getMetadata() {
            return metadata;
        }

        public void setMetadata(Metadata metadata) {
            this.metadata = metadata;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public Object getInReplyToStatusId() {
            return inReplyToStatusId;
        }

        public void setInReplyToStatusId(Object inReplyToStatusId) {
            this.inReplyToStatusId = inReplyToStatusId;
        }

        public Object getInReplyToStatusIdStr() {
            return inReplyToStatusIdStr;
        }

        public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
            this.inReplyToStatusIdStr = inReplyToStatusIdStr;
        }

        public Object getInReplyToUserId() {
            return inReplyToUserId;
        }

        public void setInReplyToUserId(Object inReplyToUserId) {
            this.inReplyToUserId = inReplyToUserId;
        }

        public Object getInReplyToUserIdStr() {
            return inReplyToUserIdStr;
        }

        public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
            this.inReplyToUserIdStr = inReplyToUserIdStr;
        }

        public Object getInReplyToScreenName() {
            return inReplyToScreenName;
        }

        public void setInReplyToScreenName(Object inReplyToScreenName) {
            this.inReplyToScreenName = inReplyToScreenName;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public Object getGeo() {
            return geo;
        }

        public void setGeo(Object geo) {
            this.geo = geo;
        }

        public Object getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(Object coordinates) {
            this.coordinates = coordinates;
        }

        public Object getPlace() {
            return place;
        }

        public void setPlace(Object place) {
            this.place = place;
        }

        public Object getContributors() {
            return contributors;
        }

        public void setContributors(Object contributors) {
            this.contributors = contributors;
        }

        public Boolean getIsQuoteStatus() {
            return isQuoteStatus;
        }

        public void setIsQuoteStatus(Boolean isQuoteStatus) {
            this.isQuoteStatus = isQuoteStatus;
        }

        public Long getRetweetCount() {
            return retweetCount;
        }

        public void setRetweetCount(Long retweetCount) {
            this.retweetCount = retweetCount;
        }

        public Long getFavoriteCount() {
            return favoriteCount;
        }

        public void setFavoriteCount(Long favoriteCount) {
            this.favoriteCount = favoriteCount;
        }

        public Boolean getFavorited() {
            return favorited;
        }

        public void setFavorited(Boolean favorited) {
            this.favorited = favorited;
        }

        public Boolean getRetweeted() {
            return retweeted;
        }

        public void setRetweeted(Boolean retweeted) {
            this.retweeted = retweeted;
        }

        public Boolean getPossiblySensitive() {
            return possiblySensitive;
        }

        public void setPossiblySensitive(Boolean possiblySensitive) {
            this.possiblySensitive = possiblySensitive;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }

    }

    public class Url {

        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("expanded_url")
        @Expose
        private String expandedUrl;
        @SerializedName("display_url")
        @Expose
        private String displayUrl;
        @SerializedName("indices")
        @Expose
        private List<Long> indices = null;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getExpandedUrl() {
            return expandedUrl;
        }

        public void setExpandedUrl(String expandedUrl) {
            this.expandedUrl = expandedUrl;
        }

        public String getDisplayUrl() {
            return displayUrl;
        }

        public void setDisplayUrl(String displayUrl) {
            this.displayUrl = displayUrl;
        }

        public List<Long> getIndices() {
            return indices;
        }

        public void setIndices(List<Long> indices) {
            this.indices = indices;
        }

    }

    public class User {

        @SerializedName("id")
        @Expose
        private Long id;
        @SerializedName("id_str")
        @Expose
        private String idStr;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("screen_name")
        @Expose
        private String screenName;
        @SerializedName("location")
        @Expose
        private String location;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("entities")
        @Expose
        private Entities entities;
        @SerializedName("protected")
        @Expose
        private Boolean _protected;
        @SerializedName("followers_count")
        @Expose
        private Long followersCount;
        @SerializedName("friends_count")
        @Expose
        private Long friendsCount;
        @SerializedName("listed_count")
        @Expose
        private Long listedCount;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("favourites_count")
        @Expose
        private Long favouritesCount;
        @SerializedName("utc_offset")
        @Expose
        private Long utcOffset;
        @SerializedName("time_zone")
        @Expose
        private String timeZone;
        @SerializedName("geo_enabled")
        @Expose
        private Boolean geoEnabled;
        @SerializedName("verified")
        @Expose
        private Boolean verified;
        @SerializedName("statuses_count")
        @Expose
        private Long statusesCount;
        @SerializedName("lang")
        @Expose
        private String lang;
        @SerializedName("contributors_enabled")
        @Expose
        private Boolean contributorsEnabled;
        @SerializedName("is_translator")
        @Expose
        private Boolean isTranslator;
        @SerializedName("is_translation_enabled")
        @Expose
        private Boolean isTranslationEnabled;
        @SerializedName("profile_background_color")
        @Expose
        private String profileBackgroundColor;
        @SerializedName("profile_background_image_url")
        @Expose
        private String profileBackgroundImageUrl;
        @SerializedName("profile_background_image_url_https")
        @Expose
        private String profileBackgroundImageUrlHttps;
        @SerializedName("profile_background_tile")
        @Expose
        private Boolean profileBackgroundTile;
        @SerializedName("profile_image_url")
        @Expose
        private String profileImageUrl;
        @SerializedName("profile_image_url_https")
        @Expose
        private String profileImageUrlHttps;
        @SerializedName("profile_banner_url")
        @Expose
        private String profileBannerUrl;
        @SerializedName("profile_link_color")
        @Expose
        private String profileLinkColor;
        @SerializedName("profile_sidebar_border_color")
        @Expose
        private String profileSidebarBorderColor;
        @SerializedName("profile_sidebar_fill_color")
        @Expose
        private String profileSidebarFillColor;
        @SerializedName("profile_text_color")
        @Expose
        private String profileTextColor;
        @SerializedName("profile_use_background_image")
        @Expose
        private Boolean profileUseBackgroundImage;
        @SerializedName("has_extended_profile")
        @Expose
        private Boolean hasExtendedProfile;
        @SerializedName("default_profile")
        @Expose
        private Boolean defaultProfile;
        @SerializedName("default_profile_image")
        @Expose
        private Boolean defaultProfileImage;
        @SerializedName("following")
        @Expose
        private Object following;
        @SerializedName("follow_request_sent")
        @Expose
        private Object followRequestSent;
        @SerializedName("notifications")
        @Expose
        private Object notifications;
        @SerializedName("translator_type")
        @Expose
        private String translatorType;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getIdStr() {
            return idStr;
        }

        public void setIdStr(String idStr) {
            this.idStr = idStr;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getScreenName() {
            return screenName;
        }

        public void setScreenName(String screenName) {
            this.screenName = screenName;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Entities getEntities() {
            return entities;
        }

        public void setEntities(Entities entities) {
            this.entities = entities;
        }

        public Boolean getProtected() {
            return _protected;
        }

        public void setProtected(Boolean _protected) {
            this._protected = _protected;
        }

        public Long getFollowersCount() {
            return followersCount;
        }

        public void setFollowersCount(Long followersCount) {
            this.followersCount = followersCount;
        }

        public Long getFriendsCount() {
            return friendsCount;
        }

        public void setFriendsCount(Long friendsCount) {
            this.friendsCount = friendsCount;
        }

        public Long getListedCount() {
            return listedCount;
        }

        public void setListedCount(Long listedCount) {
            this.listedCount = listedCount;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public Long getFavouritesCount() {
            return favouritesCount;
        }

        public void setFavouritesCount(Long favouritesCount) {
            this.favouritesCount = favouritesCount;
        }

        public Long getUtcOffset() {
            return utcOffset;
        }

        public void setUtcOffset(Long utcOffset) {
            this.utcOffset = utcOffset;
        }

        public String getTimeZone() {
            return timeZone;
        }

        public void setTimeZone(String timeZone) {
            this.timeZone = timeZone;
        }

        public Boolean getGeoEnabled() {
            return geoEnabled;
        }

        public void setGeoEnabled(Boolean geoEnabled) {
            this.geoEnabled = geoEnabled;
        }

        public Boolean getVerified() {
            return verified;
        }

        public void setVerified(Boolean verified) {
            this.verified = verified;
        }

        public Long getStatusesCount() {
            return statusesCount;
        }

        public void setStatusesCount(Long statusesCount) {
            this.statusesCount = statusesCount;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }

        public Boolean getContributorsEnabled() {
            return contributorsEnabled;
        }

        public void setContributorsEnabled(Boolean contributorsEnabled) {
            this.contributorsEnabled = contributorsEnabled;
        }

        public Boolean getIsTranslator() {
            return isTranslator;
        }

        public void setIsTranslator(Boolean isTranslator) {
            this.isTranslator = isTranslator;
        }

        public Boolean getIsTranslationEnabled() {
            return isTranslationEnabled;
        }

        public void setIsTranslationEnabled(Boolean isTranslationEnabled) {
            this.isTranslationEnabled = isTranslationEnabled;
        }

        public String getProfileBackgroundColor() {
            return profileBackgroundColor;
        }

        public void setProfileBackgroundColor(String profileBackgroundColor) {
            this.profileBackgroundColor = profileBackgroundColor;
        }

        public String getProfileBackgroundImageUrl() {
            return profileBackgroundImageUrl;
        }

        public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
            this.profileBackgroundImageUrl = profileBackgroundImageUrl;
        }

        public String getProfileBackgroundImageUrlHttps() {
            return profileBackgroundImageUrlHttps;
        }

        public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
            this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
        }

        public Boolean getProfileBackgroundTile() {
            return profileBackgroundTile;
        }

        public void setProfileBackgroundTile(Boolean profileBackgroundTile) {
            this.profileBackgroundTile = profileBackgroundTile;
        }

        public String getProfileImageUrl() {
            return profileImageUrl;
        }

        public void setProfileImageUrl(String profileImageUrl) {
            this.profileImageUrl = profileImageUrl;
        }

        public String getProfileImageUrlHttps() {
            return profileImageUrlHttps;
        }

        public void setProfileImageUrlHttps(String profileImageUrlHttps) {
            this.profileImageUrlHttps = profileImageUrlHttps;
        }

        public String getProfileBannerUrl() {
            return profileBannerUrl;
        }

        public void setProfileBannerUrl(String profileBannerUrl) {
            this.profileBannerUrl = profileBannerUrl;
        }

        public String getProfileLinkColor() {
            return profileLinkColor;
        }

        public void setProfileLinkColor(String profileLinkColor) {
            this.profileLinkColor = profileLinkColor;
        }

        public String getProfileSidebarBorderColor() {
            return profileSidebarBorderColor;
        }

        public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
            this.profileSidebarBorderColor = profileSidebarBorderColor;
        }

        public String getProfileSidebarFillColor() {
            return profileSidebarFillColor;
        }

        public void setProfileSidebarFillColor(String profileSidebarFillColor) {
            this.profileSidebarFillColor = profileSidebarFillColor;
        }

        public String getProfileTextColor() {
            return profileTextColor;
        }

        public void setProfileTextColor(String profileTextColor) {
            this.profileTextColor = profileTextColor;
        }

        public Boolean getProfileUseBackgroundImage() {
            return profileUseBackgroundImage;
        }

        public void setProfileUseBackgroundImage(Boolean profileUseBackgroundImage) {
            this.profileUseBackgroundImage = profileUseBackgroundImage;
        }

        public Boolean getHasExtendedProfile() {
            return hasExtendedProfile;
        }

        public void setHasExtendedProfile(Boolean hasExtendedProfile) {
            this.hasExtendedProfile = hasExtendedProfile;
        }

        public Boolean getDefaultProfile() {
            return defaultProfile;
        }

        public void setDefaultProfile(Boolean defaultProfile) {
            this.defaultProfile = defaultProfile;
        }

        public Boolean getDefaultProfileImage() {
            return defaultProfileImage;
        }

        public void setDefaultProfileImage(Boolean defaultProfileImage) {
            this.defaultProfileImage = defaultProfileImage;
        }

        public Object getFollowing() {
            return following;
        }

        public void setFollowing(Object following) {
            this.following = following;
        }

        public Object getFollowRequestSent() {
            return followRequestSent;
        }

        public void setFollowRequestSent(Object followRequestSent) {
            this.followRequestSent = followRequestSent;
        }

        public Object getNotifications() {
            return notifications;
        }

        public void setNotifications(Object notifications) {
            this.notifications = notifications;
        }

        public String getTranslatorType() {
            return translatorType;
        }

        public void setTranslatorType(String translatorType) {
            this.translatorType = translatorType;
        }

    }

}