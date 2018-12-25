package com.simpleondrew.blooddrop.data.di

import android.content.Context
import androidx.room.Room
import com.simpleondrew.blooddrop.data.database.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by: Andrey Smolyak
 * email: simpleondrew@ya.ru
 * 23.12.2018 13:35
 **/
@Module
class RoomModule {

    @Provides
    @Singleton
    fun provideAppDb(context: Context): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, "records_db").build()
}