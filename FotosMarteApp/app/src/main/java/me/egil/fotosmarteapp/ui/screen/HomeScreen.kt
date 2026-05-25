package me.egil.fotosmarteapp.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen (marsUiState: MarsUiState, modifier: Modifier = Modifier){
    Column(modifier = modifier.fillMaxSize() ,verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) { }
    when (marsUiState){
        is MarsUiState.Error -> ErrorScreen()
        is MarsUiState.Loading -> LoadingScreen()
        is MarsUiState.Success -> ResultScreen(marsUiState.photos.size.toString())
    }
}

@Composable
fun ResultScreen(text: String){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(text = text)
    }
}

@Composable
fun LoadingScreen(){
    Text("PANTALLA DE CARGA .......")
}

@Composable
fun ErrorScreen(){
    Text("PANTALLA DE ERROR .......")
}