package com.example.shreeghanesh.myapplication.networking.models;

import java.util.List;

public class User {
    private String userName;
    private List<SubscribedChannel> subscribedSubscribedChannels;
    private List<VideoDetail> likedVideoDetails;


    public User(String userName, List<SubscribedChannel> subscribedSubscribedChannels, List<VideoDetail> likedVideoDetails, List<Comment> commentsList) {
        this.userName = userName;
        this.subscribedSubscribedChannels = subscribedSubscribedChannels;
        this.likedVideoDetails = likedVideoDetails;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<SubscribedChannel> getSubscribedSubscribedChannels() {
        return subscribedSubscribedChannels;
    }

    public void setSubscribedSubscribedChannels(List<SubscribedChannel> subscribedSubscribedChannels) {
        this.subscribedSubscribedChannels = subscribedSubscribedChannels;
    }

    public List<VideoDetail> getLikedVideoDetails() {
        return likedVideoDetails;
    }

    public void setLikedVideoDetails(List<VideoDetail> likedVideoDetails) {
        this.likedVideoDetails = likedVideoDetails;
    }
}
