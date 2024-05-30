package com.athena.helloathena

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NoLiveLiterals
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.athena.helloathena.ui.theme.HelloAthenaTheme

@NoLiveLiterals
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloAthenaTheme {
                ButtonExample(onButtonClicked = {
                    Toast.makeText(this, "Send Message", Toast.LENGTH_SHORT).show()
                })
            }//athena theme
        }
    }
}

@Composable
fun ButtonExample(onButtonClicked: () -> Unit) {
//    Button(onClick = onButtonClicked) {
//        Text(text = "Send")
//    }
    //1. 버튼 클릭 시 토스트 띄우기
//    Button(onClick = onButtonClicked) {
//        Text(text = "Send")
//    }

    //2. Icon 추가하기
    //modifier 추가하기
    //버튼에 enabled 속성 추가
    //shape 지정
    Button(
        onClick = onButtonClicked,
        enabled = true,
        border = BorderStroke(10.dp, Color.Magenta),
        shape = RoundedCornerShape(10.dp),
        contentPadding = PaddingValues(20.dp)
    ) {
        Icon(imageVector = Icons.Filled.Send, contentDescription = "Send message to user")
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text(text = "Send")
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloAthenaTheme {
        ButtonExample(onButtonClicked = {})
    }
}