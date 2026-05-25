package me.egil.fotosmarteapp.ui.screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

import java.io.IOException;

import me.egil.fotosmarteapp.network.MarsApi;

class MarsViewModel : ViewModel(){

    var marsUiState: MarsUiState by mutableStateOf(MarsUiState.Loading)


    init {
        getMarsPhotos()
    }

    fun getMarsPhotos(){
        viewModelScope.launch{
            try {
                marsUiState = MarsUiState.Success(MarsApi.retrofitService.getPhotos())

            }catch (e:IOException){
                marsUiState = MarsUiState.Error
            }
        }
    }
}

sealed interface MarsUiState{
    data class Success(val photos:String): MarsUiState
    object Error: MarsUiState
    object Loading: MarsUiState
}