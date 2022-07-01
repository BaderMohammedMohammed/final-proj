package com.example.final_proj1.Entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "PostTable")
public class Post {
    @PrimaryKey(autoGenerate = true)
    private String id;
    @NonNull
    private int comment_post, like_post;
    @NonNull
    private String name_doctor, body_post, date_publication;
    @NonNull
    private String img_doctor, img_content;

    public Post() {
    }

    public Post(String id, int comment_post, int like_post, @NonNull String name_doctor, @NonNull String body_post, @NonNull String date_publication, @NonNull String img_doctor, @NonNull String img_content) {
        this.id = id;
        this.comment_post = comment_post;
        this.like_post = like_post;
        this.name_doctor = name_doctor;
        this.body_post = body_post;
        this.date_publication = date_publication;
        this.img_doctor = img_doctor;
        this.img_content = img_content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getComment_post() {
        return comment_post;
    }

    public void setComment_post(int comment_post) {
        this.comment_post = comment_post;
    }

    public int getLike_post() {
        return like_post;
    }

    public void setLike_post(int like_post) {
        this.like_post = like_post;
    }

    @NonNull
    public String getName_doctor() {
        return name_doctor;
    }

    public void setName_doctor(@NonNull String name_doctor) {
        this.name_doctor = name_doctor;
    }

    @NonNull
    public String getBody_post() {
        return body_post;
    }

    public void setBody_post(@NonNull String body_post) {
        this.body_post = body_post;
    }

    @NonNull
    public String getDate_publication() {
        return date_publication;
    }

    public void setDate_publication(@NonNull String date_publication) {
        this.date_publication = date_publication;
    }

    @NonNull
    public String getImg_doctor() {
        return img_doctor;
    }

    public void setImg_doctor(@NonNull String img_doctor) {
        this.img_doctor = img_doctor;
    }

    @NonNull
    public String getImg_content() {
        return img_content;
    }

    public void setImg_content(@NonNull String img_content) {
        this.img_content = img_content;
    }
}