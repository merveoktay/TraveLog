package com.example.travelog.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travelog.R
import com.example.travelog.theme.Logo_color
import com.example.travelog.theme.Text_hint_color
import com.example.travelog.ui.components.DataTextField
import com.example.travelog.ui.components.PrimaryButton
import com.example.travelog.utils.Constants.FONT_SIZE_LARGE
import com.example.travelog.utils.Constants.FONT_SIZE_MID
import com.example.travelog.utils.Constants.SPACER_LARGE
import com.example.travelog.utils.Constants.SPACER_MED
import com.example.travelog.utils.Constants.SPACER_MIN

@Composable
fun SignUpScreen() {
    Surface {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize().background(MaterialTheme.colorScheme.background)
        ) {
            Spacer(modifier = Modifier.height(200.dp))
            Text(
                text = stringResource(id = R.string.app_name),
                style = MaterialTheme.typography.headlineLarge,
                textAlign = TextAlign.Center,
                fontFamily = Font(R.font.mansalva_regular).toFontFamily(),
                color = Logo_color,
                fontSize = FONT_SIZE_LARGE.sp
            )
            Spacer(
                modifier = Modifier
                    .size(SPACER_LARGE.dp)
                    .fillMaxWidth()
            )
            DataTextField(hintText = stringResource(id = R.string.name), iconRes = R.drawable.ic_person)
            Spacer(
                modifier = Modifier
                    .size(SPACER_MIN.dp)
                    .fillMaxWidth()
            )
            DataTextField(hintText = stringResource(id = R.string.last_name),iconRes = R.drawable.ic_person)
            Spacer(
                modifier = Modifier
                    .size(SPACER_MIN.dp)
                    .fillMaxWidth()
            )
            DataTextField(hintText = stringResource(id = R.string.e_mail), iconRes = R.drawable.ic_email)
            Spacer(
                modifier = Modifier
                    .size(SPACER_MIN.dp)
                    .fillMaxWidth()
            )
            DataTextField(hintText = stringResource(id = R.string.password), iconRes = R.drawable.ic_lock)
            Spacer(
                modifier = Modifier
                    .size(SPACER_MED.dp)
                    .fillMaxWidth()
            )
            Box(modifier = Modifier.fillMaxWidth().padding(start=70.dp,end=70.dp)){
                PrimaryButton(buttonText = stringResource(id = R.string.sign_up))}
            Spacer(
                modifier = Modifier
                    .size(SPACER_MIN.dp)
                    .fillMaxWidth()
            )
            Text(
                text = stringResource(id = R.string.sign_in),
                style = MaterialTheme.typography.headlineLarge,
                textAlign = TextAlign.Right,
                fontFamily = Font(R.font.fredoka_medium).toFontFamily(),
                fontSize = FONT_SIZE_MID.sp,
                color = Text_hint_color
            )
        }
    }
}
@Preview
@Composable
fun SignUpScreenPreview() {
    SignUpScreen()
}