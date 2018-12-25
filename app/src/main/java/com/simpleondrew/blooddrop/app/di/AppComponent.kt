package com.simpleondrew.blooddrop.app.di

import android.app.Application
import android.content.Context
import com.simpleondrew.blooddrop.app.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector

/**
 * Created by: Andrey Smolyak
 * email: simpleondrew@ya.ru
 * 23.12.2018 13:42
 **/

@Component(modules = [DataModule::class, AppModule::class])
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>() {

        @BindsInstance
        abstract fun app(app: Application): Builder

        @BindsInstance
        abstract fun context(context: Context): Builder
    }
}