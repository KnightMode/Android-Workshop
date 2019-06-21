package com.example.shreeghanesh.myapplication.networking.models;

import java.util.List;

public class User {
    private String userName;
    private List<Channel> subscribedChannels;
    private List<LikedVideo> likedVideoList;

    public User(String userId, String userName, List<Comment> comments, List<Channel> subscribedChannels) {
        this.userName = userName;
        this.subscribedChannels = subscribedChannels;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Channel> getChannels() {
        return subscribedChannels;
    }

    public void setChannels(List<Channel> subscribedChannels) {
        this.subscribedChannels = subscribedChannels;
    }
}
