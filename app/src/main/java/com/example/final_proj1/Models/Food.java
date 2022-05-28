package com.example.final_proj1.Models;

public class Food {
    private String FoodId;
    private String ImageFood;
    private String numLike;
    private String nameFood,numPerson , namePublisher ,timePrepare ,datePublisher;

    public Food(String foodId, String imageFood, String numLike, String nameFood, String numPerson, String namePublisher, String timePrepare, String datePublisher) {
        FoodId = foodId;
        ImageFood = imageFood;
        this.numLike = numLike;
        this.nameFood = nameFood;
        this.numPerson = numPerson;
        this.namePublisher = namePublisher;
        this.timePrepare = timePrepare;
        this.datePublisher = datePublisher;
    }

    public String getFoodId() {
        return FoodId;
    }

    public void setFoodId(String foodId) {
        FoodId = foodId;
    }

    public String getImageFood() {
        return ImageFood;
    }

    public void setImageFood(String imageFood) {
        ImageFood = imageFood;
    }

    public String getNumLike() {
        return numLike;
    }

    public void setNumLike(String numLike) {
        this.numLike = numLike;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public String getNumPerson() {
        return numPerson;
    }

    public void setNumPerson(String numPerson) {
        this.numPerson = numPerson;
    }

    public String getNamePublisher() {
        return namePublisher;
    }

    public void setNamePublisher(String namePublisher) {
        this.namePublisher = namePublisher;
    }

    public String getTimePrepare() {
        return timePrepare;
    }

    public void setTimePrepare(String timePrepare) {
        this.timePrepare = timePrepare;
    }

    public String getDatePublisher() {
        return datePublisher;
    }

    public void setDatePublisher(String datePublisher) {
        this.datePublisher = datePublisher;
    }
}
