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
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
                ModifierEx()
            }//HelloAthenaTheme
        }//setContent
    }//onCreate
}//Activity class

@Composable
//내가만든 컴포저블 함수는 ModifierEx()이다
fun ModifierEx() {
    //기본 왼쪽 상단에 위치함
    Button(
        //버튼 색상을 바꿀때
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Red, //버튼 자체의 컬러
            contentColor = Color.Cyan //Text컬러
            //버튼의 배경색은 color안에 파라미터값으로 넣어줘야한다.
            //modifier에서 배경색은 UI 전체 틀을 말한다. (배경그림)  버튼의 색깔이 아니다.
            //버튼 색깔은 colors에서 바꾼다!
        ),
        enabled = true,
        onClick = {},
        modifier = Modifier
            .size(200.dp)
            .padding(10.dp, 10.dp, 30.dp, 20.dp).background(Color.DarkGray)
        //modifier background는 요소의 배경색을 말한다.
        //modifier에서 size는 버튼 크기를 말하고, padding은 겉에 큰 화면에서의 버튼과 떨어진 크기를 말한다.
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null, //아이콘과 Text가 같은 상황이므로 굳이 쓰지말자
            modifier = Modifier.background(Color.Blue)
        )
        Spacer(modifier = Modifier
            .size(ButtonDefaults.IconSpacing)
            .background(Color.Yellow))
        Text(
            text = "Search",
            //modifier = Modifier.clickable {  } 버튼 자체가 눌리는게 아니다. 텍스트가 눌려진다.
            modifier = Modifier.offset(x = 50.dp, y = 50.dp) //스페이서 다음부터 x,y축에 얼마나 떨어져있는가
        )
    }

}//ModifierEx method

@Preview(showBackground = true)
//xml 파일이 아닌데도 프리뷰를 볼 수 있다. split으로 화면을 바로 볼수있다.
@Composable
fun GreetingPreview() {
    HelloAthenaTheme {
        ModifierEx()
    }
}