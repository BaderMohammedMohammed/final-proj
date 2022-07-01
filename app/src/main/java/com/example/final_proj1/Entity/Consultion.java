package com.example.final_proj1.Entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "ConsultionTable")
public class Consultion {
    @PrimaryKey
    private String id;
    @NonNull
private int comment_post,like_post;
    @NonNull
private String name_user,body_post,date_publication,img_user,img_consultion;

    public Consultion() {
    }

    public Consultion(String id, int comment_post, int like_post, @NonNull String name_user, @NonNull String body_post, @NonNull String date_publication, @NonNull String img_user, @NonNull String img_consultion) {
        this.id = id;
        this.comment_post = comment_post;
        this.like_post = like_post;
        this.name_user = name_user;
        this.body_post = body_post;
        this.date_publication = date_publication;
        this.img_user = img_user;
        this.img_consultion = img_consultion;
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
    public String getName_user() {
        return name_user;
    }

    public void setName_user(@NonNull String name_user) {
        this.name_user = name_user;
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
    public String getImg_user() {
        return img_user;
    }

    public void setImg_user(@NonNull String img_user) {
        this.img_user = img_user;
    }

    @NonNull
    public String getImg_consultion() {
        return img_consultion;
    }

    public void setImg_consultion(@NonNull String img_consultion) {
        this.img_consultion = img_consultion;
    }
}
