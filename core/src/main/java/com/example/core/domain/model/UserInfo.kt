package com.example.core.domain.model

data class UserInfo(
    val nickname: String,
    val sex: Boolean,
    val age: Int,
    val height: Int,
    val weight: Float,
    val goal: Int,
    val goal_weight: Float
)