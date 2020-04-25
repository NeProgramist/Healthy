package com.example.healthy.framework.datasource.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.healthy.framework.datasource.local.dto.UserWeight

@Database(entities = [UserWeight::class], version = 1, exportSchema = false)
abstract class UserWeightDatabase: RoomDatabase() {
    abstract fun userWeightDao() : UserWeightDao
}