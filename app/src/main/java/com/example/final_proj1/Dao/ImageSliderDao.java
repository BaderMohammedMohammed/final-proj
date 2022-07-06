//package com.example.final_proj1.Dao;
//
//import androidx.lifecycle.LiveData;
//import androidx.room.Dao;
//import androidx.room.Delete;
//import androidx.room.Insert;
//import androidx.room.Query;
//import androidx.room.Update;
//
//import com.example.final_proj1.Entity.ImageSlider;
//
//import java.util.List;
//
//@Dao
//public interface ImageSliderDao {
//
//    @Insert
//    void InsertImageSlider(ImageSlider... imageSliders);
//
//    @Update
//    void UpdateImageSlider(ImageSlider... imageSliders);
//
//    @Delete
//    void DeleteImageSlider(ImageSlider... imageSliders);
//
//    @Query("delete from SliderTable")
//    void deleteAllImageSlider();
//
//    @Query("SELECT * FROM SliderTable ")
//    List<ImageSlider> getImageSlider();
//
//
//    @Query("select * from SliderTable ")
//    LiveData<List<ImageSlider>> filterImageSlider();
//}
