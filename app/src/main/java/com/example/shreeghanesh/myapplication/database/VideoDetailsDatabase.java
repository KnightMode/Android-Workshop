package com.example.shreeghanesh.myapplication.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {UserEntity.class}, version = 1)
public abstract class VideoDetailsDatabase extends RoomDatabase {
    public abstract VideoDetailsDao videoDetailsDao();
}
