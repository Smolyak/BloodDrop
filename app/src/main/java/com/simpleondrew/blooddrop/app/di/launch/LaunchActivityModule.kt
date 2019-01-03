package com.simpleondrew.blooddrop.app.di.launch

import com.simpleondrew.blooddrop.app.ui.newrecord.NewRecordFragment
import com.simpleondrew.blooddrop.app.ui.timeline.TimelineFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by: Andrey Smolyak
 * email: simpleondrew@ya.ru
 * 25.12.2018 18:13
 **/
@Module
interface LaunchActivityModule {

    @ContributesAndroidInjector
    fun provideNewRecordFragment(): NewRecordFragment

    @ContributesAndroidInjector
    fun provideTimelineFragment(): TimelineFragment
}