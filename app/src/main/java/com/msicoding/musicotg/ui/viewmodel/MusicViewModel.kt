package com.msicoding.musicotg.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.msicoding.musicotg.data.local.remote.model.SpotifyTrack
import com.msicoding.musicotg.data.repository.MusicRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MusicViewModel @Inject constructor(
    private val repository: MusicRepository
) : ViewModel() {

    private val _musicList = mutableListOf<SpotifyTrack>()
    val musicList: List<SpotifyTrack> get() = _musicList

    init {
        fetchMusic()
    }

    private fun fetchMusic() {
        viewModelScope.launch {
            _musicList.clear()
            _musicList.addAll(repository.getMusic())
        }
    }
}
