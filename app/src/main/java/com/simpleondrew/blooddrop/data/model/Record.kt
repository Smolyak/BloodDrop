package com.simpleondrew.blooddrop.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by: Andrey Smolyak
 * email: simpleondrew@ya.ru
 * 23.12.2018 13:20
 **/
@Entity
data class Record(@PrimaryKey val uid: Long,
                  val date: Long,
                  val glucoseLevel: Double)