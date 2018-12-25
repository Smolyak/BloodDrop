package com.simpleondrew.blooddrop.app

import android.app.Activity
import android.app.Application
import androidx.fragment.app.Fragment
import com.simpleondrew.blooddrop.app.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

/**
 * Created by: Andrey Smolyak
 * email: simpleondrew@ya.ru
 * 09.12.2018 12:17
 **/
class App : Application(), HasActivityInjector {


    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent
                .builder()
                .app(this)
                .context(this)
                .create(this)
                .inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> =
            activityInjector

}