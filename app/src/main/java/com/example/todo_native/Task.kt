package com.example.todo_native

import androidx.room.Entity
import androidx.room.Ignore
import java.util.Date
import androidx.room.PrimaryKey
@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate=true)
    val taskId:Int?,
    val title:String?=null,

    val date:Date?=null,
    val isDone:Boolean?=false
) {
    @Ignore
    val description: String? = null
}