package com.example.travelog.ui.components

import androidx.compose.foundation.background
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.travelog.theme.Background_color
import com.example.travelog.theme.Icon_color
import com.example.travelog.theme.Logo_color
import com.example.travelog.theme.Text_color
import com.example.travelog.theme.TraveLogTheme

@Composable
fun CustomAlertDialog() {
    val openDialog = remember { mutableStateOf(true) }
    if (openDialog.value) {
        AlertDialog(
            modifier = Modifier.background(color = Color.Transparent),
            containerColor = Background_color,
            onDismissRequest = {
                openDialog.value = false
            },
            title = {
                Text(text = "Title", color = Text_color )
            },
            text = {
                Text(text = "Turned on by default", color = Logo_color)
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        openDialog.value = false
                    }
                ) {
                    Text("Confirm",color= Icon_color)
                }
            },
            dismissButton = {
                TextButton(
                    onClick = {
                        openDialog.value = false
                    }
                ) {
                    Text("Dismiss",color= Icon_color)
                }
            }
        )
    }
}
@Preview
@Composable
fun CustomAlertDialogPreview() {
    TraveLogTheme {
        CustomAlertDialog()
    }
}
