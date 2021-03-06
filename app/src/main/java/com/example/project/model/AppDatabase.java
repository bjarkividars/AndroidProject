package com.example.project.model;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Course.class, User.class}, version = 8, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase singletonInstance;

    public static AppDatabase singleton(Context context){
        if (singletonInstance == null) {
            singletonInstance = Room.databaseBuilder(context, AppDatabase.class, "myDb")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }

        return singletonInstance;
    }

    public static void setSingletonInstance(AppDatabase singletonInstance) {
        AppDatabase.singletonInstance = singletonInstance;
    }

    public static AppDatabase getSingletonInstance() {
        return singletonInstance;
    }


    public abstract CoursesDao coursesDao();

    public abstract UsersDao usersDao();
}
