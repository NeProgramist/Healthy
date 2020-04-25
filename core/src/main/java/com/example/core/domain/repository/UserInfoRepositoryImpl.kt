package com.example.core.domain.repository

import com.example.core.domain.model.UserInfo
import com.example.core.domain.model.UserWeight

class UserInfoRepositoryImpl(val dataSource: UserInfoDataSource): UserInfoRepository {
    override fun getUserWeight(): List<UserWeight> {

    }

    override fun getUserInfo(): UserInfo {

    }

}