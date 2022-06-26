package com.example.final_proj1.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.final_proj1.Models.Post;
import com.example.final_proj1.Models.Topics;

import java.util.List;

@Dao
public interface PostDao {

    @Insert
    void InsertPost(Post... posts);

    @Query("delete from PostTable")
    void deleteAllPost();

    @Query("SELECT * FROM PostTable ")
    List<Post> getPost();


    @Query("select * from PostTable ")
    LiveData<List<Post>> filterPosts();
}
