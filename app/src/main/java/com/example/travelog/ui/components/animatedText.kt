package com.example.travelog.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInVertically
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.example.travelog.R
import com.example.travelog.utils.Constants.ANIMATED_TEXT_DELAY
import com.example.travelog.utils.Constants.ANIMATED_DURATION
import com.example.travelog.utils.Constants.INITIAL_OFFSET

@Composable
fun AnimatedTitle(visible: Boolean) {
    val titleEnterTransition = fadeIn(
        animationSpec = tween(ANIMATED_DURATION, ANIMATED_TEXT_DELAY)
    ) + slideInVertically(
        initialOffsetY = { -INITIAL_OFFSET },
        animationSpec = tween(ANIMATED_DURATION, ANIMATED_TEXT_DELAY)
    )

    AnimatedVisibility(
        visible = visible,
        enter = titleEnterTransition,
    ) {
        Text(
            text = stringResource(R.string.app_name),
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Center
        )
    }
}