package com.example.shreeghanesh.myapplication.database;

import android.arch.persistence.room.Room;
import android.content.Context;

import com.example.shreeghanesh.myapplication.networking.models.SubscribedChannel;
import com.example.shreeghanesh.myapplication.networking.models.VideoApiResponse;

public class VideoDetailsRepository {

    public VideoDetailsRepository() {
    }

    public void cacheDetails(VideoApiResponse videoApiResponse, Context context) {
        createDbInstance(context);
        cacheVideoDetails(videoApiResponse);
    }

    private void cacheVideoDetails(VideoApiResponse videoApiResponse) {

    }

    private void createDbInstance(Context context) {
        VideoDetailsDatabase videoDetailsDatabase = Room.databaseBuilder(context,
                VideoDetailsDatabase.class, "video-details-database").build();
//        videoDetailsDatabase.videoDetailsDao().insertVideoDetails();
    }

}
