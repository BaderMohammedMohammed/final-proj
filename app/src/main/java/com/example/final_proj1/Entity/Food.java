package com.example.final_proj1.Entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "FoodTable")
public class Food {
    @PrimaryKey(autoGenerate = true)
    private int FoodId;
    @NonNull
    private String ImageFood;
    @NonNull
    private String numLike;
    @NonNull
    private String nameFood;
    @NonNull
    private String numPerson;
    @NonNull
    private String namePublisher;
    @NonNull
    private String timePrepare;
    @NonNull
    private String componentsAddfood;
    @NonNull
    private String prepareFood;
    @NonNull
    private String datePublisher;


    public Food() {
    }

    public Food(int foodId, @NonNull String imageFood, @NonNull String numLike, @NonNull String nameFood, @NonNull String numPerson, @NonNull String namePublisher, @NonNull String timePrepare, @NonNull String componentsAddfood, @NonNull String prepareFood, @NonNull String datePublisher) {
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

    @NonNull
    public String getComponentsAddfood() {
        return componentsAddfood;
    }

    public void setComponentsAddfood(@NonNull String componentsAddfood) {
        this.componentsAddfood = componentsAddfood;
    }

    @NonNull
    public String getPrepareFood() {
        return prepareFood;
    }

    public void setPrepareFood(@NonNull String prepareFood) {
        this.prepareFood = prepareFood;
    }

    public int getFoodId() {
        return FoodId;
    }

    public void setFoodId(int foodId) {
        FoodId = foodId;
    }

    @NonNull
    public String getImageFood() {
        return ImageFood;
    }

    public void setImageFood(@NonNull String imageFood) {
        ImageFood = imageFood;
    }

    @NonNull
    public String getNumLike() {
        return numLike;
    }

    public void setNumLike(@NonNull String numLike) {
        this.numLike = numLike;
    }

    @NonNull
    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(@NonNull String nameFood) {
        this.nameFood = nameFood;
    }

    @NonNull
    public String getNumPerson() {
        return numPerson;
    }

    public void setNumPerson(@NonNull String numPerson) {
        this.numPerson = numPerson;
    }

    @NonNull
    public String getNamePublisher() {
        return namePublisher;
    }

    public void setNamePublisher(@NonNull String namePublisher) {
        this.namePublisher = namePublisher;
    }

    @NonNull
    public String getTimePrepare() {
        return timePrepare;
    }

    public void setTimePrepare(@NonNull String timePrepare) {
        this.timePrepare = timePrepare;
    }

    @NonNull
    public String getDatePublisher() {
        return datePublisher;
    }

    public void setDatePublisher(@NonNull String datePublisher) {
        this.datePublisher = datePublisher;
    }
}
