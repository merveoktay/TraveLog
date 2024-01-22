package com.example.travelog.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.travelog.R
import com.example.travelog.theme.Icon_color
import com.example.travelog.theme.Second_background_color
import com.example.travelog.theme.TraveLogTheme

@Composable
fun CustomBottomAppBar(){
    Scaffold (  modifier = Modifier
        .height(85.dp) // height size comes from out
        .fillMaxWidth(), containerColor = Second_background_color, contentColor = Icon_color
    ){ it->
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
        ) {
            IconButton(R.drawable.dark_home_icon)
            IconButton(R.drawable.dark_plus_icon)
            IconButton(R.drawable.dark_profile_icon)
            IconButton(R.drawable.dark_heart_icon)
        }
    }
}

@Preview
@Composable
fun CustomBottomAppBarPreview(){
    TraveLogTheme {
        CustomBottomAppBar()
    }
}