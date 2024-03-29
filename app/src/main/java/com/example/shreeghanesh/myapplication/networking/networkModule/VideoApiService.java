package com.example.shreeghanesh.myapplication.networking.networkModule;

import com.example.shreeghanesh.myapplication.networking.models.Comment;
import com.example.shreeghanesh.myapplication.networking.models.UserCommentRequest;
import com.example.shreeghanesh.myapplication.networking.models.VideoApiResponse;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface VideoApiService {

    @GET("/api/workshop/video")
    Observable<VideoApiResponse> getAllVideoDetails();

    @GET("/api/workshop/comments")
    Observable<List<Comment>> getListOfComments();

    @POST("/api/workshop/comment")
    @Headers("Content-Type: application/json")
    Observable<List<Comment>> postComment(@Body UserCommentRequest userCommentRequest);
}
