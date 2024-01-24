package com.example.travelog.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInVertically
import androidx.compose.runtime.Composable
import com.example.travelog.R
import com.example.travelog.utils.Constants.ANIMATED_BUTTON_DELAY
import com.example.travelog.utils.Constants.ANIMATED_TEXT_DELAY
import com.example.travelog.utils.Constants.INITIAL_OFFSET

@Composable
fun AnimatedButton(visible: Boolean, onClick: () -> Unit) {
    val buttonEnterTransition = fadeIn(
        animationSpec = tween(ANIMATED_TEXT_DELAY, ANIMATED_BUTTON_DELAY)
    ) + slideInVertically(
        initialOffsetY = { INITIAL_OFFSET },
        animationSpec = tween(ANIMATED_TEXT_DELAY, ANIMATED_BUTTON_DELAY)
    )

    AnimatedVisibility(
        visible = visible,
        enter = buttonEnterTransition,
    ) {
         IconButton(iconRes = R.drawable.dark_right_arrow)
    }
}