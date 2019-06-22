package com.example.shreeghanesh.myapplication.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.example.shreeghanesh.myapplication.networking.models.SubscribedChannel;

import java.util.List;

@Entity(tableName = "user")
public class UserEntity {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "user_name")
    public String userName;

    @ColumnInfo(name = "channel_name")
    public List<SubscribedChannel> subscribedChannelName;
}
