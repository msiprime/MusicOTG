package com.msicoding.musicotg.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Singleton

// ApplicationComponent.kt
@Singleton
@Component(modules = [ApiServiceModule::class])
interface ApplicationComponent {
    // Inject dependencies if needed

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }
}


@HiltAndroidApp
class MusicApplication : Application()
