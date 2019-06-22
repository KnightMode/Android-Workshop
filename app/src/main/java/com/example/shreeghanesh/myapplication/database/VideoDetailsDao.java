package com.example.shreeghanesh.myapplication.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

import com.example.shreeghanesh.myapplication.networking.models.User;

@Dao
public interface VideoDetailsDao {

    @Insert
    void insertVideoDetails(User user);
}
