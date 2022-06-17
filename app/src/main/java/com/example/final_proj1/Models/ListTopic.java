package com.example.final_proj1.Models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "ListTopicTable")
public class ListTopic {
    @PrimaryKey(autoGenerate = true)
    private String id;
    @NonNull
    private String imgtopic;
    @NonNull
    private String titel_tobiclist,body_tobiclist;

    public ListTopic() {
    }

    public ListTopic(String id, @NonNull String imgtopic, @NonNull String titel_tobiclist, @NonNull String body_tobiclist) {
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

    @NonNull
    public String getImgtopic() {
        return imgtopic;
    }

    public void setImgtopic(@NonNull String imgtopic) {
        this.imgtopic = imgtopic;
    }

    @NonNull
    public String getTitel_tobiclist() {
        return titel_tobiclist;
    }

    public void setTitel_tobiclist(@NonNull String titel_tobiclist) {
        this.titel_tobiclist = titel_tobiclist;
    }

    @NonNull
    public String getBody_tobiclist() {
        return body_tobiclist;
    }

    public void setBody_tobiclist(@NonNull String body_tobiclist) {
        this.body_tobiclist = body_tobiclist;
    }
}
