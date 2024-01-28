package com.example.travelog.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.travelog.R
import com.example.travelog.theme.Logo_color

@Composable
fun SignInScreen() {
    Surface {
        Column {
            Text(
                text = stringResource(id = R.string.app_name),
                style = MaterialTheme.typography.headlineLarge,
                textAlign = TextAlign.Center,
                fontFamily = Font(R.font.mansalva_regular).toFontFamily(),
                color = Logo_color
            )
            Spacer(modifier=Modifier.size(40.dp).fillMaxWidth())

        }
    }
}

@Preview
@Composable
fun SignInScreenPreview(){
    SignInScreen()
}