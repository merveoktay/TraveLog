package com.example.travelog.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.toFontFamily
import androidx.compose.ui.tooling.preview.Preview
import com.example.travelog.R
import com.example.travelog.theme.Text_hint_color
import com.example.travelog.theme.White_color

@Composable
fun DataTextField(hintText: String, withIcon: Boolean) {
    Row(modifier = Modifier.background(White_color)) {
        TextField(
            value = "", onValueChange = {}, modifier = Modifier.background(
                White_color,
                RoundedCornerShape(12)
            ), placeholder = {
                Text(
                    text = hintText, color = Text_hint_color, modifier = Modifier.background(
                        White_color
                    ), fontFamily = Font(R.font.fredoka_medium).toFontFamily()
                )
            }
        )
       // OutlinedTextField(value = "", onValueChange ={} )
        if (withIcon)
            CustomIconButton(iconRes = R.drawable.ic_search)
    }


}

@Preview
@Composable
fun DataTextFieldPreview() {
    DataTextField(hintText = "Name", true)
}