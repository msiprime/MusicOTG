package com.msicoding.musicotg.di

import com.msicoding.musicotg.data.local.remote.SpotifyApiService
import com.msicoding.musicotg.data.local.remote.model.SpotifyTrack
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object ApiServiceModule {

    @Provides
    @Singleton
    fun provideSpotifyApiService(): SpotifyApiService {
        return Retrofit.Builder()
            .baseUrl("https://v1.nocodeapi.com/msiprime/spotify/oYTOxBkvqvUTFRsf")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(SpotifyApiService::class.java)
    }
}

