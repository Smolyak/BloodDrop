package com.simpleondrew.blooddrop.app.di

import com.simpleondrew.blooddrop.app.di.launch.LaunchActivityModule
import dagger.Module
import com.simpleondrew.blooddrop.app.ui.LaunchActivity
import dagger.android.ContributesAndroidInjector


/**
 * Created by: Andrey Smolyak
 * email: simpleondrew@ya.ru
 * 23.12.2018 13:47
 **/
@Module
interface AppModule {

    @ContributesAndroidInjector(modules = [LaunchActivityModule::class])
    fun provideLaunchActivity(): LaunchActivity
}