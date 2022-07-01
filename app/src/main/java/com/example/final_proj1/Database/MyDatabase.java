package com.example.final_proj1.Database;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;


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


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {User.class, Food.class, Consultion.class, ImageSlider.class, Post.class, Topics.class, ListTopic.class}, version = 1, exportSchema = false)
public abstract class MyDatabase extends RoomDatabase {

    public abstract UserDao userDao();
    public abstract FoodDao foodDao();
    public abstract ConsultionDao consultionDao();
    public abstract PostDao postDao();
    public abstract TopicsDao topicsDao();
    public abstract ImageSliderDao imageSliderDao();
    public abstract ListTopicDao listTopicDao();


    private static volatile MyDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public static MyDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (MyDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            MyDatabase.class, "my_database")
                            .addCallback(sRoomDatabaseCallback)
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    private static Callback sRoomDatabaseCallback = new Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

            databaseWriteExecutor.execute(() -> {
//                String[] types = {"Gaza","DierAlBalah","Jablya"};
//                TypeDao dao = INSTANCE.typeDao();
//                for (int i=1;i<types.length;i++){
//                    dao.insertType(new Type(types[i]));
//                StudentsDao dao = INSTANCE.studentsDao();
//                dao.deleteAllStudents();


//                }
            });
        }
    };

}