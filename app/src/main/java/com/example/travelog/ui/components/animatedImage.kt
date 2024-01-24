package com.example.travelog.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.travelog.R
import com.example.travelog.utils.Constants.ANIMATED_IMAGE_DURATION

@Composable
fun AnimatedImage(visible: Boolean) {
    val imageEnterTransition = fadeIn(
        animationSpec = tween(ANIMATED_IMAGE_DURATION)
    )

    AnimatedVisibility(
        visible = visible,
        enter = imageEnterTransition,
    ) {
        Image(
            painter = painterResource(R.drawable.splash_image),
            contentDescription = "",
            modifier = Modifier
                .fillMaxHeight(0.6f)
                .fillMaxWidth()
        )
    }
}