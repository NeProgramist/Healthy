package com.example.core.domain.interactor

import com.example.core.domain.repository.UserInfoRepository

class LoadUserInfoUseCase(private val repository: UserInfoRepository) {
    suspend operator fun invoke() = repository
}