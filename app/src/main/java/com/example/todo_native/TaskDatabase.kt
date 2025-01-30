package com.example.todo_native

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = arrayOf(Task::class), version = 1)
abstract class TaskDatabase: RoomDatabase() {
    abstract fun getTaskDio():TaskDao
    companion object{
private var instance :TaskDatabase?=null
        fun init(context: Context)
        { if (instance==null) {
            instance = Room.databaseBuilder(context, TaskDatabase::class.java, "Tasks Database ")
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()
        }}
fun getInstance():TaskDatabase {

    return instance as TaskDatabase
}

    }

}