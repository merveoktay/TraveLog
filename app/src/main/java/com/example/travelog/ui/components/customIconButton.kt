package com.example.travelog.ui.components

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.travelog.R
import com.example.travelog.theme.Icon_color
import com.example.travelog.theme.TraveLogTheme

@Composable
fun IconButton(iconRes:Int){//icon id and onClick methods come from out
    androidx.compose.material3.IconButton(onClick = {}, modifier = Modifier) {
        Icon(painterResource(id = iconRes), contentDescription = null, tint = Icon_color)
    }
}
@Preview
@Composable
fun IconButtonPreview(){
    TraveLogTheme {
        IconButton(R.drawable.dark_plus_icon)
    }
}