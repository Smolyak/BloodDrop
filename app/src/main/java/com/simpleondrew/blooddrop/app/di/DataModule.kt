package com.simpleondrew.blooddrop.app.di

import com.simpleondrew.blooddrop.data.di.RoomModule
import dagger.Module

/**
 * Created by: Andrey Smolyak
 * email: simpleondrew@ya.ru
 * 25.12.2018 17:08
 **/
@Module(includes = [RoomModule::class])
interface DataModule