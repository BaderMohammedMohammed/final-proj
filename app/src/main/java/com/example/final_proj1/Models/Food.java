package com.example.final_proj1.Models;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "FoodTable")
public class Food {
    @PrimaryKey(autoGenerate = true)
    private String FoodId;
    @NonNull
    private String ImageFood;
    @NonNull
    private String numLike;
    @NonNull
    private String nameFood,numPerson , namePublisher ,timePrepare ,datePublisher;

    public Food() {
    }

    public Food(String foodId, @NonNull String imageFood, @NonNull String numLike, @NonNull String nameFood, @NonNull String numPerson, @NonNull String namePublisher, @NonNull String timePrepare, @NonNull String datePublisher) {
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
