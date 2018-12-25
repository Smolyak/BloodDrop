package com.simpleondrew.blooddrop.data.model

import androidx.room.Entity

/**
 * Created by: Andrey Smolyak
 * email: simpleondrew@ya.ru
 * 23.12.2018 13:25
 **/
@Entity
data class Injection(val insulinType: String,
                     val dose: String)