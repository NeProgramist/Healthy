package com.example.healthy.presentation.loading

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.example.core.domain.model.UserInfo

@InjectViewState
class LoadingPresenter(): MvpPresenter<LoadingView>() {
    fun loadUserData() {

    }

    fun loadedUserData(info: UserInfo?) {

    }
}