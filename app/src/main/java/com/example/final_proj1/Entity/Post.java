package com.example.final_proj1.Entity;


public class Post {
    private String id;
    private int comment_post;
    private int  like_post;
    private String name_doctor;
    private String body_post;
    private String date_publication;
    private String img_doctor;
    private String img_content;

    public Post() {
    }

    public Post(String id, int comment_post, int like_post, String name_doctor, String body_post, String date_publication, String img_doctor, String img_content) {
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

    public String getName_doctor() {
        return name_doctor;
    }

    public void setName_doctor(String name_doctor) {
        this.name_doctor = name_doctor;
    }

    public String getBody_post() {
        return body_post;
    }

    public void setBody_post(String body_post) {
        this.body_post = body_post;
    }

    public String getDate_publication() {
        return date_publication;
    }

    public void setDate_publication(String date_publication) {
        this.date_publication = date_publication;
    }

    public String getImg_doctor() {
        return img_doctor;
    }

    public void setImg_doctor(String img_doctor) {
        this.img_doctor = img_doctor;
    }

    public String getImg_content() {
        return img_content;
    }

    public void setImg_content(String img_content) {
        this.img_content = img_content;
    }
}