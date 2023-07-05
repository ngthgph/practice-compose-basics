package com.example.practicecomposebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicecomposebasics.ui.theme.PracticeComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticeComposeBasicsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(name = stringResource(R.string.jetpack_compose),
                        intro = stringResource(R.string.a_modern_toolkit),
                        detail = stringResource(R.string.build_a_simple_ui)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingImage(modifier: Modifier = Modifier) {
    Box {
        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = null
        )
    }
}

@Composable
fun GreetingText(name: String, intro: String, detail: String, modifier: Modifier = Modifier) {
    Column {
        GreetingImage()

        Text(
            text = name,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp),
        )

        Text(
            text = intro,
            modifier = Modifier.padding(
                start = 16.dp,
                end = 16.dp
            ),
            textAlign = TextAlign.Justify
        )

        Text(
            text = detail,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true)
@Composable
fun GreetingPreview() {
    PracticeComposeBasicsTheme {
        GreetingText(name = stringResource(R.string.jetpack_compose),
            intro = stringResource(R.string.a_modern_toolkit),
            detail = stringResource(R.string.build_a_simple_ui)
        )
    }
}