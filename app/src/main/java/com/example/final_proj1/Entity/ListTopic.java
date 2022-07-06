package com.example.final_proj1.Entity;



public class ListTopic {
    private String id;
    private String imgtopic;
    private String titel_tobiclist;
    private String body_tobiclist;

    public ListTopic() {
    }

    public ListTopic(String id, String imgtopic, String titel_tobiclist, String body_tobiclist) {
        this.id = id;
        this.imgtopic = imgtopic;
        this.titel_tobiclist = titel_tobiclist;
        this.body_tobiclist = body_tobiclist;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImgtopic() {
        return imgtopic;
    }

    public void setImgtopic(String imgtopic) {
        this.imgtopic = imgtopic;
    }

    public String getTitel_tobiclist() {
        return titel_tobiclist;
    }

    public void setTitel_tobiclist(String titel_tobiclist) {
        this.titel_tobiclist = titel_tobiclist;
    }

    public String getBody_tobiclist() {
        return body_tobiclist;
    }

    public void setBody_tobiclist(String body_tobiclist) {
        this.body_tobiclist = body_tobiclist;
    }
}
