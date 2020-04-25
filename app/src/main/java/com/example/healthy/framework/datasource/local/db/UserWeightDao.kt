package com.example.healthy.framework.datasource.local.db

import androidx.room.*
import com.example.healthy.framework.datasource.local.dto.UserWeight

@Dao
interface UserWeightDao {
    @Query("SELECT * FROM UserWeight")
    fun getAll(): List<UserWeight>

    @Query("SELECT weight FROM UserWeight ORDER BY changingId LIMIT 1")
    fun getLast(): Float

    @Insert
    fun insert(weight: UserWeight)

    @Update
    fun update(weight: UserWeight)

    @Delete
    fun delete(weight: UserWeight)
}