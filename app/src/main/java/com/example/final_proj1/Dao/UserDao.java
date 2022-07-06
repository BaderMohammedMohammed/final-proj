//package com.example.final_proj1.Dao;
//
//import androidx.lifecycle.LiveData;
//import androidx.room.Dao;
//import androidx.room.Delete;
//import androidx.room.Insert;
//import androidx.room.Query;
//import androidx.room.Update;
//
//import com.example.final_proj1.Entity.User;
//
//import java.util.List;
//
//@Dao
//public interface UserDao {
//
//    @Insert
//    void InsertUser(User... users);
//
//    @Update
//    void UpdateUser(User... users);
//
//    @Delete
//    void DeleteUser(User... users);
//
//    @Query("delete from UserTable")
//    void deleteAllUsers();
//
//    @Query("SELECT * FROM UserTable ")
//    List<User> getUsers();
//
//
//    @Query("select * from UserTable ")
//    LiveData<List<User>> filterUsers();
//
//}
