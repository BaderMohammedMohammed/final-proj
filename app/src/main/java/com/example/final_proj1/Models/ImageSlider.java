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
}
