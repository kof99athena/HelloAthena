package com.athena.helloathena

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import androidx.compose.ui.unit.sp
import com.athena.helloathena.ui.theme.HelloAthenaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { //기본적으로 표시 될 화면
            HelloAthenaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}
//1. onCreate에서 바로 코딩을 하지 않는다.
//Greeting이라는 함수를 만들어두고(컴포저블함수), 이것을 @프리뷰 @컴포저블 함수에 테마를 지정하고 코드를 넣어서 프리뷰를 본다.

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!\nHello $name!\nHello $name!",
        modifier = Modifier.size(300.dp),
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Cursive, //폰트 종류
        letterSpacing = 2.sp, //글자간격을 말함. padding이 아니다.
        maxLines = 2,
        textDecoration = TextDecoration.Underline,
        textAlign = TextAlign.End //컨텐츠 사이즈만
    // 큼 나온다. modifire의 세로크기를 300dp로 만듬
    )
}

@Preview(showBackground = true)
//xml 파일이 아닌데도 프리뷰를 볼 수 있다. split으로 화면을 바로 볼수있다.
@Composable
fun GreetingPreview() {
    HelloAthenaTheme {
        Greeting("android")
    }
}