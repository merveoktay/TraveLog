package com.example.travelog.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.travelog.theme.Primary_color
import com.example.travelog.theme.Secondary_color
import com.example.travelog.theme.TraveLogTheme
import com.example.travelog.theme.White_color
import com.example.travelog.utils.Constants.BORDER_SIZE
import com.example.travelog.utils.Constants.ROUNDED_CORNER_SIZE

@Composable
fun PrimaryButton(buttonText:String){

    Button(onClick = { /*TODO*/ },
        colors= ButtonDefaults.buttonColors(Primary_color),
        modifier = Modifier.border(BORDER_SIZE.dp, Secondary_color, RoundedCornerShape(ROUNDED_CORNER_SIZE.dp)),
        shape = RoundedCornerShape(ROUNDED_CORNER_SIZE.dp)
    ) {
        Text(text = buttonText, color = White_color)
    }
}
@Preview
@Composable
fun ButtonPreview(){
    TraveLogTheme {
        PrimaryButton("Sign In")
    }
}