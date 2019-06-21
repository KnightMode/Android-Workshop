package com.example.shreeghanesh.myapplication.channel;

import com.example.shreeghanesh.myapplication.basecomponents.UseCase;

public class ChannelDetailsUseCase implements UseCase {
    private String channelName;
    private boolean isSubscribed;

    public ChannelDetailsUseCase(String channelName, boolean isSubscribed) {
        this.channelName = channelName;
        this.isSubscribed = isSubscribed;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }

    public void setSubscribed(boolean subscribed) {
        isSubscribed = subscribed;
    }
}
