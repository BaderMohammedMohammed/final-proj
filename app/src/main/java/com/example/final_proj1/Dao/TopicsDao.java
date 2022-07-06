//package com.example.final_proj1.Dao;
//
//import androidx.lifecycle.LiveData;
//import androidx.room.Dao;
//import androidx.room.Insert;
//import androidx.room.Query;
//
//import com.example.final_proj1.Entity.Topics;
//
//import java.util.List;
//
//@Dao
//public interface TopicsDao {
//    @Insert
//    void InsertTopics(Topics... topics);
//
//
//    @Query("delete from TopicsTable")
//    void deleteAllTopics();
//
//    @Query("SELECT * FROM TopicsTable ")
//    List<Topics> getTopics();
//
//
//    @Query("select * from TopicsTable ")
//    LiveData<List<Topics>> filterTopics();
//
//}
