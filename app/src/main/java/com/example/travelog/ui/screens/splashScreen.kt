package com.example.travelog.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.travelog.R
import com.example.travelog.theme.TraveLogTheme
import com.example.travelog.theme.splash_screen_color
import com.example.travelog.ui.components.AnimatedImage
import com.example.travelog.ui.components.AnimatedTitle
import com.example.travelog.ui.components.IconButton

@Composable
fun SplashScreen() {
    val visible = remember { mutableStateOf(false) }

    LaunchedEffect(true) {
        visible.value = true
    }

    WelcomeScreenContent(visible = visible.value) {

    }
}

@Composable
fun WelcomeScreenContent(
    visible: Boolean,
    onGetStarted: () -> Unit
) {
    Surface {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(splash_screen_color)
        ) {
            Spacer(modifier = Modifier.height(100.dp))
            AnimatedTitle(visible = visible)
            Spacer(modifier = Modifier.height(50.dp))
            AnimatedImage(visible = visible)

            Column(
                horizontalAlignment = Alignment.End,
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        splash_screen_color
                    ).padding(50.dp)
            ) {
                IconButton(iconRes = R.drawable.dark_right_arrow)
            }

        }
    }
}

@Preview(name = "Welcome")
@Composable
fun WelcomeScreenPreview() {
    TraveLogTheme {
        WelcomeScreenContent(visible = true){}
    }
}