package com.example.shreeghanesh.myapplication.networking.models;

class VideoDetail {
    private String image;
    private String description;
    private SubscribedChannel subscribedChannel;
    private Integer views;

    public VideoDetail(String image, String description, SubscribedChannel subscribedChannel, Integer views) {
        this.image = image;
        this.description = description;
        this.subscribedChannel = subscribedChannel;
        this.views = views;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SubscribedChannel getSubscribedChannel() {
        return subscribedChannel;
    }

    public void setSubscribedChannel(SubscribedChannel subscribedChannel) {
        this.subscribedChannel = subscribedChannel;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }
}
