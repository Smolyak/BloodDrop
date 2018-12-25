package com.simpleondrew.blooddrop.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.simpleondrew.blooddrop.data.model.Record

/**
 * Created by: Andrey Smolyak
 * email: simpleondrew@ya.ru
 * 23.12.2018 13:26
 **/

@Dao
interface RecordDao {

    @Query("SELECT * FROM record")
    fun getAll(): List<Record>

    @Insert
    fun insertAll(vararg recordList: Record)

}