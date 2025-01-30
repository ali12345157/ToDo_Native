package com.example.todo_native

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import java.util.Date

interface TaskDao {
    @Insert
    fun insert(task: Task)
    @Update
    fun update(task: Task)
    @Delete
    fun delete(task: Task)
    @Query("SELECT * FROM tasks")
    fun getAllTask():List<Task>
    @Query("SELECT * FROM tasks WHERE date=:date")
    fun getTaskByDate(date: Date):List<Task>
}