//package com.example.final_proj1.Dao;
//
//import androidx.lifecycle.LiveData;
//import androidx.room.Dao;
//import androidx.room.Insert;
//import androidx.room.Query;
//
//import com.example.final_proj1.Entity.Food;
//
//import java.util.List;
//
//@Dao
//public interface FoodDao {
//
//    @Insert
//    void InsertFood(Food... foods);
//
//
//    @Query("delete from FoodTable")
//    void deleteAllFoods();
//
//    @Query("SELECT * FROM FoodTable ")
//    List<Food> getFood();
//
//
//    @Query("select * from FoodTable ")
//    LiveData<List<Food>> filterFood();
//}
