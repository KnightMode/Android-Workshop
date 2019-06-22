package com.example.shreeghanesh.myapplication.networking.models;

import java.util.List;

class VideoDetail {
    private String image;
    private String description;
    private Integer views;
    private List<Comment> commentsList;

    public VideoDetail(String image, String description, Integer views, List<Comment> commentsList) {
        this.image = image;
        this.description = description;
        this.views = views;
        this.commentsList = commentsList;
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

    public List<Comment> getCommentsList() {
        return commentsList;
    }

    public void setCommentsList(List<Comment> commentsList) {
        this.commentsList = commentsList;
    }
}
