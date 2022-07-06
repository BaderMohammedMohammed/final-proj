package com.example.final_proj1.Entity;


public class Food {
    private String FoodId;
    private String ImageFood;
    private String numLike;
    private String nameFood;
    private String numPerson;
    private String namePublisher;
    private String timePrepare;
    private String componentsAddfood;
    private String prepareFood;
    private String datePublisher;


    public Food() {
    }

    public Food(String foodId, String imageFood, String numLike, String nameFood, String numPerson, String namePublisher, String timePrepare, String componentsAddfood, String prepareFood, String datePublisher) {
        FoodId = foodId;
        ImageFood = imageFood;
        this.numLike = numLike;
        this.nameFood = nameFood;
        this.numPerson = numPerson;
        this.namePublisher = namePublisher;
        this.timePrepare = timePrepare;
        this.componentsAddfood = componentsAddfood;
        this.prepareFood = prepareFood;
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

    public String getComponentsAddfood() {
        return componentsAddfood;
    }

    public void setComponentsAddfood(String componentsAddfood) {
        this.componentsAddfood = componentsAddfood;
    }

    public String getPrepareFood() {
        return prepareFood;
    }

    public void setPrepareFood(String prepareFood) {
        this.prepareFood = prepareFood;
    }

    public String getDatePublisher() {
        return datePublisher;
    }

    public void setDatePublisher(String datePublisher) {
        this.datePublisher = datePublisher;
    }
}
