package com.example.travelog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.example.travelog.theme.TraveLogTheme
import com.example.travelog.ui.components.Stars
import com.example.travelog.ui.screens.SplashScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TraveLogTheme {
                Column (modifier = Modifier
                    .fillMaxSize()){
                    Stars()
                }

            }
        }
    }
}

