package com.msicoding.musicotg.data.repository


import com.msicoding.musicotg.data.local.remote.SpotifyApiService
import com.msicoding.musicotg.data.local.remote.model.SpotifyTrack
import javax.inject.Inject

class MusicRepository @Inject constructor(
    private val apiService: SpotifyApiService
) {

    suspend fun getMusic(): List<SpotifyTrack> {
        return try {
            apiService.getTracks()
        } catch (e: Exception) {
            // Handle API call error
            emptyList()
        }
    }
}
