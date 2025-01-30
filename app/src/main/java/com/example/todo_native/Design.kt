package com.example.todo_native

import androidx.room.RoomDatabase


//singleton
object AppCon{



}
class Database private constructor()
{

    companion object{
        private var instance:Database?=null
        fun getInstance(): Database? {
if (instance==null)
    instance=Database()
            return  instance


        }
    }
}