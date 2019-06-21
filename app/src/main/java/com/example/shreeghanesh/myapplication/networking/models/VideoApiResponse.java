package com.example.shreeghanesh.myapplication.networking.models;

import com.google.gson.annotations.SerializedName;

public class VideoApiResponse {

    @SerializedName("image")
    private String image;
    @SerializedName("description")
    private String description;
    @SerializedName("channel")
    private String channel;
    @SerializedName("uploader")
    private String uploader;
    @SerializedName("views")
    private String views;
    @SerializedName("uploadedTimeline")
    private String uploadedTimeline;
    @SerializedName("channelSubscribers")
    private Integer channelSubscribers;
    @SerializedName("channelOwners")
    private String channelOwner;

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

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getUploadedTimeline() {
        return uploadedTimeline;
    }

    public void setUploadedTimeline(String uploadedTimeline) {
        this.uploadedTimeline = uploadedTimeline;
    }

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
}
