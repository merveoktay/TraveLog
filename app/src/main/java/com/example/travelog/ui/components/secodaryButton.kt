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
import com.example.travelog.theme.Secondary_color
import com.example.travelog.theme.Text_color
import com.example.travelog.theme.TraveLogTheme
import com.example.travelog.theme.White_color

@Composable
fun SecondaryButton(buttonText:String){
    // button size is not exist
    Button(onClick = { /*TODO*/ },
        colors= ButtonDefaults.buttonColors(White_color),
        modifier = Modifier.border(5.dp, Secondary_color, RoundedCornerShape(15.dp)),
        shape = RoundedCornerShape(15.dp)
    ) {
        Text(text = buttonText, color = Text_color)
    }
}
@Preview
@Composable
fun SecondaryButtonPreview(){
    TraveLogTheme {
        SecondaryButton("Sign In")
    }
}