package com.example.final_proj1.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.final_proj1.Models.Food;
import com.example.final_proj1.Models.Topics;

import java.util.List;

@Dao
public interface FoodDao {

    @Insert
    void InsertFood(Food... foods);


    @Query("delete from FoodTable")
    void deleteAllFoods();

    @Query("SELECT * FROM FoodTable ")
    List<Food> getFood();


    @Query("select * from FoodTable ")
    LiveData<List<Food>> filterFood();
}
