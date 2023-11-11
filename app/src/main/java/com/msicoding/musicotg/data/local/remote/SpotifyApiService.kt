package com.msicoding.musicotg.data.local.remote

import com.msicoding.musicotg.data.local.remote.model.SpotifyTrack
import retrofit2.http.GET

interface SpotifyApiService {

    @GET("v1.nocodeapi.com/msiprime/spotify/oYTOxBkvqvUTFRsf")
    suspend fun getTracks(): List<SpotifyTrack>
}

//


