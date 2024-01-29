

package com.example.travelog.ui.components

import androidx.compose.foundation.background
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.travelog.R
import com.example.travelog.theme.Icon_color
import com.example.travelog.theme.Second_background_color
import com.example.travelog.theme.Text_color
import com.example.travelog.theme.Text_hint_color
import com.example.travelog.theme.White_color

@Composable
fun DataTextField(hintText: String, iconRes: Int) {
    OutlinedTextField(value = "", onValueChange = {}, leadingIcon = {
           Icon(painter = painterResource(id = iconRes), contentDescription ="", tint = Icon_color )

    },placeholder = {
        Text(
            text = hintText, style = MaterialTheme.typography.bodyMedium,
            color = Text_hint_color
        )
    },

        colors = OutlinedTextFieldDefaults.colors(
            contentColorFor(backgroundColor = White_color),
            cursorColor = MaterialTheme.colorScheme.primary,
            focusedBorderColor = Icon_color,
            unfocusedBorderColor = Second_background_color,
            unfocusedLabelColor = Text_hint_color
        ), modifier = Modifier.background(White_color)
    )


}

@Preview
@Composable
fun DataTextFieldPreview() {
    DataTextField(hintText = "Name", iconRes = R.drawable.ic_person)
}