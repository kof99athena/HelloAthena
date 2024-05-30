package com.athena.helloathena

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
                ModifierEx()
            }//athena theme
        }
    }
}

@Composable
fun ModifierEx() {
    Button(
        onClick = {},
        modifier = Modifier
            .size(200.dp)
            .padding(30.dp),
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.Magenta, containerColor = Color.Cyan
        )
    ) {
        Icon(imageVector = Icons.Filled.Search, contentDescription = "search button", modifier = Modifier.background(
            Color.Blue
        ))
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing).background(Color.Yellow))
        Text(text = "Search items", Modifier.offset(x = 10.dp, y = 10.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloAthenaTheme {
        ModifierEx()
    }
}