package com.example.final_proj1.Entity;


public class Topics {
    private String id;
    private int img_topics;
    private String name_topics;
    private String numtopics;

    public Topics() {
    }

    public Topics(String id, int img_topics, String name_topics, String numtopics) {
        this.id = id;
        this.img_topics = img_topics;
        this.name_topics = name_topics;
        this.numtopics = numtopics;
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

    public String getName_topics() {
        return name_topics;
    }

    public void setName_topics(String name_topics) {
        this.name_topics = name_topics;
    }

    public String getNumtopics() {
        return numtopics;
    }

    public void setNumtopics(String numtopics) {
        this.numtopics = numtopics;
    }
}



