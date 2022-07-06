package com.example.final_proj1.Entity;


public class ImageSlider {
    private String id;
    private String imageSlide;


    public ImageSlider() {
    }

    public ImageSlider(String id, String imageSlide) {
        this.id = id;
        this.imageSlide = imageSlide;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageSlide() {
        return imageSlide;
    }

    public void setImageSlide(String imageSlide) {
        this.imageSlide = imageSlide;
    }
}
