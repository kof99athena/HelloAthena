package com.athena.helloathena

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MovableContent
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
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
        setContent {
            HelloAthenaTheme {
                BoxEx()
            }//HelloAthenaTheme
        }//setContent
    }//onCreate
}//Activity class
//1. 그냥 박스
//2. frameLayout처럼 중첩용도로 쓰는경우
@Composable
//@Composable 주석은 UI 구성요소를 다루기 위해 쓴다.
//내가만든 컴포저블 함수는 ModifierEx()이다
fun BoxEx() {
//    Box(modifier = Modifier.size(100.dp)) {
//        Text(text = "Hello World", modifier = Modifier.align(Alignment.End))
//    }

//    Box(modifier = Modifier.size(100.dp)) {
//        Text(text = "Hello World", modifier = Modifier.align(Alignment.BottomEnd))
//        Text(text = "Jetpack", modifier = Modifier.align(Alignment.CenterEnd))
//        Text(text = "Compose", modifier = Modifier.align(Alignment.TopStart))
//    }

//    Box(modifier = Modifier.size(100.dp)) {
//        Box(modifier = Modifier.size(70.dp).background(Color.Cyan).align(Alignment.CenterStart))
//        Box(modifier = Modifier.size(70.dp).background(Color.Blue).align(Alignment.BottomEnd))
//
//    }

    Box {
        Box(modifier = Modifier.matchParentSize().background(Color.Cyan).align(Alignment.CenterStart))
        //부모 사이즈를 match로 하면 자식 사이즈에 맞춘다
        Box(modifier = Modifier.size(70.dp).background(Color.Blue).align(Alignment.CenterStart))

    }



}//ModifierEx method

@Preview(showBackground = true)
//xml 파일이 아닌데도 프리뷰를 볼 수 있다. split으로 화면을 바로 볼수있다.
@Composable
fun GreetingPreview() {
    HelloAthenaTheme {
        BoxEx()
    }
}