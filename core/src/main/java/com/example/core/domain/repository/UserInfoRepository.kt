package com.example.core.domain.repository

import com.example.core.domain.model.UserInfo
import com.example.core.domain.model.UserWeight

interface UserInfoRepository {
    fun getUserWeight() : List<UserWeight>

    fun getUserInfo() : UserInfo
}