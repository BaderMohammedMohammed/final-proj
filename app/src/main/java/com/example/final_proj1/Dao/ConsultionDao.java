//package com.example.final_proj1.Dao;
//
//import androidx.lifecycle.LiveData;
//import androidx.room.Dao;
//import androidx.room.Delete;
//import androidx.room.Insert;
//import androidx.room.Query;
//
//import com.example.final_proj1.Entity.Consultion;
//
//import java.util.List;
//
//@Dao
//public interface ConsultionDao {
//
//    @Insert
//    void InsertConsultion(Consultion... consultions);
//
//    @Delete
//    void DeleteConsultion(Consultion... consultions);
//
//    @Query("delete from ConsultionTable")
//    void deleteAllConsultion();
//
//    @Query("SELECT * FROM ConsultionTable ")
//    List<Consultion> getConsultion();
//
//
//    @Query("select * from FoodTable ")
//    LiveData<List<Consultion>> filterConsultion();
//}
