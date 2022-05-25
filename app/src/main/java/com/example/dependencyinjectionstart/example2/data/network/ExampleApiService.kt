package com.example.dependencyinjectionstart.example2.data.network

import android.content.Context
import android.util.Log
import com.example.dependencyinjectionstart.R
import com.example.dependencyinjectionstart.example2.di.ApplicationScope
import com.example.dependencyinjectionstart.example2.di.CurrentTime
import javax.inject.Inject
import javax.inject.Singleton

class ExampleApiService @Inject constructor(
    val context: Context,
    private val currenttime: CurrentTime
){

    fun method() {
        //Log.d(LOG_TAG, "ExampleApiService ${context.getString((R.string.app_name))} time:${currenttime.currentTime} $this")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
