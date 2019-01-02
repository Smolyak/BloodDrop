package com.simpleondrew.blooddrop.app.common

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

/**
 * Created by: Andrey Smolyak
 * email: simpleondrew@ya.ru
 * 25.12.2018 17:16
 **/
abstract class BaseFragment : FragmentAlias(), HasSupportFragmentInjector {

    @Inject
    lateinit var childFragmentInjector: DispatchingAndroidInjector<Fragment>

    abstract val contentLayout: Int

    override fun supportFragmentInjector(): AndroidInjector<Fragment> =
            childFragmentInjector

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        AndroidSupportInjection.inject(this)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(contentLayout, container, false)
}