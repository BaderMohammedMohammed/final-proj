package com.example.final_proj1.Database;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;


import com.example.final_proj1.Entity.Consultion;
import com.example.final_proj1.Entity.Food;
import com.example.final_proj1.Entity.ImageSlider;
import com.example.final_proj1.Entity.ListTopic;
import com.example.final_proj1.Entity.Post;
import com.example.final_proj1.Entity.Topics;
import com.example.final_proj1.Entity.User;

public class MyViewModel extends AndroidViewModel {
    Repository repository;
    public MyViewModel(@NonNull Application application) {
        super(application);
        repository = new Repository(application);
    }

    // UserDao methods
    public void insertUser(User... users) {
        repository.insertUser(users);
    }


    public void UpdateUser(User... users) {
        repository.UpdateUser(users);
    }

    public void DeleteUser(User... users) {
        repository.DeleteUser(users);
    }

    public void deleteAllUser() {
        repository.deleteAllUser();
    }

    // FoodDao methods
    public void insertFood(Food... foods) {
        repository.insertFood(foods);

    }
        // TopicsDao methods
        public void insertTopics(Topics...topics) {
            repository.insertTopics(topics);
    }

    // ConsultionDao methods
    public void insertConsultion(Consultion...consultions) {
        repository.insertConsultion(consultions);
    }

    public void DeleteConsultion(Consultion...consultions) {
        repository.deleteConsultion(consultions);
    }
    // PostDao methods
    public void insertPost(Post...posts) {
        repository.insertPost(posts);
    }

    // ListTopicsDao methods
    public void insertListTopics(ListTopic...listTopics) {
        repository.insertListTopic(listTopics);
    }

    public void deleteListTopics(ListTopic...listTopics) {
        repository.deleteListTopic(listTopics);
    }

    // ListTopicsDao methods
    public void insertImageSlider(ImageSlider...imageSliders) {
        repository.insertImageSlider(imageSliders);
    }
        public void updateImageSlider(ImageSlider...imageSliders) {
            repository.updateImageSlider(imageSliders);
        }
            public void deleteImageSlider(ImageSlider...imageSliders) {
                repository.updateImageSlider(imageSliders);
    }

}