package com.example.final_proj1.Models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "TopicsTable")
public class Topics {
    @PrimaryKey(autoGenerate = true)
    private String id;
    @NonNull
    private int img_topics;
    @NonNull
    private String name_topics,numtopics;

    public Topics(String id, int img_topics, @NonNull String name_topics, @NonNull String numtopics) {
        this.id = id;
        this.img_topics = img_topics;
        this.name_topics = name_topics;
        this.numtopics = numtopics;
    }

    public Topics() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getImg_topics() {
        return img_topics;
    }

    public void setImg_topics(int img_topics) {
        this.img_topics = img_topics;
    }

    @NonNull
    public String getName_topics() {
        return name_topics;
    }

    public void setName_topics(@NonNull String name_topics) {
        this.name_topics = name_topics;
    }

    @NonNull
    public String getNumtopics() {
        return numtopics;
    }

    public void setNumtopics(@NonNull String numtopics) {
        this.numtopics = numtopics;
    }
}



