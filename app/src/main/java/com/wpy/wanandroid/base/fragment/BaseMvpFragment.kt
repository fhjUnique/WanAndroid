package com.wpy.wanandroid.base.fragment

import android.os.Bundle
import com.wpy.wanandroid.base.BasePresenter

abstract class BaseMvpFragment<P : BasePresenter<*>> : BaseFragment(){

    lateinit var presenter: P

    abstract fun initPresenter():P

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        presenter = initPresenter()
        super.onActivityCreated(savedInstanceState)
    }

    override fun onDestroy() {
        presenter.detach()
        super.onDestroy()
    }
}