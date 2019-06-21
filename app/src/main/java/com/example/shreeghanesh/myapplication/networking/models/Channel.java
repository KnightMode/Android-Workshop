package com.example.shreeghanesh.myapplication.networking.models;

import com.google.gson.annotations.SerializedName;

public class Channel {

    @SerializedName("channel")
    private String channelName;

    @SerializedName("channelSubscribers")
    private Integer channelSubscribers;

    @SerializedName("channelOwner")
    private String channelOwner;

    public Integer getChannelSubscribers() {
        return channelSubscribers;
    }

    public void setChannelSubscribers(Integer channelSubscribers) {
        this.channelSubscribers = channelSubscribers;
    }

    public String getChannelOwner() {
        return channelOwner;
    }

    public void setChannelOwner(String channelOwner) {
        this.channelOwner = channelOwner;
    }

    public String getChannel() {
        return channelName;
    }

    public void setChannel(String channelName) {
        this.channelName = channelName;
    }
}
