package com.msicoding.musicotg.data.local.remote.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SpotifyTrack(
    @PrimaryKey val id: String,
    val name: String,
    val artists: List<String>,
    val album: String,
    val durationMs: Long,
    val previewUrl: String
)
