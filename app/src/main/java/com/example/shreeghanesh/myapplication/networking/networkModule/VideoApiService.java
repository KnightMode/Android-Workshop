package com.example.shreeghanesh.myapplication.networking.networkModule;

import com.example.shreeghanesh.myapplication.networking.models.Comment;
import com.example.shreeghanesh.myapplication.networking.models.VideoApiResponse;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface VideoApiService {

    @GET("/api/workshop/video")
    Observable<VideoApiResponse> getAllPhotos();

    @GET("/api/workshop/comments")
    Observable<List<Comment>> getListOfComments();

    @POST("/api/workshop/comment")
    Observable<List<Comment>> postComment();
}
