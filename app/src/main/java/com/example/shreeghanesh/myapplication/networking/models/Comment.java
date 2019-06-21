package com.example.shreeghanesh.myapplication.networking.models;

import com.google.gson.annotations.SerializedName;

public class Comment {
    @SerializedName("id")
    private String id;
    @SerializedName("comment")
    private String comment;
    @SerializedName("user")
    private String userName;
    @SerializedName("timestamp")
    private long timeStamp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
