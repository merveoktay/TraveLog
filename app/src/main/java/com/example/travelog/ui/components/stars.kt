package com.example.travelog.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.travelog.R
import com.example.travelog.theme.Primary_color

@Composable
fun Stars() {
    Row {
        CustomStarIcon()
        CustomStarIcon()
        CustomStarIcon()
        CustomStarIcon()
        CustomStarIcon()
    }
}

@Composable
fun CustomStarIcon() {
    var isFill: Boolean = false
    var iconRes: Int =R.drawable.ic_unfilled_star

    IconButton(onClick = {
        if (isFill) {
            isFill = false
            iconRes = R.drawable.ic_unfilled_star
        } else
            isFill = true
            iconRes = R.drawable.ic_filled_star
    }) {
        Icon(
            painterResource(id = iconRes),
            contentDescription = null,
            tint = Primary_color
        )
    }
}

@Preview
@Composable
fun StarsPreview() {
    Stars()
}