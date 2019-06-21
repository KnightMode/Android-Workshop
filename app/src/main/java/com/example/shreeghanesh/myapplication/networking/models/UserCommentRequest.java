package com.example.shreeghanesh.myapplication.networking.models;

public class UserCommentRequest {
    private String user;
    private String comment;

    public UserCommentRequest(String user, String comment) {
        this.user = user;
        this.comment = comment;
    }
}
