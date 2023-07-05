package com.example.practicecomposebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practicecomposebasics.ui.theme.PracticeComposeBasicsTheme

class ComposeQuadrant: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticeComposeBasicsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quadrant(
                        stringResource(R.string.text_composable),
                        stringResource(R.string.details_text_composable),
                        stringResource(R.string.image_composable),
                        stringResource(R.string.details_image_composable),
                        stringResource(R.string.row_composable),
                        stringResource(R.string.details_row_composable),
                        stringResource(R.string.column_composable),
                        stringResource(R.string.details_column_composable)
                    )
                }
            }
        }
    }
}

@Composable
fun ComposableText(title: String, details: String, modifier: Modifier) {
    Box(modifier = modifier) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Text(
                text = details,
                textAlign = TextAlign.Justify
            )
        }
    }
}

@Composable
fun Quadrant(title1: String, details1: String,
             title2: String, details2: String,
             title3: String, details3: String,
             title4: String, details4: String) {

    Column {
        Row(
            modifier = Modifier
                .weight(1F, fill = true)
        ){
            ComposableText(title1, details1, modifier = Modifier
                .weight(1F, fill = true)
                .background(color = Color(0xFFEADDFF)))

            ComposableText(title2, details2, modifier = Modifier
                .weight(1F, fill = true)
                .background(color = Color(0xFFD0BCFF)))
        }

        Row (
            modifier = Modifier
                .weight(1F, fill = true)
        ){
            ComposableText(title3, details3, modifier = Modifier
                .weight(1F, fill = true)
                .background(color = Color(0xFFB69DF8)))

            ComposableText(title4, details4, modifier = Modifier
                .weight(1F, fill = true)
                .background(color = Color(0xFFF6EDFF)))
        }
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun Preview() {
    PracticeComposeBasicsTheme {
        Quadrant(
            stringResource(R.string.text_composable),
            stringResource(R.string.details_text_composable),
            stringResource(R.string.image_composable),
            stringResource(R.string.details_image_composable),
            stringResource(R.string.row_composable),
            stringResource(R.string.details_row_composable),
            stringResource(R.string.column_composable),
            stringResource(R.string.details_column_composable)
        )
    }
}