package com.example.final_proj1.Entity;


public class Consultion {
    private String id;
    private int comment_post, like_post;
    private String name_user;
    private String  body_post;
    private String  date_publication;
    private String  img_user;
    private String  img_consultion;

    public Consultion() {
    }


    public Consultion(String id, int comment_post, int like_post, String name_user, String body_post, String date_publication, String img_user, String img_consultion) {
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

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
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

    public String getImg_user() {
        return img_user;
    }

    public void setImg_user(String img_user) {
        this.img_user = img_user;
    }

    public String getImg_consultion() {
        return img_consultion;
    }

    public void setImg_consultion(String img_consultion) {
        this.img_consultion = img_consultion;
    }
}
