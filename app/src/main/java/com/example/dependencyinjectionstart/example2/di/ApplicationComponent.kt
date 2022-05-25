package com.example.dependencyinjectionstart.example2.di

import android.content.Context
import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import com.example.dependencyinjectionstart.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import javax.inject.Scope
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class, ViewModelModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(mainActivity: MainActivity2)

    @Component.Factory
    interface ApplicationComponentFacory{

        fun create(
            @BindsInstance context: Context,
            @BindsInstance currenttime: CurrentTime
        ): ApplicationComponent

    }

}