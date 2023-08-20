package com.athena.helloathena

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
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
                ButtonExample(onButtonClicked = {
                    Toast.makeText(this, "send clicked", Toast.LENGTH_SHORT).show()
                })
            }
        }//setContent
    }//onCreate
}//Activity class

@Composable
//내가 만들어야할 컴포넌트
//버튼을 만들기위해서는 버튼을 만들고 onClick이벤트를 만들어야한다.
fun ButtonExample(onButtonClicked: () -> Unit) {
    //fun ButtonExample함수의 파라미터는 onButtonClicked이다
    //onButtonClicked는 onCreate에서 세팅할 수 있게 만들어둠.
    Button(onClick = onButtonClicked,
           enabled = true,
           border = BorderStroke(width = 10.dp, Color.Magenta),
           shape = RoundedCornerShape(0.dp,10.dp,0.dp,10.dp),
           contentPadding = PaddingValues(20.dp,10.dp), // contentPadding은 안의 아이콘이나 Text가 들어있는 영역의 padding을 말한다.

        )
     {
        //enabled에 false를 주게되면 버튼이 회색으로 변하고 클릭이 막힌다.
        //onCreate에 있는 onButtonClicked이 수행된다.
        Icon(
            //순서대로 들어가므로 Text위에 적어준다. 
            imageVector = Icons.Filled.Send,
            contentDescription = null //이게 무엇인지 설명을 적는곳이다.
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text(text = "send")
    }
}//ButtonExample method : 대문자인이유는?  다른 컴포넌트들과 구별하기 위해서 (원래 뷰프레임워크는 소문자로 함수를 쓴다.)

@Preview(showBackground = true)
//xml 파일이 아닌데도 프리뷰를 볼 수 있다. split으로 화면을 바로 볼수있다.
@Composable
fun GreetingPreview() {
    HelloAthenaTheme {
        ButtonExample(onButtonClicked = {})
    }
}