package com.example.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Quadrant(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Quadrant(modifier: Modifier = Modifier) {
    Column(modifier.fillMaxSize()) {
        Row(modifier.weight(1f)) {
            InfoCard(
                colorCode = 0xFFEADDFF,
                header = stringResource(R.string.first_title),
                body = stringResource(R.string.first_description),
                modifier = modifier.weight(1f)
            )
            InfoCard(
                colorCode = 0xFFD0BCFF,
                header = stringResource(R.string.second_title),
                body = stringResource(R.string.second_description),
                modifier = modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            InfoCard(
                colorCode = 0xFFB69DF8,
                header = stringResource(R.string.third_title),
                body = stringResource(R.string.third_description),
                modifier = modifier.weight(1f)
            )
            InfoCard(
                colorCode = 0xFFF6EDFF,
                header = stringResource(R.string.fourth_title),
                body = stringResource(R.string.fourth_description),
                modifier = modifier.weight(1f)
            )
        }
    }
}

@Composable
fun InfoCard(colorCode: Long, header: String, body: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(colorCode))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = header,
            modifier = modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )
        Text(
            text = body,
            textAlign = TextAlign.Justify,
            color = Color.Black
        )
    }
}