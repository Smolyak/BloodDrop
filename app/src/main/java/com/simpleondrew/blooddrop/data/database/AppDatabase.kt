package com.simpleondrew.blooddrop.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.simpleondrew.blooddrop.data.dao.RecordDao
import com.simpleondrew.blooddrop.data.model.Record

/**
 * Created by: Andrey Smolyak
 * email: simpleondrew@ya.ru
 * 23.12.2018 13:30
 **/
@Database(entities = [Record::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): RecordDao
}