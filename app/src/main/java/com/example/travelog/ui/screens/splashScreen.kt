package com.example.travelog.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelog.R
import com.example.travelog.theme.Icon_color
import com.example.travelog.theme.TraveLogTheme
import com.example.travelog.theme.splash_screen_color
import com.example.travelog.ui.components.AnimatedImage
import com.example.travelog.ui.components.AnimatedTitle
import com.example.travelog.ui.components.CustomIconButton
import com.example.travelog.utils.Constants.FONT_SIZE_MIN

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

            Row(
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.Bottom,
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        splash_screen_color
                    )
                    .padding(30.dp)
            ) {

                    Text(text = stringResource(R.string.next), color = Icon_color, style = TextStyle(fontWeight = FontWeight.Bold, fontSize = FONT_SIZE_MIN.sp), modifier = Modifier.align(Alignment.Bottom).padding(bottom=15.dp), fontFamily = Font(R.font.fredoka_medium).toFontFamily())
                    CustomIconButton(iconRes = R.drawable.ic_arrow)


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