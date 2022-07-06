//package com.example.final_proj1.Dao;
//
//import androidx.lifecycle.LiveData;
//import androidx.room.Dao;
//import androidx.room.Delete;
//import androidx.room.Insert;
//import androidx.room.Query;
//
//import com.example.final_proj1.Entity.ListTopic;
//
//import java.util.List;
//
//@Dao
//public interface ListTopicDao {
//
//    @Insert
//    void InsertListTopic(ListTopic... listTopics);
//
//    @Delete
//    void DeleteListTopic(ListTopic... listTopics);
//
//    @Query("delete from ListTopicTable")
//    void deleteAllListTopic();
//
//    @Query("SELECT * FROM ListTopicTable ")
//    List<ListTopic> getListTopic();
//
//
//    @Query("select * from ListTopicTable ")
//    LiveData<List<ListTopic>> filterListTopic();
//}
