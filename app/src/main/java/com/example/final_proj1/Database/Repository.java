package com.example.final_proj1.Database;

import android.app.Application;
import com.example.final_proj1.Dao.ConsultionDao;
import com.example.final_proj1.Dao.FoodDao;
import com.example.final_proj1.Dao.ImageSliderDao;
import com.example.final_proj1.Dao.ListTopicDao;
import com.example.final_proj1.Dao.PostDao;
import com.example.final_proj1.Dao.TopicsDao;
import com.example.final_proj1.Dao.UserDao;
import com.example.final_proj1.Entity.Consultion;
import com.example.final_proj1.Entity.Food;
import com.example.final_proj1.Entity.ImageSlider;
import com.example.final_proj1.Entity.ListTopic;
import com.example.final_proj1.Entity.Post;
import com.example.final_proj1.Entity.Topics;
import com.example.final_proj1.Entity.User;

public class Repository {
    UserDao userDao;
    FoodDao foodDao;
    ConsultionDao consultionDao;
    PostDao postDao;
    TopicsDao topicsDao;
    ImageSliderDao imageSliderDao;
    ListTopicDao listTopicDao;

    public Repository(Application application) {
        MyDatabase db = MyDatabase.getDatabase(application);
        userDao = db.userDao();
        foodDao = db.foodDao();
        consultionDao = db.consultionDao();
        postDao = db.postDao();
        topicsDao = db.topicsDao();
        imageSliderDao = db.imageSliderDao();
        listTopicDao = db.listTopicDao();

    }

    // UserDao methods
    public void insertUser(User... users) {
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                userDao.InsertUser(users);
            }
        });
    }


    public void UpdateUser(User... users) {
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                userDao.UpdateUser(users);
            }
        });
    }

    public void DeleteUser(User... users) {
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                userDao.DeleteUser(users);
            }
        });
    }

    public void deleteAllUser() {
        userDao.deleteAllUsers();

    }
    // FoodDao methods
    public void insertFood(Food... foods) {
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                foodDao.InsertFood(foods);
            }
        });
    }

    // TopicsDao methods
    public void insertTopics(Topics... topics) {
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                topicsDao.InsertTopics(topics);
            }
        });
    }

    // ConsultionDao methods
    public void insertConsultion(Consultion... consultions) {
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                consultionDao.InsertConsultion(consultions);
            }
        });
    }

    public void deleteConsultion(Consultion... consultions) {
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                consultionDao.DeleteConsultion(consultions);
            }
        });
    }

    // PostDao methods
    public void insertPost(Post... posts) {
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                postDao.InsertPost(posts);
            }
        });
    }

    // ListTopicDao methods
    public void insertListTopic(ListTopic... listTopics) {
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                listTopicDao.InsertListTopic(listTopics);
            }
        });
    }

    public void deleteListTopic(ListTopic... listTopics) {
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                listTopicDao.DeleteListTopic(listTopics);
            }
        });
    }

    // ImageSliderDao methods
    public void insertImageSlider(ImageSlider... imageSliders) {
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                imageSliderDao.InsertImageSlider(imageSliders);
            }
        });
    }

    public void deleteImageSlider(ImageSlider... imageSliders) {
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                imageSliderDao.DeleteImageSlider(imageSliders);
            }
        });
    }
    public void updateImageSlider(ImageSlider... imageSliders) {
        MyDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                imageSliderDao.UpdateImageSlider(imageSliders);
            }
        });
    }
}