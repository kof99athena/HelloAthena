package com.athena.surface

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.athena.surface.ui.theme.HelloAthenaTheme

//서피스 : 서피스는 머터리얼 디자인의 기본적인 패턴
//머터리얼 디자인의 핵심
//elevation,shape,order,color,background,
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloAthenaTheme {
                Greeting("Android")
            }//HelloAthenaTheme
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
//   Surface(
//       //서피스 : 패딩을 세팅하는 개념, Text 위에 패딩을 세팅하는것이다.
//       color = MaterialTheme.colorScheme.surface,//서피스 아래 그림이 있다고하면 거기까지는 전달되지 않는다.
//       modifier = Modifier.padding(5.dp)
//   ){
//       Text(
//           text = "Hello $name",
//           modifier = Modifier.padding(8.dp)
//       )
//   }

//    Surface(
//        modifier = Modifier.padding(5.dp),
//        shadowElevation = 10.dp //테두리 그림자
//        //tonalElevation = 10.dp 안쪽 그림자
//    ){
//        Text(
//            text = "Hello $name",
//            modifier = Modifier.padding(8.dp)
//        )
//    }

//    Surface(
//        border = BorderStroke(width = 2.dp, color = Color.Magenta),// 마젠타 컬러로 패딩
//        modifier = Modifier.padding(5.dp),//이거 없으면 패딩이 없어짐.
//        shadowElevation = 10.dp //테두리 그림자
//        //tonalElevation = 10.dp 안쪽 그림자
//    ){
//        Text(
//            text = "Hello $name",
//            modifier = Modifier.padding(8.dp)
//        )
//    }

//    Surface(
//        shape = CircleShape,
//        border = BorderStroke(width = 2.dp, color = Color.Magenta),// 마젠타 컬러로 패딩
//        modifier = Modifier.padding(5.dp),//이거 없으면 패딩이 없어짐.
//        shadowElevation = 10.dp //테두리 그림자
//        //tonalElevation = 10.dp 안쪽 그림자
//    ){
//        Text(
//            text = "Hello $name",
//            modifier = Modifier.padding(8.dp)
//        )
//    }

    Surface(
        border = BorderStroke(width = 2.dp, color = Color.Magenta),// 마젠타 컬러로 패딩
        modifier = Modifier.padding(5.dp),//이거 없으면 패딩이 없어짐.
        shadowElevation = 10.dp, //테두리 그림자
        //tonalElevation = 10.dp 안쪽 그림자
        color = MaterialTheme.colorScheme.secondary
    ){
        Text(
            text = "Hello $name",
            modifier = Modifier.padding(8.dp)
        )
    }
}//Greeting method

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloAthenaTheme {
        Greeting("Android")
    }
}