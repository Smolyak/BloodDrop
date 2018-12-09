package com.simpleondrew.blooddrop.app.ui
import android.os.Bundle
import com.simpleondrew.blooddrop.R
import com.simpleondrew.blooddrop.app.common.ActivityAlias

/**
 * Created by: Andrey Smolyak
 * email: simpleondrew@ya.ru
 * 02.12.2018 17:15
 **/

class LaunchActivity : ActivityAlias() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
    }
}
