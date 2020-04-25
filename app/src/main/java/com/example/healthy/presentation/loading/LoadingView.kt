package com.example.healthy.presentation.loading

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType

@StateStrategyType(value = AddToEndSingleStrategy::class)
interface LoadingView: MvpView {
    fun startLoading()
    fun endLoading(userData: Boolean)
}