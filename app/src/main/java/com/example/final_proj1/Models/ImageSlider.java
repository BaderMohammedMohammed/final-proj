package com.example.final_proj1.Models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "SliderTable")
public class ImageSlider {
    @PrimaryKey
    private int id;
    @NonNull
    private String imageSlide;


    public ImageSlider(int id, @NonNull String imageSlide) {
        this.id = id;
        this.imageSlide = imageSlide;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getImageSlide() {
        return imageSlide;
    }

    public void setImageSlide(@NonNull String imageSlide) {
        this.imageSlide = imageSlide;
    }
}
