package com.example.dependencyinjectionstart.example2.di

import android.content.Context
import com.example.dependencyinjectionstart.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Module

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)

//    @Component.Builder
//    interface ApplicftionComponentBuilder{
//
//        @BindsInstance
//        fun context(context: Context) : ApplicftionComponentBuilder
//
//        @BindsInstance
//        fun currenttime(currenttime: CurrentTime): ApplicftionComponentBuilder
//
//        fun build(): ApplicationComponent
//
//
//    }

    @Component.Factory
    interface ApplicationComponentFacory{

        fun create(
            @BindsInstance context: Context,
            @BindsInstance currenttime: CurrentTime
        ): ApplicationComponent

    }

}