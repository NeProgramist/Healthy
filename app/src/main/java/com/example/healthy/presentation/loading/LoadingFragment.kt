package com.example.healthy.presentation.loading

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.arellomobile.mvp.MvpAppCompatFragment
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.healthy.R

/**
 * A simple [Fragment] subclass.
 */
class LoadingFragment : MvpAppCompatFragment(), LoadingView {

    @InjectPresenter
    lateinit var loadingPresenter: LoadingPresenter
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        loadingPresenter.loadUserData()
        return inflater.inflate(R.layout.fragment_loading, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
    }

    override fun startLoading() {

    }

    override fun endLoading(userData: Boolean) {
        when(userData) {
            true -> navController.navigate(R.id.action_loadingFragment_to_mainFragment)
            false -> navController.navigate(R.id.action_loadingFragment_to_signUpFragmentFirst)

        }
    }


}
