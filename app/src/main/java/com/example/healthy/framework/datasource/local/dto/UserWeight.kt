package com.example.healthy.framework.datasource.local.dto

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserWeight(
    @PrimaryKey(autoGenerate = true) val changingId: Int,
    val weight: Float
)